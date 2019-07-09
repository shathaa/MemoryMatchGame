/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorymatchgame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Score {

    int scoreId;
    int point;
    int highscore;
    int totalScore;
    String username;

    public Score() {
    }

    public int getScoreId() {
        return scoreId;
    }

    public int getPoint() {
        return point;
    }

    public int getHighscore() {
        return highscore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String getUsername() {
        return username;
    }


    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }
    

    public void setPoint(int point) {
        this.point = point;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void setUsername(String username) {
        this.username = username;
    }


//    public void scoreInsert() {
//
//        Connection con = null;
//        PreparedStatement s = null;
//
//        try {
//            con = DBManager.getConnection();
//            
//            
//            
//            String query = "INSERT INTO score ( highscore,totalscore,username ) "
//                    + "VALUES ( ? , ? , ? )";
//            s = con.prepareStatement(query);
//
//            s.setString(1, "0");
//            s.setString(2, "0");
//            s.setString(3, "" + this.getUsername());
//
//            int result = s.executeUpdate();
//
//            if (result == 1) {
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//
//            if (s != null) {
//                {
//                    try {
//                        s.close();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//
//            if (con != null) {
//                {
//                    try {
//                        con.close();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//
//    }

     public void scoreUpdate(int point) {
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;

        try {

            con = DBManager.getConnection();
            String query1 = "SELECT highscore ,totalscore ,scoreid FROM score  WHERE username = ? ";
            s = con.prepareStatement(query1);

            s.setString(1, "" + this.getUsername());

            rs = s.executeQuery();

            if (rs.next()) {

                int highScore = rs.getInt(1);
                int totalscore = rs.getInt(2);
                int scoreid = rs.getInt(3);
                

                if (0 < point && point < highScore) {

                    String query2 = "UPDATE score SET highscore =? where username = ? and scoreid =?";
                    s = con.prepareStatement(query2);
                    s.setString(1, "" + point);
                    s.setString(2, "" + this.getUsername());
                    s.setString(3, "" + scoreid);
                    int rslt1 = s.executeUpdate();
                    setHighscore(point);

                }

                int newTotal = totalscore + point;
                String query3 = "UPDATE score SET totalscore =? where username = ? and scoreid=? ";
                s = con.prepareStatement(query3);
                s.setString(1, "" + newTotal);
                s.setString(2, "" + this.getUsername());
                s.setString(3, "" + scoreid);
                int rslt2 = s.executeUpdate();
                setTotalScore(newTotal);
                setHighscore(highScore);

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

    }

    public Vector<Score> searchScore() {
        Vector<Score> scoreList = new Vector<Score>();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;

        try {

            con = DBManager.getConnection();
            String query = "SELECT * FROM score ";
            s = con.prepareStatement(query);

            rs = s.executeQuery();

            while (rs.next()) {
                Score score = new Score();
                int scoreId = rs.getInt("scoreid");
                String username = rs.getString("username");
                int highScore = rs.getInt("highscore");
                int totalScore = rs.getInt("totalScore");
//               System.out.print(scoreId+" "+username+" "+highScore+" "+totalScore);
                score.setScoreId(scoreId);
                score.setHighscore(highScore);
                score.setTotalScore(totalScore);
                score.setUsername(username);
                scoreList.add(score);
                System.out.print(scoreList);
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
        return scoreList;
    }
}
