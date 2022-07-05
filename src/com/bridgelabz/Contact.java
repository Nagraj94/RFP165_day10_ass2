package com.bridgelabz;

public class Contact {

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
}
