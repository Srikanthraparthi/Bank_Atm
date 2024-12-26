// Bank.java
package org.jsp.bank;

public class Bank {
    String bname;
    String loc;
    String ifsc_code;
    Account a;

    public Bank(String bname, String loc, String ifsc_code) {
        this.bname = bname;
        this.loc = loc;
        this.ifsc_code = ifsc_code;
    }

    public void bankDetails() {
        System.out.println("Bank Name: " + bname);
        System.out.println("Location: " + loc);
        System.out.println("IFSC Code: " + ifsc_code);

        if (a != null) {
            System.out.println("Account Holder Name: " + a.account_holder_name);
            System.out.println("DOB: " + a.dob);
            System.out.println("PIN: " + a.pin);
            System.out.println("Balance: " + a.money);
        } else {
            System.out.println("Open your account first.");
        }
    }

    public void createAccount(Account a) {
        if (this.a == null) {
            this.a = a;
            System.out.println("Account created successfully.");
        } else {
            System.out.println("An account already exists.");
        }
    }

    public void deposit(long ano, double money) {
        if (a != null && a.ano == ano) {
            if (money > 0) {
                a.money += money;
                System.out.println("Deposited Amount: " + money);
                System.out.println("Total Balance: " + a.money);
            } else {
                System.out.println("Enter a valid amount to deposit.");
            }
        } else {
            System.out.println("Enter a valid account number.");
        }
    }

    public void withdraw(long ano, double money) {
        if (a != null && a.ano == ano) {
            if (money > 0 && a.money >= money) {
                a.money -= money;
                System.out.println("Withdrawal Amount: " + money);
                System.out.println("Total Balance: " + a.money);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        } else {
            System.out.println("Enter a valid account number.");
        }
    }

    public void deleteAccount() {
        if (a != null) {
            a = null;
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("No account exists to delete.");
        }
    }
}