// Account.java
package org.jsp.bank;

public class Account {
    String account_holder_name;
    String dob;
    String pin;
    double money;
    long ano;

    public Account(String account_holder_name, String dob, String pin, double money, long ano) {
        this.account_holder_name = account_holder_name;
        this.dob = dob;
        this.pin = pin;
        this.money = money;
        this.ano = ano;
    }

    public void accountDetails() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("DOB: " + dob);
        System.out.println("PIN: " + pin);
        System.out.println("Balance: " + money);
        System.out.println("Account No: " + ano);
    }
}