public class Contact implements Comparable{
    public String firstName;
    public String lastName;
    public String telephoneNumber;

    Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (validateTelephoneNumber(telephoneNumber)) {
            this.telephoneNumber = telephoneNumber;
        } else {
            throw new IllegalArgumentException("Incorrect telephone format");
        }
    }

    public boolean validateTelephoneNumber(String telephoneNumber) {
        if (!(telephoneNumber.charAt(3) == '-' || telephoneNumber.charAt(7) == '-')) {
            return false;
        }
        for (int k = 0; k < 9; k = k + 4) {
            try {
                if (k == 8) {
                    String s = telephoneNumber.substring(k);
                    int n = Integer.parseInt(s);
                } else {
                    String s = telephoneNumber.substring(k, k + 3);
                    int n = Integer.parseInt(s);
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int compareTo(Object object) {
        Contact otherContact = (Contact)object;
        if (this.getFirstName().compareTo(otherContact.getFirstName()) == -1) {
            return -1;    
        } else if (this.getFirstName().compareTo(otherContact.getFirstName()) == 1) {
            return 1;
        } else {
            if (this.getLastName().compareTo(otherContact.getLastName()) == -1) {
                return - 1;
            } else if (this.getLastName().compareTo(otherContact.getLastName()) == 1) {
                return 1;
            } else {
                if (this.getTelephoneNumber().compareTo(otherContact.getTelephoneNumber()) == -1) {
                    return -1;
                } else if (this.getTelephoneNumber().compareTo(otherContact.getTelephoneNumber()) == 1) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return 
            "First Name: " + firstName 
            + "Last Name: "
            + lastName
            + "\n Telephone Number: " + 
            telephoneNumber;
    }
}
