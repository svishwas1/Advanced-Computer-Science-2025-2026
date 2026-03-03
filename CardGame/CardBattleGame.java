import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardBattleGame {

    // TODO: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        // TODO
        String display = "";
        display = display + "== CARD CLASH ==";
        PlayerState self = new PlayerState("self", playerDeck);
        PlayerState bot = new PlayerState("bot", botDeck);
        int randomInt = rng.nextInt();
        if (randomInt % 2 == 0) {
            display = display + "\nStarting: player";
        } else {
            display = display + "\nStarting: Bot";
        }
        while (self.hasAnythingLeft() && bot.hasAnythingLeft()) {
            if (randomInt % 2 == 0) {
                drawAndPlayIfNeeded(bot, self);              
            } else {
                drawAndPlayIfNeeded(self, bot);
            }
            randomInt++;
        } 
        if (self.hasAnythingLeft()) {
            display = display + "\nWinner: Player";
        } else {
            display = display + "\nWinner: Bot";
        }
        return display;
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        // TODO
        if (self.active == null) {
            self.active = self.deck.get(0);
            self.deck.remove(0);
        }
        attackOnce(self, other);
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        // TODO
        if (defender.active != null) {
            attacker.active.applySelfOnPlay(attacker.active.resolvedAbility());
            int damage = defender.active.computeDamageAgainst(attacker.active);
            defender.active.takeDamage(damage);
            if (defender.active.getToughness() <= 0) {
                defender.active = null;
            }
        }
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DecksAndChecks.buildDefaultDeck();
        ArrayList<Card> bot = BotFactory.buildBotDeck();

        if (!DecksAndChecks.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }
        playGame(player, bot, new Random());
    }
}
