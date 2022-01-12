package lesson;

import java.sql.*;

public class main1 {
    public static void main(String[] args) {
//        Connection connection = null;
        String urlDb = "jdbc:mysql://localhost:3306";
        String user = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(urlDb, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM table1");
            ResultSet resultSet = preparedStatement.executeQuery();
            String firstName = "";
            String lastname = "";

            while (resultSet.next()) {
                firstName = resultSet.getString(3);
                lastname = resultSet.getString(4);

            }
            System.out.println(firstName + " " + lastname);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            connection.close();
        }
    }

}
