//Rewrite Fig. 7.2 so that the size of the array is specified by the
// first command-line argument. If no command-line argument is supplied, use 10 as the default size
// of the array.

public class CommandLineArguments_7_15 {
    public static void main(String[] args) {
        int size = 10;
        if (args.length > 0) {
            try {
                size = Integer.parseInt(args[0]);
                if (size <= 0) {
                    System.out.println("Array size must be positive. Default size is 10.");
                    size = 10;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument. Default size is 10.");
            }
        }
        int[] array = new int[size];
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}
