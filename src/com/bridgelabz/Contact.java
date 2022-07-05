package com.bridgelabz;

import java.util.Scanner;

public class Contact {
    Scanner sc = new Scanner(System.in);
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    int phoneNo;
    String email;

    public Contact(String firstName, String lastName, String address, String city, String state, int zip, int phoneNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName = " + firstName +
                ", lastName = " + lastName +
                ", address = " + address +
                ", city = " + city +
                ", state = " + state +
                ", zip = " + zip +
                ", phoneNo = " + phoneNo +
                ", email = " + email +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void editExistingContact(){
        System.out.println("Enter firstname");
        firstName = sc.next();
        System.out.println("Enter lastname");
        lastName = sc.next();
        System.out.println("Enter address");
        address =  sc.next();
        System.out.println("Enter city");
        city = sc.next();
        System.out.println("Enter state");
        state = sc.next();
        System.out.println("Enter zip code");
        zip = sc.nextInt();
        System.out.println("Enter your phone number");
        phoneNo = sc.nextInt();
        System.out.println("Enter email");
        email = sc.next();
    }
}
