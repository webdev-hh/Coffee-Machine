public class InputClass {
    public static String getString() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

    public static void main(String[] args) {
        System.out.println("The input string: " + getString());
    }
}

