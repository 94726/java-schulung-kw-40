import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playground playingField = new Playground(10);
        playingField.printPlayground();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.next();

            Player player = playingField.getPlayer();

            int playerPos = player.getPosition();

            if (input.equals("r")) {
                playerPos += 1;
            } else if (input.equals("l")) {
                playerPos -= 1;
            }

            playerPos = Math.max(playerPos, 0);
            playerPos = Math.min(playerPos, playingField.getSize() - 1);
            // folgendes wäre das gleiche wie die oberen 2 zeilen, nur halt in einer.
            // playerPos = Math.min(Math.max(playerPos, 0), playingField.getSize() - 1);
            player.setPosition(playerPos);

            playingField.printPlayground();
        }
    }
}
