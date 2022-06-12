package io.octavia;

import java.util.ArrayList;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private String email;
    private String phone;
    private String id;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Account(String name, String surname, String email, String phone, String id) {
        this.accountNumber = "44562654";
        this.accountHolder = String.format("%s %s",name, surname);
        this.email = email;
        this.phone = phone;
        this.id = id;

        addAccount();
    }

    void addAccount() {
        this.accounts.add(this);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

}
