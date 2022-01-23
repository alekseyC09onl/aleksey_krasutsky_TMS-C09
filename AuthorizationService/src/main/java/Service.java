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
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    int count = 0;


    public void registrationUser(String login, String password, String name, int age) {
        Connection connection = Helpers.getConnection();
        if (validatePassword(password)) {
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
        } else {
            System.out.println("Пароль должен содержать большие и маленькие буквы латинского алфавита, цифры, и быть длиной от 8 до 20 символов!");
        }

    }

    public void loginToAccount(String login, String password) {
        Connection connection = Helpers.getConnection();
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
        Connection connection = Helpers.getConnection();
        String tempLogin = null;
        try {
            preparedStatement = connection.prepareStatement("select login from users where login = '" + login + "';");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                tempLogin = resultSet.getString(1);
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
        if (tempLogin != null) {
            return true;
        }
        return false;
    }

    public String getUsersPassword(String login) {
        Connection connection = Helpers.getConnection();
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
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return tempPassword;
    }

    public String getUsersName(String login) {
        Connection connection = Helpers.getConnection();
        String tempName = null;
        if (checkUserExist(login)) {
            try {
                preparedStatement = connection.prepareStatement("select firstname from users where login = '" + login + "';");
                resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    tempName = resultSet.getString(1);
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
        }
        return tempName;
    }

    public int getUsersAge(String login) {
        Connection connection = Helpers.getConnection();
        int tempAge = 0;
        if (checkUserExist(login)) {
            try {
                preparedStatement = connection.prepareStatement("select age from users where login = '" + login + "';");
                resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    tempAge = resultSet.getInt(1);
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
        }
        return tempAge;
    }


    public void changeAccountPassword(String login, String newPassword) {
        Connection connection = Helpers.getConnection();
        if (checkUserExist(login)) {
            if (getUsersPassword(login).equals(newPassword)) {
                System.out.println("Новый пароль должен отличаться от предыдущего!");
            } else if (validatePassword(newPassword)) {
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
            } else {
                System.out.println("Пароль должен содержать большие и маленькие буквы латинского алфавита, цифры, и быть длиной от 8 до 20 символов!");
            }

        } else {
            System.out.println("Пользователь " + login + " не существует!");
        }
    }

    public void changeAccountName(String login, String newName) {
        Connection connection = Helpers.getConnection();
        if (checkUserExist(login)) {
            if (getUsersName(login).equals(newName)) {
                System.out.println("Новое имя должно отличаться от предыдущего!");
            } else {
                try {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate("update users SET firstname = '" + newName + "' where login = '" + login + "';");
                    System.out.println("Имя успешно изменено.");
                } catch (SQLException e) {
                    System.out.println("Ошибка соединения с базой.");
                    e.printStackTrace();
                } finally {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

        } else {
            System.out.println("Пользователь " + login + " не существует!");
        }
    }

    public void changeUserAge(String login, int newAge) {
        Connection connection = Helpers.getConnection();
        if (checkUserExist(login)) {
            if (getUsersAge(login) == newAge) {
                System.out.println("Новый возраст должен отличаться от предыдущего!");
            } else {
                try {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate("update users SET age = '" + newAge + "' where login = '" + login + "';");
                    System.out.println("Возраст успешно изменен.");
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
            System.out.println("Пользователь " + login + " не существует!");
        }
    }

    public boolean validatePassword(String password) {
        if (password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}")) {
            return true;
        }
        return false;
        /*      (?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}

                (?=.*[0-9]) цифра должна появляться по крайней мере один раз
                (?=.*[a-z]) строчная буква должна появляться как минимум раз
                (?=.*[A-Z]) письмо с верхним регистром должно происходить по крайней мере один раз
                (?=.*[@#$%^&+=]) специальный символ должен появляться по крайней мере один раз
                (?=\\S+$) пробелы не разрешены во всей строке
                .{8,} не менее 8 символов                                                           */
    }

}
