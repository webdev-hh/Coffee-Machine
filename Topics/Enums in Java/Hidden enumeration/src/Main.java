public class Main {

    public static void main(String[] args) {
        int counter = 0;
        for (Secret secret : Secret.values()) {
           // System.out.println(secret);
            if (secret.name().contains("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
/*
   enum Secret {
    STAR, CRASH, START, END // ...
}
 */
