package SuperandFinalKeywords;

// Q) Can we print something on console without using main method in Java?
public class Mainmethod {

    static {
        System.out.println("Hello world");
        System.exit(0); // Terminates the program before main() runs
    }

    public static void main(String[] args) {
        System.out.println("Hello from main method!");
    }
}


