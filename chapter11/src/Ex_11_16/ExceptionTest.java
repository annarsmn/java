//11.16. (Catching Exceptions with Superclasses) Use inheritance to create an exception superclass
// (called ExceptionA) and exception subclasses ExceptionB and ExceptionC, where ExceptionB
//inherits from ExceptionA and ExceptionC inherits from ExceptionB. Write a program to demonstrate
// that the catch block for type ExceptionA catches exceptions of types ExceptionB and ExceptionC.

package Ex_11_16;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionC("This is ExceptionC");
        } catch (ExceptionA e) {
            System.out.println("Caught an exception of type: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }

        try {
            throw new ExceptionB("This is ExceptionB");
        } catch (ExceptionA e) {
            System.out.println("Caught an exception of type: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }

        try {
            throw new ExceptionA("This is ExceptionA");
        } catch (ExceptionA e) {
            System.out.println("Caught an exception of type: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }
}
