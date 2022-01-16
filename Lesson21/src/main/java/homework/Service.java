package homework;

import lombok.Getter;
import lombok.Setter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

@Getter
@Setter
public class Service {
    PreparedStatement preparedStatement = null;
    PreparedStatement preparedStatement2 = null;
    ResultSet resultSet = null;

    public Service() {
    }

    public void showBestStudent() {
        Connection connection = Helpers.getConnection();
        try {
            preparedStatement = connection.prepareStatement("select name from student where rating = (select max(rating) from student)");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " has max rating!");
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

    public void showWorstStudent() {
        Connection connection = Helpers.getConnection();
        try {
            preparedStatement = connection.prepareStatement("select name from student where rating = (select min(rating) from student)");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " has min rating!");
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

    public void showInfoStudentsE01Group() {
        Connection connection = Helpers.getConnection();
        try {
            preparedStatement = connection.prepareStatement("select count(name) from student where group_ID = 1;");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Group \"E01\" consists of " + resultSet.getInt(1) + " students. ");
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
        Connection connection2 = Helpers.getConnection();
        try {
            preparedStatement = connection2.prepareStatement("select avg(rating) from student where group_ID = 1;");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Average rating \"E01\" group - " + resultSet.getDouble(1) + "!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection2.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void showInfoStudentsE02Group() {
        Connection connection = Helpers.getConnection();
        try {
            preparedStatement = connection.prepareStatement("select count(name) from student where group_ID = 2;");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Group \"E02\" consists of " + resultSet.getInt(1) + " students. ");
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
        Connection connection2 = Helpers.getConnection();
        try {
            preparedStatement = connection2.prepareStatement("select avg(rating) from student where group_ID = 2;");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Average rating \"E02\" group - " + resultSet.getDouble(1) + "!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection2.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void showInfoStudentsE03Group() {
        Connection connection = Helpers.getConnection();
        try {
            preparedStatement = connection.prepareStatement("select count(name) from student where group_ID = 3;");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Group \"E03\" consists of " + resultSet.getInt(1) + " students. ");
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
        Connection connection2 = Helpers.getConnection();
        try {
            preparedStatement = connection2.prepareStatement("select avg(rating) from student where group_ID = 3;");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Average rating \"E03\" group - " + resultSet.getDouble(1) + "!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection2.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void showStudentsE01GroupWithRatingAboveAverage() {
        Connection connection = Helpers.getConnection();
        System.out.println("Students \"E01\" group with rating above average: ");
        try {
            preparedStatement = connection.prepareStatement("select name from student where group_ID = 1 AND rating > (select avg(rating) from student where group_ID = 1);");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("- " + resultSet.getString(1));
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

    public void showStudentsE02GroupWithRatingAboveAverage() {
        Connection connection = Helpers.getConnection();
        System.out.println("Students \"E02\" group with rating above average: ");
        try {
            preparedStatement = connection.prepareStatement("select name from student where group_ID = 2 AND rating > (select avg(rating) from student where group_ID = 2);");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("- " + resultSet.getString(1));
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

    public void showStudentsE03GroupWithRatingAboveAverage() {
        Connection connection = Helpers.getConnection();
        System.out.println("Students \"E03\" group with rating above average: ");
        try {
            preparedStatement = connection.prepareStatement("select name from student where group_ID = 3 AND rating > (select avg(rating) from student where group_ID = 3);");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("- " + resultSet.getString(1));
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

    public void showMorePopularCourse() {
        Connection connection = Helpers.getConnection();
        int countCourseBasik = 0;
        int countCoursePro = 0;
        try {
            preparedStatement = connection.prepareStatement("select count(student_ID) from studentscources where course_ID = 1;");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                countCourseBasik = resultSet.getInt(1);
            }
            preparedStatement2 = connection.prepareStatement("select count(student_ID) from studentscources where course_ID = 2;");
            resultSet = preparedStatement2.executeQuery();
            if (resultSet.next()) {
                countCoursePro = resultSet.getInt(1);
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
        if (countCourseBasik > countCoursePro) {
            System.out.println("Course java basic more popular than java pro!");
        } else if (countCourseBasik < countCoursePro) {
            System.out.println("Course java pro more popular than java basic!");
        } else {
            System.out.println("All courses are popular!");
        }
    }

    public void showMorePopularMark() {
        Connection connection = Helpers.getConnection();
        int[] marks = null;
        try {
            preparedStatement = connection.prepareStatement("select count(rating) from student;");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                marks = new int[resultSet.getInt(1)];
            }
            preparedStatement2 = connection.prepareStatement("select rating from student;");
            resultSet = preparedStatement2.executeQuery();
            for (int i = 0; i < marks.length; i++) {
                if (resultSet.next()) {
                    marks[i] = resultSet.getInt(1);
                }
            }
            Arrays.sort(marks);
            System.out.println(Arrays.toString(marks));
            System.out.println("The most popular mark is 6"); //не получается придумать как найти самое часто встречаемое число
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
