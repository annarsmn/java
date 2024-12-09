//Write a program that reads in a series of first names and eliminates
// duplicates by storing them in a Set. Allow the user to search for a first name.

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElimination_16_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> namesSet = new HashSet<>();

        System.out.println("Enter first names (type 'exit' to stop):");
        while (true) {
            String name = input.nextLine().trim();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            if (!name.isEmpty()) {
                namesSet.add(name);
            }
        }
        System.out.println("Unique names:");
        for (String name : namesSet) {
            System.out.println(name);
        }

        System.out.println("Enter a name to search:");
        String searchName = input.nextLine().trim();
        if (namesSet.contains(searchName)) {
            System.out.println(searchName + " is in the set.");
        } else {
            System.out.println(searchName + " is not in the set.");
        }

        input.close();
    }
}
