package io.octavia;

import java.io.InputStream;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("Running...");

        System.out.print("Account number: ");
        Scanner scanner = new Scanner(System.in);
        String AccNumber = scanner.nextLine();

        boolean validAccNumber = new Bank(AccNumber).validateAccNumber();

    }

}
