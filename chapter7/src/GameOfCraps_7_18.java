// Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
// answers the following questions:
// a) How many games are won on the first roll, second roll, …, twentieth roll and after the
// twentieth roll?
// b) How many games are lost on the first roll, second roll, …, twentieth roll and after the
// twentieth roll?
//c) What are the chances of winning at craps? [Note: You should discover that craps is one
// of the fairest casino games. What do you suppose this means?]
// d) What is the average length of a game of craps?
// e) Do the chances of winning improve with the length of the game?
import java.security.SecureRandom;

public class GameOfCraps_7_18 {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status { CONTINUE, WON, LOST };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int[] winsFirstToTwentieth = new int[20];
        int[] lossesFirstToTwentieth = new int[20];
        int gamesWon = 0;
        int gamesLost = 0;
        int totalRolls = 0;
        int totalGames = 1000000;

        for (int i = 0; i < totalGames; i++) {
            int myPoint = 0;
            int rolls = 1;
            Status gameStatus;
            int sumOfDice = rollDice();

            switch (sumOfDice){
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    break;
            }

            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();
                rolls++;
                if (sumOfDice == myPoint)
                    gameStatus = Status.WON;
                else
                    if (sumOfDice == SEVEN)
                        gameStatus = Status.LOST;
            }
            if (gameStatus == Status.WON) {
                gamesWon++;
                if (rolls <= 20) winsFirstToTwentieth[rolls - 1]++;
            } else {
                gamesLost++;
                if (rolls <= 20) lossesFirstToTwentieth[rolls - 1]++;
            }
            totalRolls += rolls;
        }

        System.out.println("a) Number of games won on each roll:");
        for (int i = 0; i < 20; i++) {
            System.out.printf("Roll %d: %d wins\n", i + 1, winsFirstToTwentieth[i]);
        }
        System.out.println("After the twentieth roll: " + (gamesWon - sum(winsFirstToTwentieth)) + " wins");

        System.out.println("b) Number of games lost on each roll:");
        for (int i = 0; i < 20; i++) {
            System.out.printf("Roll %d: %d losses\n", i + 1, lossesFirstToTwentieth[i]);
        }
        System.out.println("After the twentieth roll: " + (gamesLost - sum(lossesFirstToTwentieth)) + " losses");

        System.out.println("c) Chances of winning at craps: " + (double) gamesWon / totalGames * 100 + "%");

        double averageLength = (double) totalRolls / totalGames;
        System.out.printf("d) Average length of a game: %.0f rolls\n", averageLength);

        System.out.println("e) Do the chances of winning improve with the length of the game?");
        double[] winPercentagesByRoll = new double[20];
        for (int i = 0; i < 20; i++) {
            int totalGamesThisRoll = winsFirstToTwentieth[i] + lossesFirstToTwentieth[i];
            if (totalGamesThisRoll > 0) {
                winPercentagesByRoll[i] = (double) winsFirstToTwentieth[i] / totalGamesThisRoll * 100;
            } else {
                winPercentagesByRoll[i] = 0;
            }
            System.out.printf("Roll %d: Win percentage = %.2f%%%n", i + 1, winPercentagesByRoll[i]);
        }
        double afterTwentiethWins = (double) (gamesWon - sum(winsFirstToTwentieth));
        double afterTwentiethLosses = (double) (gamesLost - sum(lossesFirstToTwentieth));
        double winPercentageAfterTwentieth = afterTwentiethWins / (afterTwentiethWins + afterTwentiethLosses) * 100;
        System.out.printf("After the twentieth roll: Win percentage = %.2f%%%n", winPercentageAfterTwentieth);
        System.out.printf("Overall win percentage: %.2f%%%n", (double) gamesWon / totalGames * 100);
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        return sum;
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }
}
