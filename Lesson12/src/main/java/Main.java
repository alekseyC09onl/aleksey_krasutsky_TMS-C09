import task1.StringFormatter;
import task1.StringFormatterImpl;

public class Main {
    public static void main(String[] args) {
        StringFormatter stringFormatter = new StringFormatterImpl("gravitation");
        stringFormatter.cutString(3, 7);
    }
}
