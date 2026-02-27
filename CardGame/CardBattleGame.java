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
        PlayerState self = new PlayerState("self", playerDeck);
        PlayerState bot = new PlayerState("bot", botDeck);
        System.out.println("== CARD CLASH ==");
        int randomInt = rng.nextInt();
        if (randomInt % 2 == 0) {
            System.out.println("Starting: player");
        } else {
            System.out.println("Starting: Bot");
        }
        drawAndPlayIfNeeded(self, bot);

    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        // TODO
        for (int i = 0; i < self.deck.size(); i++) {
            Card selfCard = self.deck.get(i);
            selfCard.active = true;

        }

    }

    

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        // TODO
        attacker.deck.
        
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DeckAndChecks.buildDefaultDeck();
        ArrayList<Card> bot = BotFactory.buildBotDeck();

        if (!DeckAndChecks.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
