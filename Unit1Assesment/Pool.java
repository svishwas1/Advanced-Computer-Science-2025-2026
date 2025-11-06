public class Pool {
    private String name;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsChemicalCheck;

    Pool(String name, String ownerName, int cleanlinessLevel) {
        this.name = name;
        this.ownerName = PoolUtils.fixName(ownerName);
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.username = PoolUtils.generateUsername(ownerName);
        this.needsChemicalCheck = false;
    }

    Pool() {
        this.name = "Pooly";
        this.ownerName = "Shriya Vishwas";
        this.cleanlinessLevel = 5;
        this.needsChemicalCheck = false;
        this.username = PoolUtils.generateUsername(ownerName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = PoolUtils.fixName(ownerName);
        this.username = PoolUtils.generateUsername(this.ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsChemicalCheck() {
        return needsChemicalCheck;
    }

    public void setNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.needsChemicalCheck = needsChemicalCheck;
    }

    @Override
    public String toString() {
        return "== ABOUT POOL =="
            + "Name: " + name
            + "Owner: " + ownerName
            + "Username: " + usernamea
            + "Cleanliness Level: " + cleanlinessLevel
            + "Does pool need chemical check? " + needsChemicalCheck;
    }

    public boolean equals(Pool other) {
        if (this.getName().equals(other.getName()) && this.ownerName.equals(other.getOwnerName()) && this.get)
    }


}