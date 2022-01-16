package homework;

import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@UtilityClass

public class Helpers {
    public static Connection getConnection() {
        String url;
        String user;
        String password;
        Properties properties = new Properties();
        Connection connection = null;
        try (InputStream inputStream = Files.newInputStream(Path.of("C:\\Users\\Admin\\IdeaProjects\\aleksey_krasutsky_TMS-C09\\Lesson21\\src\\main\\resources\\connection.properties"))) {
            properties.load(inputStream);
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            connection = DriverManager.getConnection(url, user, password);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
