package homework;

import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

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

    public static void printUniqueValues(String[] array1, String[] array2) {
        Set<String> namesList = new LinkedHashSet<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].equalsIgnoreCase(array1[i])) {
                    break;
                } else if (j == array2.length - 1) {
                    namesList.add(array1[i]);
                }
            }
        }
        for (int j = 0; j < array2.length; j++) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].equalsIgnoreCase(array2[j])) {
                    break;
                } else if (i == array1.length - 1) {
                    namesList.add(array2[j]);
                }
            }
        }
        for (String s : namesList) {
            System.out.println(s);
        }
    }
}
