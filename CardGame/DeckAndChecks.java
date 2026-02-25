import java.util.ArrayList;
import java.util.Scanner;

public class DeckAndChecks {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no single card may have more than 1 ability
    public static boolean checkOneAbilityPerCard(ArrayList<Card> deck) {
        // TODO
        int numAbilities = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).hasBastion()) {
                numAbilities++;
            }
            if (deck.get(i).hasCleave()) {
                numAbilities++;
            }
            if (deck.get(i).hasRipple()) {
                numAbilities++;
            }
            if (numAbilities > 1) {
                return false;
            } else {
                numAbilities = 0;
            }       
        }
        return true;
    }

    // Rule: no more than 3 total ability cards in the deck
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        // TODO
        int totalAbilities = 0;
        for (int i = 0; i < deck.size(); i++) {
             if (deck.get(i).hasBastion() || deck.get(i).hasCleave() || deck.get(i).hasRipple()) {
                    totalAbilities++;
            }
        }
        return totalAbilities <= 3;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one CLEAVE)
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        // TODO
        int numBastion = 0;
        int numRipple = 0;
        int numCleave = 0;
        for (Card card : deck) {
            if (card.hasBastion()) {
                numBastion++;
            } else if (card.hasCleave()) {
                numCleave++;
            } else if (card.hasRipple()) {
                numRipple++;
            }
        }
        return !(numBastion > 1 || numCleave > 1 || numRipple > 1);
    }

    // Rule: strength and toughness must be 1..5, and strength+toughness <= 6
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        // TODO
        for (Card card : deck) {
            if (card.getToughness() > 5 || card.getToughness() < 1) {
                return false;
            } else {
                if (card.getToughness() + card.getStrength() > 6) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidDeck(ArrayList<Card> deck) {
        // TODO: return true only if:
        // - deck has size 5
        // - AND all checks return true
        if (deck.size() != 5) {
            return false;
        } else {
            if (checkOneAbilityPerCard(deck) || checkNoMoreThanThreeAbilityCards(deck) 
                    || checkNoDuplicateAbilities(deck) || checkStatsInRange(deck)) {
                        return true;
            }
        }
        return false;
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities
    // If the user doesn't want to input a custom deck, this method should return deck
    //   of your choice for them to play with.
    public static ArrayList<Card> buildDefaultDeck() {
        // TODO
        ArrayList<Card> deck = new ArrayList<>();
        NamedCard card1 = new NamedCard("card1", CardType.GRANITE, 3, 3, false, false, false);
        deck.add(card1);
        NamedCard card2 = new NamedCard("card2", CardType.PARCHMENT, 1, 3, false, false, false);
        deck.add(card2);
        NamedCard card3 = new NamedCard("card3", CardType.BLADE, 1, 2, false, false, false);
        deck.add(card3);
        NamedCard card4 = new NamedCard("card4", CardType.BLADE, 2, 2, false, false, false);
        deck.add(card4);
        NamedCard card5 = new NamedCard("card5", CardType.GRANITE, 1, 1, false, false, false);
        deck.add(card5);
        return deck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        // TODO
        ArrayList<Card> deck = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            String type = scanner.nextLine();
            int strength = scanner.nextInt();
            int toughness = scanner.nextInt();
            String Bastion = scanner.nextLine();
            String Ripple = scanner.nextLine();
            String Cleave = scanner.nextLine();

            CardType actualType;
            if (type.equals("Granite")) {
                actualType = CardType.GRANITE;
            } else if (type.equals("Parchment")) {
                actualType = CardType.PARCHMENT;
            } else {
                actualType = CardType.BLADE;
            }

            boolean isBastion;
            isBastion = Bastion.equals("y");

            boolean isCleave;
            isCleave = Cleave.equals("y");

            boolean isRipple;
            isRipple = Ripple.equals("y");

            NamedCard card = new NamedCard(name, actualType, strength, toughness, isBastion, isRipple, isCleave);
            deck.add(card);
            deck.isVa

        }
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null) return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
