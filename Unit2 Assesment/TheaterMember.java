public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits;

    public TheaterMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }
    
    public void grantLoyaltyCredit() {
        loyaltyCredits[0] = true;
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count++;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        int credits = countLoyaltyCredits();
        if (credits >= 6) {
            return "Gold Member";
        } else if (credits >= 3 && credits <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        String numberOfTimes = "";
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                if (i != loyaltyCredits.length - 1) {
                    numberOfTimes = numberOfTimes + "X, ";
                } else {
                    numberOfTimes = numberOfTimes + "X]";
                }
            } else {
                if (i != loyaltyCredits.length - 1) {
                    numberOfTimes = numberOfTimes + "-, ";
                } else {
                    numberOfTimes = numberOfTimes + "-]";
                }
            }
        }
        return "Loyalty History: [" + numberOfTimes;
    }

    @Override 
    public String toString() {
        return name + " (" + determineMembershipStatus() + ")" + ", " + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        if (!(this.getName().equals(other.getName()))) {
            return false;
        }
        for (int i = 0; i < this.loyaltyCredits.length; i++) {
            if (this.loyaltyCredits[i] != other.loyaltyCredits[i]) {
                return false;
            }
        }
        return true;
    }
}
