import java.lang.runtime.TemplateRuntime;
import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList {

    // instance variable
    private ArrayList<String> contactList;

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
            if (name.compareTo(contactList.get(i)) < 0) {
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
    public boolean add(String name) {
        System.out.println("+ Adding " + name);
        for (String person : contactList) {
            if (person.equals(name)) {
                return false;
            }
        }
        int index = findInsertLocation(name);
        contactList.add(index, name);
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
    Gauntlet 
    // to-do: remove(String name)
    /** removes name from the contact list and keeps list alphabetized */
    public boolean remove(String name) {
        int index;
        System.out.println("- Removing " + name);
        for (int i = 0; i < contactList.size(); i++) {
            if (name.equals(contactList.get(i))) {
                contactList.remove(i);
            }
        }
    }

    // to-do: remove(ArrayList<String> names)
    /* this method removes a list of names from the contact list */
    public void remove(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            
        }

    }

    /** returns a String containing all of the words in list */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // to-do: get(int index)
    /** returns the name at the specified index */
    public String get(int index) {
        return null;
    }

    // to-do: size()
    /** returns the number of names in the contact list */
    public int size() {
        return 0;
    }

    // to-do: clear()
    /** removes all names from the contact list */
    public void clear() {
        System.out.println("Clearing the contact list");
    }

}
