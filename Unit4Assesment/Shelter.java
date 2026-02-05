import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows > 0 && cols > 0) {
            kennels = new Dog [rows][cols];
        } else {
            throw new IllegalArgumentException("Rows/Columns must be greater than 0");
        }
        // to-do: implement this constructor
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        // to-do: implement this method
        if (animal == null) {
            throw new IllegalArgumentException("Dog cannot be null");
        }
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] == null) {
                    kennels[r][c] = animal;
                    r = kennels.length - 1;
                }
            }
        }
    }

    public void add(Dog animal, int row, int col) {
        // to-do: implement this method
        if (animal == null || row <= 0 || row > kennels.length 
            || col <= 0 || col > kennels[row].length) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }
    }

    public void add(ArrayList<Dog> animals) {
        // to-do: implement this method
        if (animals == null) {
            throw new IllegalArgumentException("animals cannot be null.");
        }
        for (int i = 0; i < animals.size(); i++) {
            if (!isFull()) {
                add(animals.get(i));
            } else {
                System.out.println("No empty kennels.");
            }
        }
    }

    public boolean isFull() {
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public Dog adopt(int row, int col) {
        // to-do: implement this method
        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("Dog does not exist.");
        }
        if (row <= 0 || row > kennels.length || col <= 0 || col > kennels[row].length) {
            throw new IllegalArgumentException("Row/Col values are invalid");
        }
        Dog adopt = kennels[row][col];
        kennels[row][col] = null;
        return adopt;

    }

    public ArrayList<Dog> search(String name) {
        // to-do: implement this method
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        ArrayList<Dog> matchNames = new ArrayList<>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c].getName().equals(name)) {
                    matchNames.add(kennels[r][c]);
                }
            }
        }
        return matchNames;
    }

    public ArrayList<Dog> search(int age) {
        // to-do: implement this method
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be null.");
        }
        ArrayList<Dog> matchAges= new ArrayList<>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c].getAge() == age) {
                    matchAges.add(kennels[r][c]);
                }
            }
        }
        return matchAges;
    }
}
