// Write an application that calculates the product of a series
// of integers that are passed to method product using a variable-length argument list.
// Test your method with several calls, each with a different number of arguments.

public class VariableLengthArgumentList_7_14 {
    public static void main(String[] args) {
        System.out.println("Product of 2, 3: " + productInt(2,3) );
        System.out.println("Product of 2, 3, 4: " + productInt(2,3,4) );
        System.out.println("Product of 2, 3, 4, 5: " + productInt(2,3,4,5) );
        System.out.println("Product of 2, 3, 4, 5, 6: " + productInt(2,3,4,5,6) );
        System.out.println("Product of 2: " + productInt(2) );
    }
    public static int productInt(int... numbers){
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
}
