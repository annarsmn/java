public class OverloadedGenericPrintArray_20_5 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array intArray contains:%n");
        try {
            printArray(intArray);
            int count = printArray(intArray, 1, 3);
            System.out.println(count);
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("%nArray doubleArray contains:%n");
        try {
            printArray(doubleArray);
            int count = printArray(doubleArray, 2, 5);
            System.out.println(count);
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("%nArray charArray contains:%n");
        try {
            printArray(charArray);
            int count = printArray(charArray, 0, 3);
            System.out.println(count);
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("\nArray intArray contains:%n");
        try {
            printArray(intArray);
            int count = printArray(intArray, 3, 1);
            System.out.println(count);
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("%nArray doubleArray contains:%n");
        try {
            printArray(doubleArray);
            int count = printArray(doubleArray, 2, 10);
            System.out.println(count);
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("%nArray charArray contains:%n");
        try {
            printArray(charArray);
            int count = printArray(charArray, -1, 3);
            System.out.println(count);
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }
    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <T> int printArray(T[] inputArray, int lowSubscript, int highSubscript) throws InvalidSubscriptException {
        if (lowSubscript < 0 || highSubscript >= inputArray.length || lowSubscript > highSubscript) {
            throw new InvalidSubscriptException("Invalid subscript range.");
        }

        int count = 0;
        for (int i = lowSubscript; i <= highSubscript; i++) {
            System.out.printf("%s ", inputArray[i]);
            count++;
        }
        System.out.println();
        return count;
    }
}

