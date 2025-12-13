public class Theater {
    private String theaterName;
    TheaterMember[] registeredMembers;

    Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        this.registeredMembers = new TheaterMember[initialCapacity];
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }
    
    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        TheaterMember[] increasedTheater = new TheaterMember[2 * registeredMembers.length];
        for (int i = 0; i < registeredMembers.length; i++) {
            increasedTheater[i] = registeredMembers[i];
        }
        registeredMembers = increasedTheater;
    }

    public void registerMember(TheaterMember member) {
        if (isFull()) {
            TheaterMember[] increaseByOne = new TheaterMember[1 + registeredMembers.length];
            for (int i = 0; i < registeredMembers.length; i++) {
                increaseByOne[i] = registeredMembers[i];
            }
            increaseByOne[increaseByOne.length - 1] = member;
            registeredMembers = increaseByOne;
        } else {
            for (int i = 0; i < registeredMembers.length; i++) {
                if (registeredMembers[i] == null) {
                    registeredMembers[i] = member;
                    i = registeredMembers.length;
                }
            }
        }
    }

    @Override 
    public String toString() {
        String info = "";
        for (int i = 0; i < registeredMembers.length; i++) {
            info = info + i + ".) " + registeredMembers[i].toString() + "\n";
        }
        return "== " + theaterName + " Members ==" 
            + "\n" + info;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i].equals(member)) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }

}
