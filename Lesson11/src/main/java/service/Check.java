package service;

public class Check {
    public static boolean checkAuthorization(String login, String password, String confirmPassword) {
        if (!checkSymbolsLoginAndPassword(login)) {
            try {
                throw new WrongLoginException("Login incorrect");
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        } else if (!checkSymbolsLoginAndPassword(password) | (!(password.equals(confirmPassword)))) {
            try {
                throw new WrongPasswordException("Password incorrect");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        } else {
            return true;
        }
        return false;
    }


    private static boolean checkSymbolsLoginAndPassword(String loginOrPassword) {
        if ((loginOrPassword.matches("[a-zA-z0-9_]+")) & (loginOrPassword.length() < 20)) {
            return true;
        } else {
            return false;
        }
    }
}
