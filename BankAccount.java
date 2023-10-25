import java.util.Scanner;

public class BankAccount {
 double balance;
 double previousTransaction;
 String customerName;
 String customerId;

 BankAccount(String cname, String cid) {
  this.customerName = cname;
  this.customerId = cid;
 }

 void deposit(double amount) {
  if (amount != 0) {
   balance += amount;
   previousTransaction = amount;
  }
 }

 public String getCustomerId() {
  return customerId;
 }

 public String getName() {
  return customerName;
 }

 void withdraw(double money) {
  if (money != 0 && balance >= money) {
   balance -= money;
   previousTransaction = -money;
  } else {
   System.out.println("Insufficient Balance");
  }
 }

 void getPreviousTransaction() {
  if (previousTransaction > 0) {
   System.out.println("Deposited: " + previousTransaction);
  } else if (previousTransaction < 0) {
   System.out.println("Withdrawn: " + Math.abs(previousTransaction));
  } else {
   System.out.println("No transaction occured");
  }
 }

 void showMenu() {
  char option;
  try (Scanner sc = new Scanner(System.in)) {
   System.out.println("Welcome " + customerName);
   System.out.println("Your ID is " + customerId);
   System.out.println("\n");
   System.out.println("A. Check Balance");
   System.out.println("B. Deposit");
   System.out.println("C. Withdraw");
   System.out.println("D. Previous Transaction");
   System.out.println("E. Exit");

   do {
    System.out.println("====================================");
    System.out.println("Enter an option");
    System.out.println("====================================");
    option = sc.next().charAt(0);
    System.out.println("\n");

    switch (option) {
     case 'A':
      System.out.println("------------------------------------");
      System.out.println("Balance = " + balance);
      System.out.println("------------------------------------");
      System.out.println("\n");
      break;
     case 'B':
      System.out.println("------------------------------------");
      System.out.println("Enter an amount to deposit");
      System.out.println("------------------------------------");
      double amount = sc.nextDouble();
      deposit(amount);
      System.out.println("\n");
      break;
     case 'C':
      System.out.println("------------------------------------");
      System.out.println("Enter an amount to withdraw");
      System.out.println("------------------------------------");
      double money = sc.nextDouble();
      withdraw(money);
      System.out.println("\n");
      break;
     case 'D':
      System.out.println("------------------------------------");
      getPreviousTransaction();
      System.out.println("------------------------------------");
      System.out.println("\n");
      break;
     case 'E':
      System.out.println("************************************");
      break;
     default:
      System.out.println("Invalid Option! Please enter again");
      break;
    }
   } while (option != 'E');
  }
  System.out.println("Thank you for using our services");
 }
}
