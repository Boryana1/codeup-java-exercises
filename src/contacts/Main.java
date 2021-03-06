package contacts;

import contacts.Contacts;
import contacts.MobilePhone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    // Creating an instant with a default Number
    private static MobilePhone mobilePhone = new MobilePhone("000 443 876");

    public static void main(String[] args) {

        boolean quite = false;

        printAction();
        while (!quite) {
            System.out.println("Enter an option (1, 2, 3, 4 or 5)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    queryContact();
                    break;

                case 4:
                    removeContact();
                    break;
                case 5:
                    System.out.println("Exit");
                    quite = true;
                    break;


            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact's phone Number: ");
        String phone = scanner.nextLine();
        String number = phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        Contacts newContact = Contacts.createContact(name, number);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New Contact Added: " + name + " | " + number);
        } else {
            System.out.println("Can't add, " + name + " already on file");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contacts extContact = mobilePhone.queryContact(name);
        if (extContact == null) {
            System.out.println("Cannot find contact");
            return;
        }

        if (mobilePhone.removeContact(extContact)) {
            System.out.println("Contact successfully deleted");
        } else {
            System.out.println("There was an error deleting the contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter an existing contact name : ");
        String name = scanner.nextLine();
        Contacts extContact = mobilePhone.queryContact(name);
        if (extContact == null) {
            System.out.println("Contact does not exist");
            return;
        }

        System.out.println("Name : " + extContact.getName() +
                " Phone Number is: " + extContact.getPhoneNumber());
    }


    private static void printAction() {
        System.out.println("\nSelect from the available options: ");
        System.out.println(
                "1. View Contacts\n" +
                        "2. Add a new contact\n" +
                        "3. Search a contact by name\n" +
                        "4. Delete an existing contact.\n" +
                        "5. Exit\n");
        System.out.println("Choose Your Action: ");
    }


    //-------------------------TABLE--------------------------
//    Scanner newScanner = new Scanner(System.in);
//        System.out.println("What number would you like to go up to? You can choose from 1 to 10.");
//    int userInput = newScanner.nextInt();
//                System.out.print("number\t | squared\t | cubed \n-----\t | -----\t | -----\n");
//                for(
//    int i = 1;
//    i <=userInput;i++)
//
//    {
//        int squared = (int) Math.pow(i, 2);
//        int cubed = (int) Math.pow(i, 3);
//        System.out.printf("%s \t \t | %s \t \t | %s \n", i, squared, cubed);
//    }
}