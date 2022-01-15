package homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = Helpers.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM student");
            resultSet = preparedStatement.executeQuery();
            String name = "";
            int rating = 0;
            while (resultSet.next()) {
                name = resultSet.getString(2);
                rating = resultSet.getInt(3);
                System.out.println(name + " rating - " + rating);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

