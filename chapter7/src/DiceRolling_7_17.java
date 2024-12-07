//Write an application to simulate the rolling of two dice. The application
// should use an object of class Random once to roll the first die and again to roll the second die. The
// sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
// the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
// least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
// should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
// each possible sum appears. Display the results in tabular format.

import java.util.Random;

public class DiceRolling_7_17 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequency = new int[11];
        int rolls = 36000000;
        for (int i = 0; i < rolls; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;
            frequency[sum - 2]++;
        }

        System.out.println("Sum\t   Frequency");

        for (int i = 0; i < frequency.length; i++) {
            int sum = i + 2;
            System.out.printf("%2d\t%10d\n", sum, frequency[i]);
        }
    }
}
