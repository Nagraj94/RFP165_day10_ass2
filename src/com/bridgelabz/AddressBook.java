package com.bridgelabz;
import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname");
        String firstName = sc.next();
        System.out.println("Enter firstname");
        String lastName = sc.next();
        System.out.println("Enter address");
        String address =  sc.next();
        System.out.println("Enter city");
        String city = sc.next();
        System.out.println("Enter state");
        String state = sc.next();
        System.out.println("Enter zip code");
        int zip = sc.nextInt();
        System.out.println("Enter your phone number");
        int phoneNo = sc.nextInt();
        System.out.println("Enter email");
        String email = sc.next();
    }
}
