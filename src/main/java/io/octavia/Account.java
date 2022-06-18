package io.octavia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
        // create account file for data persistence
        try {
            File accountFile = new File(String.format("%s_%s.txt",name,surname));
            if (accountFile.createNewFile()) {
                System.out.println("\nACCOUNT CREATED.");
            } else {
                System.out.printf("\n%s %s ALREADY HAS AN ACCOUNT.\n",name,surname);
            }
            storeAccountData(accountFile);

        } catch (IOException err) {
            System.out.println("ERROR CREATING ACCOUNT FILE: "+err.getMessage());
        }
    }


    private void storeAccountData(File accountFile) {
        try {
            FileWriter writer = new FileWriter(accountFile);
            String data = String.format("ACCOUNT HOLDER: %s\n" +
                    "ACCOUNT NUMBER: %s\n" +
                    "EMAIL: %s\n" +
                    "PHONE: %s\n" +
                    "ID: %s\n",
                    accountHolder, accountNumber, email, phone, id);
            writer.write(data);
            writer.close();

            System.out.println("SUCCESSFULLY STORED DATA.\n");
            readAccountData(accountFile);

        } catch (IOException err) {
            System.out.println("ERROR STORING DATA: "+err.getMessage());
        }
    }

    private void readAccountData(File accountFile) {
        try{
            Scanner reader = new Scanner(accountFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (IOException err) {
            System.out.println("ERROR READING DATA: "+err.getMessage());
        }
    }

    private void addAccount() {
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
