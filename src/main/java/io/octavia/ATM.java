package io.octavia;

import java.io.InputStream;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        if (!haveAccount(scanner)) {
            createAccount(scanner);
        } else {
            System.out.println("account holder: ");
        }
//        boolean validAccNumber = new Bank(AccNumber).validateAccNumber();
    }

    static boolean haveAccount(Scanner scanner) {
        System.out.print("Do you have an account: ");
        String haveAccount = scanner.nextLine();

        if (haveAccount.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    static void createAccount(Scanner scanner) {
        ValidateInput validate = new ValidateInput();
        String name;
        String surname;

        while(true) {
            System.out.print("name: ");
            name = scanner.nextLine();
            if (validate.validateName(name)) {
                break;
            }
        }

        while(true) {
            System.out.print("surname: ");
            surname = scanner.nextLine();
            if (validate.validateName(surname)) {
                break;
            }
        }
        String info = String.format("NAME :: %s\nSURNAME :: %s",name, surname);
        System.out.println(info);

    }

}
