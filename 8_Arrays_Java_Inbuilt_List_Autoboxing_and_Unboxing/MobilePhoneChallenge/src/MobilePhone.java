import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    public static ContactList contactlist = new ContactList();
    boolean quit = false;
    int choice = 0;

        while(!quit){
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 0:
                printInstructions();
                break;
            case 1:
                contactlist.printContactList();
                break;
            case 2:
                addContact();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                findContact();
                break;
            case 6:
                quit = true;
                break;
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options menu.");
        System.out.println("\t 1 - To print the list of contact items.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To modify an contact in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact() {
        System.out.println("Please enter new contact: ");
        contactlist.addContact(scanner.nextLine());
    }

    public static void updateContact(){
        System.out.println("Contact name: ");
        String oldContact = scanner.nextLine();
        System.out.println("Change contact in: ");
        String newContact = scanner.nextLine();
        contactlist.modifyContact(oldContact, newContact);
    }

    public static void removeContact(){
        System.out.println("Enter contact name: ");
        String contactName = scanner.nextLine();
        contactlist.removeContactItem(contactName);
    }

    public static void findContact(){
        System.out.println("Contact to search for: ");
        String searchContact = scanner.nextLine();
        if(contactlist.onFile(searchContact)){
            System.out.println("Found " + searchContact + " in our grocery list");
        } else {
            System.out.println(searchContact + " is not in the shopping list");
        }
    }
}
