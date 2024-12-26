// BankDriver.java
package org.jsp.bank;

import java.util.Scanner;

public class Bank_Driver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Bank Name to open Account:");
        String bname = s.next();
        System.out.println("Enter the Address of Bank:");
        String loc = s.next();
        System.out.println("Enter Bank IFSC Code:");
        String ifsc = s.next();

        Bank b = new Bank(bname, loc, ifsc);

        boolean option = true;
        while (option) {
            System.out.println("\nEnter the choice:");
            System.out.println("1. Create Account");
            System.out.println("2. Check Bank Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");

            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Name:");
                    String name = s.next();
                    System.out.println("Enter DOB:");
                    String dob = s.next();
                    System.out.println("Enter PIN:");
                    String pin = s.next();
                    System.out.println("Enter initial deposit:");
                    double money = s.nextDouble();
                    System.out.println("Enter Account Number:");
                    long ano = s.nextLong();
                    b.createAccount(new Account(name, dob, pin, money, ano));
                    break;
                case 2:
                    b.bankDetails();
                    break;
                case 3:
                    System.out.println("Enter Account Number to deposit:");
                    long depAno = s.nextLong();
                    System.out.println("Enter deposit amount:");
                    double depMoney = s.nextDouble();
                    b.deposit(depAno, depMoney);
                    break;
                case 4:
                    System.out.println("Enter Account Number to withdraw:");
                    long withAno = s.nextLong();
                    System.out.println("Enter withdrawal amount:");
                    double withMoney = s.nextDouble();
                    b.withdraw(withAno, withMoney);
                    break;
                case 5:
                    b.deleteAccount();
                    break;
                case 6:
                    System.out.println("Thank you for using " + bname + ". Have a good day!");
                    option = false;
                    break;
                default:
                    System.out.println("Enter a valid choice.");
                    break;
            }
        }
        s.close();
    }
}