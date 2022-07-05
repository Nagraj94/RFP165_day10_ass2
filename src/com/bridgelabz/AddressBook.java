package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
 ArrayList<Contact> list = new ArrayList();
 Scanner sc = new Scanner(System.in);
    public void addNew(){
     System.out.println("Enter firstname");
     String firstName = sc.next();
     System.out.println("Enter lastname");
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

     Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNo,email);
     list.add(contact);
    }

    public void editContact(){
     System.out.println("Enter first name and last name to edit your details");
     System.out.println("Enter first name");
     String firstName = sc.next();
     System.out.println("enter last name");
     String lastName = sc.next();
     for (Contact contact:list){
      if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)){
         contact.editExistingContact();
      }
     }
    }

    public static void main(String[] args) {

     AddressBook addressBook = new AddressBook();
     addressBook.addNew();
     System.out.println("Add another contact ");
     addressBook.addNew();
     System.out.println(addressBook.list);


     addressBook.editContact();
     System.out.println(addressBook.list);

    }
}
