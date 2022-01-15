package lesson;

import java.sql.*;

public class Main1 {
    public static void main(String[] args) {
        Connection connection = null;
        String urlDb = "jdbc:mysql://localhost:3306/schema_lesson21";
        String user = "root";
        String password = "root";
        try {
            connection = DriverManager.getConnection(urlDb, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student");
            ResultSet resultSet = preparedStatement.executeQuery();
            String name = "";
            int rating = 0;

            while (resultSet.next()) {
                name = resultSet.getString(2);
                rating = resultSet.getInt(3);
                System.out.println(name + " rating - " + rating);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
