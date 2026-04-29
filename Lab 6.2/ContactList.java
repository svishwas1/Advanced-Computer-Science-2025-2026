//import java.lang.runtime.TemplateRuntime;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

public class ContactList extends AbstractList {

    // instance variable
    private ArrayList<Contact> contactList;

    // constructor
    // to-do: initializes an empty contact list
    public ContactList() {
        contactList = new ArrayList<>();
    }

    // methods

    // to-do: findInsertLocation(String name)
    /**
     * returns the location in the contact list where the name should go to keep the
     * list
     * alphabetized
     */
    private int findInsertLocation(String name) {
        // You can use a sequential search here. But for a Stretch Challenge, try to do
        // a binary search.

        for (int i = 0; i < contactList.size(); i++) {
            if (name.compareTo(contactList.get(i).getFirstName()) < 0) {
                return (i);
            }
        }
        return (contactList.size());
    }

    // to-do: add(String name)
    /**
     * adds a name to the contact list so that the list remains alphabetized, it
     * prints out which
     * name is being added, also the method prevents duplicate names from being
     * added
     */
    public boolean add(Contact contact) {
        System.out.println("+ Adding " + contact.getFirstName());

        for (Contact person : contactList) {
            if (person.getTelephoneNumber().equals(contact.getTelephoneNumber())) {
                return false;
            }
        }
        int index = findInsertLocation(contact.getFirstName());
        contactList.add(index, contact);
        return true;
    }

    // to-do: add(ArrayList<String> names)
    /* this method adds a list of names to the contact list */
    public void add(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            String starter = names.get(0);
            if (names.get(i).compareTo(starter) < 0) {
                String temporary = names.get(i);
                names.set(i, starter);
                names.set(i + 1, temporary);
            }
        }
        for (String name : names) {
            add(name);
        }

    }

    // to-do: remove(String name)
    /** removes name from the contact list and keeps list alphabetized */
    public boolean remove(Contact contact) {
        int index = contactList.indexOf(contact);
        if (index != -1) {
            contactList.remove(index);
            return true;
        } else {
            return false;
        }
    }

    // to-do: remove(ArrayList<String> names)
    /* this method removes a list of names from the contact list */
    public void remove(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            System.out.println("- Removing " + names.get(i));
            remove(names.get(i)); 
        }

    }

    /** returns a String containing all of the words in list */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // to-do: get(int index)
    /** returns the name at the specified index */
    public Contact get(int index) {
        for (int i = 0; i < contactList.size(); i++) {
            if (i == index) {
                return contactList.get(i);
            }
        }
        throw new IllegalArgumentException("Contact does not exist");
    }

    // to-do: size()
    /** returns the number of names in the contact list */
    public int size() {
        return contactList.size();
    }

    // to-do: clear()
    /** removes all names from the contact list */
    public void clear() {
        System.out.println("Clearing the contact list");
        contactList = new ArrayList<>();
    }

    public void sortByFirstName() {
        Collections.sort(contactList);   
    }

    public void swap(int newSmall, int oldSmall) {
        Contact holder = contactList.get(newSmall);
        contactList.set(newSmall, contactList.get(oldSmall));
        contactList.set(oldSmall, holder);
    }
    
    public int compare(int j, int indexLower) {
        if (contactList.get(j).getLastName().compareTo(contactList.get(indexLower).getLastName()) < 0) {
            return - 1;
        } else if (contactList.get(j).getLastName().compareTo(contactList.get(indexLower).getLastName()) == 0) {
            if (contactList.get(j).getFirstName().compareTo(contactList.get(indexLower).getFirstName()) < 0){
                return -1;
            } else {
                if (contactList.get(j).getTelephoneNumber().compareTo(contactList.get(indexLower).getTelephoneNumber()) < 0) {
                    return -1;
                }
            }
        }
        return 1;
    }

    public void sortByLastName() {
        for (int i = 0; i < contactList.size(); i++) {
            int indexLower = i;
            for (int j = i + 1; j < contactList.size(); j++) {
                if (compare(j, indexLower) < 0) {
                    indexLower = j;
                }
            }
            swap(indexLower, i);
        }
    }

    public void sortByTelephoneNumber() {
        for (int i = 1; i < contactList.size(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (contactList.get(i).getTelephoneNumber().compareTo(contactList.get(j).getTelephoneNumber()) < 0) {
                    swap(i, j);  
                } else if (contactList.get(i).getTelephoneNumber().compareTo(contactList.get(j).getTelephoneNumber()) > 0) {
                    break;
                }
            }
        }
    }

    public Contact searchContacts(String telephoneNumber) {
        for (Contact contact: contactList) {
            if (contact.getTelephoneNumber().equals(telephoneNumber)) {
                return contact;
            }
        }
        return null;
    }
}
