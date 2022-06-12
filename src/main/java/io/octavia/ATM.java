package io.octavia;

import java.io.InputStream;
import java.util.Scanner;

public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static ValidateInput validate = new ValidateInput();

    public static void main(String[] args) {
        if (!haveAccount()) {
            createAccount();
        } else {
            System.out.println("cool");
        }
    }

    static boolean haveAccount() {
        System.out.print("Do you have an account: ");
        String haveAccount = scanner.nextLine();

        if (haveAccount.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    static void createAccount() {
        GetInput input = new GetInput();
        System.out.println("\nCreate one...");

        // SHE SAID WE'LL FIND A WAY FOR THIS...
//        String[] args = {"name", "surname", "email", "phone", "id"};
//        for (String arg: args) {
//            arg = prompt(arg);
//        }
        String name = prompt("name");
        String surname = prompt("surname");
        String email = prompt("email");
        String phone = prompt("phone");
        String id = prompt("id");

        Account account = new Account(name, surname, email, phone, id);

        System.out.println(account.getAccounts().get(1).getAccountHolder());
    }

    static String prompt(String arg) {
        System.out.printf("%s: ", arg);
        do {
            arg = scanner.nextLine();
        } while(!validate.validateName(arg));

        return arg;
    }



}
