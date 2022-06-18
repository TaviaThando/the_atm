package io.octavia;

import org.ietf.jgss.GSSName;

import java.util.Scanner;

public class GetInput {
    private ValidateInput validate = new ValidateInput();

    public String prompt(String arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s: ", arg);

        do {
            arg = scanner.nextLine();
        } while(!validate.validateName(arg));

        return arg;
    }

}
