package memorymatchgame;

import java.sql.*;
import java.util.*;

public class UserInformation {

    private String username;
    private String password;
    private String score;
    private String useremail;

    public UserInformation() {

    }

    public UserInformation(String username, String password, String score, String useremail) {

        this.username = username;
        this.password = password;
        this.score = score;
        this.useremail = useremail;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getScore() {
        return score;
    }

    public String getUseremail() {
        return useremail;
    }

    public boolean searchUser(String username , String password ) {

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        boolean done = true;

        try {

            con = DBManager.getConnection();
            String query = "SELECT * FROM userinformation Where username = ? and password = ? ";
            s = con.prepareStatement(query);
            s.setString(1, username);
            s.setString(2, password);
            rs = s.executeQuery();

            if (rs.next()) {
                return done;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (rs != null) {
                {
                    try {
                        rs.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (s != null) {
                {
                    try {
                        s.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (con != null) {
                {
                    try {
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return done = false;

    }

    public boolean addNewUser(String username, String password, String email) {

        Connection con = null;
        PreparedStatement s = null;
        boolean done = true ;

        try {
            con = DBManager.getConnection();

            String query = "INSERT INTO userinformation (username , password , useremail ,score ) "
                    + "VALUES (? , ? , ? ,? );";
            
            s = con.prepareStatement(query);
 

            s.setString(1, username);
            s.setString(2, password);
            s.setString(3, email);
            s.setString(4, "0");
            int result = s.executeUpdate();

            
            String query2 = "INSERT INTO score ( highscore,totalscore,username ) "
                    + "VALUES ( ? , ? , ? )";
            s = con.prepareStatement(query2);

            s.setString(1, "0");
            s.setString(2, "0");
            s.setString(3, "" + username);

            int result2 = s.executeUpdate();
            
            if (result == 1 && result2==1 ) {
                return done ;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (s != null) {
                {
                    try {
                        s.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (con != null) {
                {
                    try {
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return done = false ;

    }

    public boolean selectscore(String username) {

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        boolean done = true ;

        try {

            con = DBManager.getConnection();
            String query = "SELECT score FROM userinformation Where username = ? ;";
            s = con.prepareStatement(query);
            s.setString(1, username);
            rs = s.executeQuery();

            if (rs.next()) {

                String score = rs.getString("score");
                return done ;

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            if (rs != null) {
                {
                    try {
                        rs.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (s != null) {
                {
                    try {
                        s.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (con != null) {
                {
                    try {
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return done = false ;

    }

    public boolean updateScore(String score, String username) {

        Connection con = null;
        PreparedStatement s = null;
        boolean done = true ;

        try {
            con = DBManager.getConnection();
            String query = "UPDATE userinformation SET score =? where username = ? ";
            s = con.prepareStatement(query);
            s.setString(1, score);
            s.setString(2, username);

            int rs = s.executeUpdate();
            if (rs == 1) {
                return done ;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (s != null) {
                {
                    try {
                        s.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (con != null) {
                {
                    try {
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }

        return done = false ;
    }

    
    public boolean deleteUser( String username ) {

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        boolean done = true ;

               try {

            con = DBManager.getConnection();
            
            String query2 = "DELETE FROM score WHERE username = ? ";
            s = con.prepareStatement(query2);
            s.setString(1, username );
            int rs2 = s.executeUpdate();
            
            
            String query1 = "DELETE FROM userinformation WHERE username = ?";
            s = con.prepareStatement(query1);
            s.setString(1, username );
            int rs1 = s.executeUpdate();
            
            if (rs1 == 1  && rs2 == 1 ) {

                return done;

            }
               }
         catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (s != null) {
                {
                    try {
                        s.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (con != null) {
                {
                    try {
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return done = false ;

    }
     
    
    public boolean isPasswordValid(String password , String passwordConf) {
        
        if(password.equals(passwordConf)) {
        int points = 0;
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }
        
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                points++;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                points++;
                break;
            }
        }
        if (points == 2) {
            return true;
        } }
        return false;
    }

    
    
    public boolean isValidEmail(String email) {
        
        if (email.length() > 0) {
            if (email.indexOf('@') == -1
                    || email.indexOf('@') != email.lastIndexOf('@')) {
                return false;
            }
            String name = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            if (domain.indexOf('.') == -1) {
                return false;
            }
        }
        return true;
    }
    
    public boolean resetPassword(String userName,String email ,String password ){
    
    Connection con = null;
        PreparedStatement s = null;
        boolean done = false ;

        try {
            con = DBManager.getConnection();
            String query = "UPDATE userinformation SET password = ? WHERE username = ? and useremail = ? ";
            s = con.prepareStatement(query);
            s.setString(1, password);
            s.setString(2, userName);
            s.setString(3, email);

            int rs = s.executeUpdate();
            if (rs == 1) {
                System.out.print(done);
                done =true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (s != null) {
                {
                    try {
                        s.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (con != null) {
                {
                    try {
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }

        return done ;
    }
    
    
    

}
