package io.octavia;

public class Bank {


    static void createAccount() {
        GetInput input = new GetInput();
        System.out.println("\nCreate one...");

        String name = input.prompt("name");
        String surname = input.prompt("surname");
        String email = input.prompt("email");
        String phone = input.prompt("phone");
        String id = input.prompt("id");

        Account account = new Account(name, surname, email, phone, id);
        System.out.println(account.getAccountHolder());
    }

    public boolean validateAccNumber(){
        return false;
    }

    public boolean validatePin(){
        return false;
    }

}
