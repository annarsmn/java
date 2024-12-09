//(Overloading a Generic Method with a Nongeneric Method)) Overload generic method
// printArray of Fig. 20.3 with a nongeneric version that specifically prints an array of Strings in neat,
// tabular format, as shown in the sample output.

public class OverloadedNonGenericPrintArray_20_6 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"};

        System.out.printf("Array intArray contains:%n");
        printArray(intArray);

        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray);

        System.out.printf("%nArray charArray contains:%n");
        printArray(charArray);

        System.out.printf("%nArray stringArray contains:%n");
        printArray(stringArray);
    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void printArray(String[] inputArray) {
        int count = 0;
        for (String element : inputArray) {
            System.out.printf("%-9s", element);
            count++;
            if (count % 4 == 0) {
                System.out.println();
            }
        }
    }
}