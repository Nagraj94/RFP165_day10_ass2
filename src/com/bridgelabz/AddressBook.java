package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner sc = new Scanner(System.in);

    ArrayList<Contact> list = new ArrayList<Contact>();

    public void addNew() {
        System.out.println("Enter firstname");
        String firstName = sc.next();
        System.out.println("Enter lastname");
        String lastName = sc.next();
        System.out.println("Enter address");
        String address = sc.next();
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

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNo, email);
        list.add(contact);
    }

    public void editContact() {
        System.out.println("Enter first name and last name to edit your details");
        System.out.println("Enter first name");
        String firstName = sc.next();
        System.out.println("enter last name");
        String lastName = sc.next();
        for (Contact contact : list) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                contact.editExistingContact();
            }
            else {
                System.out.println("Contact not found");
            }
        }
    }

    public void addMultiple() {
        System.out.println("Enter number contact you have save ");
        int numOfContact;
        numOfContact = sc.nextInt();
        Contact contact = null;
        for (int i = 0; i < numOfContact; i++) {
            System.out.println("Enter firstname");
            String firstName = sc.next();
            System.out.println("Enter lastname");
            String lastName = sc.next();
            System.out.println("Enter address");
            String address = sc.next();
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

            contact = new Contact(firstName, lastName, address, city, state, zip, phoneNo, email);
            list.add(contact);
        }
    }

    public void deleteContact() {
        System.out.println("Enter first name and last name to delete your details ");
        System.out.println("Enter first name");
        String firstName = sc.next();
        System.out.println("enter last name");
        String lastName = sc.next();
        for (Contact contact : list) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                list.remove(contact);
            }
            else {
                System.out.println("Contact not found");
            }
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        while (true){
            System.out.println("enter 1 for add contact ");
            System.out.println("enter 2 for for edit contact details ");
            System.out.println("enter 3 for delete contact details ");
            System.out.println("enter 4 for add multiple contact");
            int check = sc.nextInt();
            if (check == 1)
            {
                addressBook.addNew();
            }
            else if (check == 2)
            {
                addressBook.editContact();
            }
            else if (check == 3)
            {
                addressBook.deleteContact();
            }
            else if (check == 4)
            {
                addressBook.addMultiple();
            }
            System.out.println(addressBook.list);
        }

    }
}