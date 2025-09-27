public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int computeTotalEmployees() {
        return (numberOfLoanOfficers + numberOfTellers);
    }

    @Override
    public String toString() {
        return "This bank has "
            + numberOfLoanOfficers 
            + " loan officers and "
            + numberOfTellers
            + " tellers.";
    }

    public boolean equals(Bank otherBank) {
        if (this.numberOfLoanOfficers == otherBank.numberOfLoanOfficers 
            && this.numberOfTellers == otherBank.numberOfTellers) {
            return true;
        } else {
            return false;
        }
    }

    public double getEmployeeRatio() {
        return ((double) (numberOfLoanOfficers) / numberOfTellers);
    }

    public void hireMembers(int numToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers = numberOfLoanOfficers + numToHire;
        } else {
            numberOfTellers = numberOfTellers + numToHire;
        }
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer && numberOfLoanOfficers >= 1) {
            numberOfLoanOfficers = numberOfLoanOfficers - 1;
            System.out.println("Loan Officer Fired! There are " 
                + numberOfLoanOfficers + " employees left.");
        } else if (numberOfLoanOfficers >= 1 && numberOfTellers >= 1) {
            numberOfTellers = numberOfTellers - 1;
            System.out.println("Teller fired! There are " + numberOfTellers 
                + " employees left");
        } else {
            System.out.println("There is not enough employees to fire.");
        }
    }

    public void transferEmployee(boolean fromLoanOfficer) {
        if (fromLoanOfficer) {
            numberOfLoanOfficers = numberOfLoanOfficers - 1;
            numberOfTellers = numberOfTellers + 1;
        } else {
            numberOfLoanOfficers = numberOfLoanOfficers + 1;
            numberOfTellers = numberOfTellers - 1;
        }
        System.out.println("Exchange sucessfully transfered.");
    }

    public int calulateTotalSalaries() {
        int totalLoanOfficerSalaries = numberOfLoanOfficers * 75000;
        int totalTellersSalaries = numberOfTellers * 45000;
        return totalLoanOfficerSalaries + totalTellersSalaries;
    }
}