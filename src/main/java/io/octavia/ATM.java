package io.octavia;

import java.io.InputStream;
import java.util.Scanner;
import io.octavia.Bank;

public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static ValidateInput validate = new ValidateInput();

    public static void main(String[] args) {
        if (!haveAccount()) {
            Bank.createAccount();
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




}
