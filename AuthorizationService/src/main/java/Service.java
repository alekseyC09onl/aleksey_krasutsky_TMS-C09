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
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO schema_authorization.users (login, password, firstname, age) VALUE ('" + login + "', '" + password + "', '" + name + "', " + age + ");");
            System.out.println("Добавлен " + count + " пользователь: " + login);
        } catch (SQLException e) {
            System.out.println("Ошибка добавления, пользователь " + login + " уже существует!");
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void loginToAccount(String login, String password) {
        String originPassword = null;
        try {
            preparedStatement = connection.prepareStatement("select password from users where login = '" + login + "';");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                originPassword = resultSet.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка соединения с базой.");
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (originPassword != null) {
            if (originPassword.equals(password)) {
                System.out.println("Вход успешно осуществлен");
            } else {
                System.out.println("Неверно введен пароль!");
            }
        } else {
            System.out.println("Ошибка, аккаунт " + login + " не существует.");
        }
    }

    public boolean checkUserExist(String login) {
        String tempLogin = null;
        try {
            preparedStatement = connection.prepareStatement("select login from users where login = '" + login + "';");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                tempLogin = resultSet.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка соединения с базой.");
        }
        if (tempLogin != null) {
            return true;
        }
        return false;
    }

    public String getUsersPassword(String login) {
        String tempPassword = null;
        if (checkUserExist(login)) {
            try {
                preparedStatement = connection.prepareStatement("select password from users where login = '" + login + "';");
                resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    tempPassword = resultSet.getString(1);
                }
            } catch (SQLException e) {
                System.out.println("Ошибка соединения с базой.");
            }
        }
        return tempPassword;
    }


    public void changeAccountPassword(String login, String newPassword) {
        if (checkUserExist(login)) {
            if (getUsersPassword(login).equals(newPassword)) {
                System.out.println("Новый пароль должен отличаться от старого!");
            } else {
                try {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate("update users SET password = '" + newPassword + "' where login = '" + login + "';");
                    System.out.println("Пароль успешно изменен.");
                } catch (SQLException e) {
                    System.out.println("Ошибка соединения с базой.");
                } finally {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

        } else {
            System.out.println("Пользователя " + login + " не существует!");
        }

    }
}
