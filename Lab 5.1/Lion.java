public class Lion {
    private String name;
    private String habitat;
    private String diet;
    private int liveSpan;
    private boolean isYellow;
    private int weight;
    private boolean isEndagered;
    private boolean isHungry;

    Lion(String name, String habitat, String diet, int liveSpan, boolean isBlue, int weight, boolean isEndagered, boolean isHungry) {
        this.name = name;
        this.habitat = habitat;
        this.diet = diet;
        this.liveSpan = liveSpan;
        this.isYellow = isBlue;
        this.weight = weight;
        this.isEndagered = isEndagered;
        this.isHungry = isHungry;
    }
    
    Lion() {
        name = "Panthera leo";
        habitat = "Savanna";
        diet = "Gazelle";
        liveSpan = 15;
        isYellow = true;
        weight = 300;
        isEndagered = true;
        isHungry = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getLiveSpan() {
        return liveSpan;
    }

    public void setLiveSpan(int liveSpan) {
        this.liveSpan = liveSpan;
    }

    public boolean isYellow() {
        return isYellow;
    }

    public void setYellow(boolean isYellow) {
        this.isYellow = isYellow;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isEndagered() {
        return isEndagered;
    }

    public void setEndagered(boolean isEndagered) {
        this.isEndagered = isEndagered;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    @Override 
    public String toString() {
        System.out.println("====LION====");
        return ("Name: " + name 
            + "\nHabitat: " + habitat
            + "\nFood: " + diet
            + "\nLiveSpan: " + liveSpan
            + "\nisBlue: " + isYellow
            + "\nWeight: " + weight
            + "\nisEndangered: " + isEndagered);
    }

    public void saveLions() {
        if (isEndagered) {
            System.out.println("Save the lions");
        }
    }
    
}
