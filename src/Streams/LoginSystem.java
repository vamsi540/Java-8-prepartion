package Streams;
import java.util.Scanner;
public class LoginSystem {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String validUser = "admin";
       String validPass = "password";
       int attempts = 0;
       while (attempts < 3) {
           System.out.print("Enter username: ");
           String username = sc.nextLine();
           System.out.print("Enter password: ");
           String password = sc.nextLine();
           if (username.equals(validUser) && password.equals(validPass)) {
               System.out.println("Welcome " + username + "!");
               sc.close();
               return;
           } else {
               System.out.println("Invalid credentials. Try again.");
               attempts++;
           }
       }
       System.out.println("Contact Admin");
       sc.close();
   }
}