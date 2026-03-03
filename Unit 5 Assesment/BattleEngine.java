// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster.getAttack() < 0 || monster.getHealth() < 0 || monster.getDefense() < 0 || monster.getSpeed() < 0) {
            return false; 
        }
        if (monster.getAttack() + monster.getHealth() + monster.getDefense() + monster.getSpeed() <= 250) {
            return true;
        }
        return false;
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        if (monster.getElement() == ElementType.FIRE || monster.getElement() == ElementType.WATER || monster.getElement() == ElementType.EARTH || monster.getElement() == ElementType.AIR) {
            return true;
        } else {
            return false;
        }
    }

    // to-do: correctStats
    // checks if stats are invalid 
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (!validateStats(monster)) {
            if (monster.getAttack() < 0) {
                monster.setAttack(0);
            } else if (monster.getHealth() < 0) {
                monster.setHealth(0);
            } else if (monster.getDefense() < 0) {
                monster.setDefense(0);
            } else if (monster.getSpeed() < 0) {
                monster.setSpeed(0);
            } else {
                int sum = monster.getAttack() + monster.getHealth() + monster.getDefense() + monster.getSpeed();
                while (sum > 250) {
                    if (monster.getAttack() > 0) {
                        monster.setAttack(monster.getAttack() - 1);
                    }
                    if (monster.getHealth() > 0) {
                        monster.setHealth(monster.getHealth() - 1);
                    }
                    if (monster.getDefense() > 0) {
                        monster.setDefense(monster.getDefense() - 1);
                    }
                    if (monster.getSpeed() > 0) {
                        monster.setSpeed(monster.getSpeed() - 1);
                    }
                }
            }
        }
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0. It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        if (!validateStats(monster1) || !validateElement(monster1) && validateStats(monster2) && validateElement(monster2)) {
            return monster2;
        } else if (!validateStats(monster2) || !validateElement(monster2) && validateStats(monster1) && validateElement(monster1)) {
            return monster1;
        } else if (!validateStats(monster1) || !validateElement(monster1) && !validateStats(monster2) || !validateElement(monster2)) {
            return null;
        }
        if (monster1.getSpeed() > monster2.getSpeed()) {
            while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
                monster1.attack(monster2);
                monster2.attack(monster1);
                displayStatus(monster1, monster2);
            }

        } else if (monster2.getSpeed() < monster1.getSpeed()) {
            while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
                monster2.attack(monster1);
                monster1.attack(monster2);
                displayStatus(monster2, monster1);
            }

        } else {
            int random = (int) (Math.random() * 2);
            if (random % 2 == 0) {
                while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
                    monster1.attack(monster2);
                    monster2.attack(monster1);
                    displayStatus(monster1, monster2);
                }

            } else {
                while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
                    monster2.attack(monster1);
                    monster1.attack(monster2);
                    displayStatus(monster2, monster1);
                }
                
            }
        }
        if (monster1.getHealth() > 0) {
            return monster1;
        } else {
            return monster2;
        }
    }

    // to-do: battleEveryone
    // method battles monsters found in an ArrayList.
    public static Monster battleEveryone(ArrayList<Monster> monsters) {
        Monster winner = startBattle(monsters.get(0), monsters.get(1));
        System.out.println(winner.victoryNoise());
        for (int i = 2; i < monsters.size(); i++) {
            winner = startBattle(monsters.get(i), winner);
            System.out.println(winner.victoryNoise());
        }
        return winner;
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        //System.out.println("Chimney the Chimera: 50 health vs Truant the Treant: 10 health");
        System.out.println(monster.getName() + ": " + monster.getHealth() + " health vs " + opponent.getName() + ": " + opponent.getHealth() + " health");
    }

}
