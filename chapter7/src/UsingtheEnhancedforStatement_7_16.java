//Write an application that uses an enhanced for statement to sum the double values passed
//by the command-line arguments. [Hint: Use the static
//method parseDouble of class Double to convert a String to a double value.]

public class UsingtheEnhancedforStatement_7_16 {
    public static void main(String[] args) {
        double sum = 0;
        for (String arg : args) {
            try {
                sum += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + " is not a valid number.");
            }
        }
        System.out.printf("The sum of the values is: %.3f", sum);
    }
}