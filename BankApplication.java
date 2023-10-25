import java.util.Scanner;

public class BankApplication {

 public static void main(String[] args) {
  try (Scanner sc = new Scanner(System.in)) {
   System.out.println("Enter your name: ");
   String name = sc.nextLine();
   System.out.println("Enter your ID: ");
   String customerId = sc.nextLine();
   BankAccount obj1 = new BankAccount(name, customerId);
   System.out.println("Account created for " + obj1.getName() + " with ID " + obj1.getCustomerId());
   obj1.showMenu();
  }
 }
}