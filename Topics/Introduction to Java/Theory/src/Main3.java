import java.util.Scanner;

public class Main3 {

    public static String prepareFullName(String firstName, String lastName) {
        String s;
        if(firstName == null) {
            s = lastName;
        }else if(lastName == null) {
            s = firstName;
        }else {
            s = firstName + " " + lastName;
        }
        return s;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        assert firstName != null;
        System.out.println(prepareFullName(firstName, lastName));
    }
}