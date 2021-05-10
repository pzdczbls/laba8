package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ip address: ");
        String inp = in.nextLine();
        boolean res = inp.matches("(((1[0-9][0-9])|(2[0-5][0-5]))\\.){3}((1[0-9][0-9])|(2[0-5][0-5]))");
        if(res) {
            System.out.println("Ok.");
        }
        else {
            System.out.println("Error.");
        }
    }
}