import java.util.ArrayList;
import java.util.Arrays;

public class ContactListTester {
    public static void main(String args[]) {


        // A list of unsorted names
        Contact c1 = new Contact("Alice", "Tommy", "848-458-5858");
        Contact c2 = new Contact("Bobby", "Annabelle", "484-484-3839");
        Contact c3 = new Contact("Samantha", "Samuel", "939-484-8443");
        ArrayList<Contact> names = new ArrayList<Contact>(
                Arrays.asList());

        // initializing a contact list
        ContactList contactList = new ContactList();


        System.out.println("=== Testing Adding Names ===");
        // testing the add method
        contactList.add(c1);
        contactList.add(c2);
        contactList.add(c3);

        // Current contact list should be 
        // Contact List: [Alice, Annabelle, Bobby, Samantha, Samuel, Tommy]


        if(contactList.toString().equals("Contact List: [Alice, Annabelle, Bobby, Samantha, Samuel, Tommy]")) {
            System.out.println("=== Adding Names PASSED! === \n");
        } else {
            System.out.println("=== Adding Names FAILED! === \n");
        }


        System.out.println("=== Testing Removing Names ===");

        // testing the remove method
        contactList.remove("Bobby");
        System.out.println(contactList);

        contactList.remove("Alice");
        System.out.println(contactList);

        contactList.add("Fred");
        System.out.println(contactList);

        contactList.add("Xena");
        System.out.println(contactList);

        contactList.remove("Tommy");
        System.out.println(contactList);

        contactList.remove("Fred");
        System.out.println(contactList);

        contactList.remove("Annabelle");
        System.out.println(contactList);

        contactList.remove("Samantha");
        System.out.println(contactList);

        // Final contact list should be
        // Contact List: [Samuel, Xena]

        if(contactList.toString().equals("Contact List: [Samuel, Xena]")) {
            System.out.println("=== Removing Names PASSED! === \n");
        } else {
            System.out.println("=== Removing Names FAILED! === \n");
        }
    }
}

