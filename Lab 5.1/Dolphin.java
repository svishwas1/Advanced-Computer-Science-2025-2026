public class Dolphin {
    private String name;
    private String habitat;
    private String diet;
    private int liveSpan;
    private boolean isBlue;
    private int weight;
    private boolean isEndagered;
    private boolean isHungry;

    Dolphin(int liveSpan, boolean isBlue, int weight, boolean isEndagered) { 
        super(String name);
        this.liveSpan = liveSpan;
        this.isBlue = isBlue;
        this.weight = weight;
        this.isEndagered = isEndagered;


    }

    Dolphin() {
        name = "Tursiopstruncatus";
        habitat = "ocean";
        diet = "fish";
        liveSpan = 60;
        isBlue = true;
        weight = 300;
        isEndagered = true;
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

    public void setDiet(String food) {
        this.diet = food;
    }

    public int getLiveSpan() {
        return liveSpan;
    }

    public void setLiveSpan(int liveSpan) {
        this.liveSpan = liveSpan;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean isBlue) {
        this.isBlue = isBlue;
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
        System.out.println("====DOLPHIN====");
        return ("Name: " + name 
            + "\nHabitat: " + habitat
            + "\nFood: " + diet
            + "\nLiveSpan: " + liveSpan
            + "\nisBlue: " + isBlue
            + "\nWeight: " + weight
            + "\nisEndangered: " + isEndagered);
    }

    
    public void needsFood() {
        if (weight <= 300) {
            System.out.println(name + " is hungry!");
        } else {
            System.out.println(name + " is not hungry");
        }
    }
    
}
