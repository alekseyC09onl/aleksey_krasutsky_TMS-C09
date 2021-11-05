import service.Check;

public class Main {
    public static void main(String[] args) {
        String login = "Alex_763";
        String password = "123Qw_12";
        String confirmPassword = "123Qw_12";
        System.out.println(Check.checkAuthorization(login, password, confirmPassword));
    }
}
