//Changed Public to public with a lowercase p
//Chaged the class name Cats to Cat
public class Cat {
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
    //Changed name of parameter from cat to Cat
    //Also added String breed to the constructor parameter
	public Cat(String name, String breed) {
        //added this to name, breed, and livesRemaining
		this.name = name;
		this.breed = breed;
        //Changed setting is hungry from yes to true
		this.isHungry = true;
		this.livesRemaining = 9;
	}

    //Changed void to String 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    //changed void to boolean
    //changed name getishungry to getIsHungry
	public boolean getIsHungry(){
		return isHungry;
	}

    //Added getters and setters to Breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed(String breed) {
        return breed;
    }

	public boolean feed() {
		this.isHungry = false;
        return false;
        //added return false 
	}

	public boolean equals(Cat other) {
        //changed == to equals()
		return this.name.equals(other.name) && this.breed.equals(other.breed)
			&& this.livesRemaining == other.livesRemaining;
            //changed = to ==
	}

    //Added @Override
    @Override
	public String toString() {
        //changed from System.out.println to return
		return (name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.");
	}
}