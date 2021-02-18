package com.company;

import java.sql.*;


public class NewsDB {
    public static boolean addNews(News news) {
        String sql = "INSERT INTO newsa(news_heading, news_text, publication_time)" +
                "VALUES(?, ?, now())";
        int result = 0;

        try (Connection conn = DataBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, news.getNewsHeading());
            stmt.setString(2, news.getNewsText());

            result = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }

    /*
     public static String getNewsHeading(News news) {
         String sql = "SELECT news_heading, news_text FROM newsa";
         int count = 0;
         try (Connection conn = DataBase.connect();
              Statement stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery(sql);) {
             rs.next();
             count = rs.getInt(2);
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
         return count ;


     }

     */
    public static News getNewsHeading(String newsHeading) {
        String sql = "SELECT news_heading FROM newsa" +
                "WHERE id = ?";
        News news = null;
        try (Connection conn = DataBase.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newsHeading);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    news.setId(rs.getInt("id"));
                    news.setNewsHeading(newsHeading);
                    news.setNewsText(rs.getString("news_text"));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return news;
    }
//
    public static int getNewsHeading(News news) {
        String sql = "DELETE FROM newsa, where id = 1";
        int count = 0;
        try (Connection conn = DataBase.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;


    }
}