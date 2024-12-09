//(Copying and Reversing LinkedLists) Write a program that creates a LinkedList object of
// 10 characters, then creates a second LinkedList object containing a copy of the first list, but in re
//verse order.

import java.util.LinkedList;

public class ReverseLinkedList_16_18 {
    public static void main(String[] args) {
        LinkedList<Character> originalList = new LinkedList<>();
        originalList.add('A');
        originalList.add('B');
        originalList.add('C');
        originalList.add('D');
        originalList.add('E');
        originalList.add('F');
        originalList.add('G');
        originalList.add('H');
        originalList.add('I');
        originalList.add('J');

        System.out.println("Original LinkedList: " + originalList);

        LinkedList<Character> reversedList = new LinkedList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        System.out.println("Reversed LinkedList: " + reversedList);
    }
}