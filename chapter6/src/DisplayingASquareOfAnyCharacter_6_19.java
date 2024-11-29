//Modify the method created in Exercise 6.18 to receive a second parameter of type char called
// fillCharacter. Form the square using the char provided as an argument.
// Thus, if side is 5 and fillCharacter is #, the method should display
//#####
//#####
//#####
//#####
//#####
//Use the following statement (in which input is a Scanner object) to read a character from the user
//at the keyboard:
//char fill = input.next().charAt(0);
import java.util.Scanner;

public class DisplayingASquareOfAnyCharacter_6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        while (true) {
            System.out.print("Enter a value for the side of the square: ");
            x = input.nextInt();
            if (x <= 0) {
                System.out.println("Value must be positive! Try again.");
            } else {
                break;
            }
        }
        System.out.print("Enter a fillcharacter: ");
        char fill = input.next().charAt(0);
        squareOfAnyCharacters(x, fill);
        input.close();
        }

    public static void squareOfAnyCharacters(int n, char fillcharacter){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(fillcharacter);
            }
            System.out.println();
        }
    }
}