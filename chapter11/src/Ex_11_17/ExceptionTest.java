//11.17 (Catching Exceptions Using Class Exception) Write a program that demonstrates how
// various exceptions are caught with
// catch (Exception exception)
// This time, define classes ExceptionA (which inherits from class Exception) and ExceptionB (which
// inherits from class ExceptionA). In your program, create try blocks that throw exceptions of types
// ExceptionA, ExceptionB, NullPointerException and IOException. All exceptions should be
// caught with catch blocks specifying type Exception.

package Ex_11_17;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IOException("This is IOException");
        } catch (Exception exception) {
            System.out.println("Caught an exception of type: " + exception.getClass().getSimpleName());
            System.out.println("Message: " + exception.getMessage());
        }

        try {
            throw new ExceptionA("This is ExceptionA");
        } catch (Exception exception) {
            System.out.println("Caught an exception of type: " + exception.getClass().getSimpleName());
            System.out.println("Message: " + exception.getMessage());
        }

        try {
            throw new ExceptionB("This is ExceptionB");
        } catch (Exception exception) {
            System.out.println("Caught an exception of type: " + exception.getClass().getSimpleName());
            System.out.println("Message: " + exception.getMessage());
        }

        try {
            throw new NullPointerException("This is NullPointerException");
        } catch (Exception exception) {
            System.out.println("Caught an exception of type: " + exception.getClass().getSimpleName());
            System.out.println("Message: " + exception.getMessage());
        }
    }
}
