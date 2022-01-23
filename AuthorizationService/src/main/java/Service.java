import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Service {
    Connection connection = Helpers.getConnection();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    int count = 0;

    public void registrationUser(String login, String password, String name, int age) {
        try {
            Statement statement = connection.createStatement(); //("INSERT INTO schema_authorization.users (login, password, firstname, age) VALUE ('alex', '12345', 'Alex', 24);");
            count = statement.executeUpdate("INSERT INTO schema_authorization.users (login, password, firstname, age) VALUE ('" + login + "', '" + password + "', '" + name + "', " + age + ");");
            System.out.println("Добавлен " + count + " пользователь: " + login);
        } catch (SQLException e) {
            System.out.println("Ошибка добавления, пользователь " + login + " уже существует!");
        }

    }
}
