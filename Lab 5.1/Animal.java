public abstract class Animal {
    private String name;
    private String habitat;
    private int age; 
    private String diet;
    private boolean isHungry;

    public Animal() {
        
    }
    
    public Animal(String name, String habitat, int age, String diet, boolean isHungry) {
        this.name = name;
        this.habitat = habitat;
        this.age = age;
        this.diet = diet;
        this.isHungry = isHungry;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public void eating() {
        if (isHungry) {
            System.out.println(name + " is eating.");
        } else {
            System.out.println(name + " is not eating.");
        }
    }

    public void checkFood() {
        int num = (int) (Math.random() * 5) + 1;
        System.out.println("The amount of food available on a scale from 1-5 is: " + num);
    }

    public abstract void makeNoise() {
        System.out.println();
    }



    
}
