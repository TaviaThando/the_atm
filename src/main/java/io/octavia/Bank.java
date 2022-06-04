package io.octavia;

public class Bank {
    private final String AccNumber;
    private String pin;
    public Bank(String AccNumber) {
        this.AccNumber = AccNumber;
    }

    public String getAccNumber() {
        return AccNumber;
    }

    public boolean validateAccNumber(){
//        System.out.println(getAccNumber());
        return false;
    }

    public boolean validatePin(){
        return false;
    }

}
