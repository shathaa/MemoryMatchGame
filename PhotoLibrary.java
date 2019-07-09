package memorymatchgame;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PhotoLibrary {

    private String photoId;
    private String photoPath;

    public PhotoLibrary() 
    {

    }

    public PhotoLibrary(String photoId, String photoPath) {
        this.photoId = photoId;
        this.photoPath = photoPath;
    }
    
        public String getPhotoId() {
        return photoId;
    }


    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }


    public String getPhotoPath() {
        return photoPath;
    }


    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    

    public List <String> selectMonster() {

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        List<String> monsterList = null;

        
        try {
            monsterList = new ArrayList<String>();
            con = DBManager.getConnection();
            String query = "SELECT Path FROM photolibrary Where ID like ? ";
            s = con.prepareStatement(query);
            s.setString(1, "monster%");
            rs = s.executeQuery();
            
            while (rs.next()) 
            {

                monsterList.add(rs.getString("Path"));
                
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
        return monsterList;

    }

    public List <String> selectNumber() {

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        List<String> numbersList = null;

        
        try {
            numbersList = new ArrayList<String>();
            con = DBManager.getConnection();
            String query = "SELECT Path FROM photolibrary Where ID like ? ";
            s = con.prepareStatement(query);
            s.setString(1, "numbers%");
            rs = s.executeQuery();
            
            while (rs.next()) 
            {

                numbersList.add(rs.getString("Path"));
                
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
        return numbersList;
    }

    public List <String> selectLetter() {

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        List<String> lettersList = null;

        
        try {
            lettersList = new ArrayList<String>();
            con = DBManager.getConnection();
            String query = "SELECT Path FROM photolibrary Where ID like ? ";
            s = con.prepareStatement(query);
            s.setString(1, "letters%");
            rs = s.executeQuery();
            
            while (rs.next()) 
            {

                lettersList.add(rs.getString("Path"));
                
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
        return lettersList;


    }
    
    public String selectBack() {

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        String theCardBack = null;

        
        try {
            con = DBManager.getConnection();
            String query = "SELECT Path FROM photolibrary Where ID = ? ";
            s = con.prepareStatement(query);
            s.setString(1, "card_back_1");
            rs = s.executeQuery();
            
            while (rs.next()) 
            {

                 theCardBack = rs.getString("Path");
                
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
        return theCardBack;

    }







}
