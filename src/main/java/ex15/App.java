/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex15;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String password = myApp.getPassword();
        myApp.getCompare(password);
    }

    public String getPassword() {
        System.out.print("What is your username? ");
        in.nextLine();
        System.out.print("Whats is your password? ");
        return in.nextLine();
    }

    public void getCompare(String password) {
        if (password.equals("abc$123")) {
            System.out.print("Welcome!");
            System.exit(0);
        }
        System.out.print("I don't know you.");
    }
}


