public class ClassPairTest {
    public static void main(String[] args) {
        GenericClassPair_20_8<Integer, String> pair1 = new GenericClassPair_20_8<>(1, "Name");
        System.out.println(pair1);

        GenericClassPair_20_8<Double, Character> pair2 = new GenericClassPair_20_8<>(3.14, 'P');
        System.out.println(pair2);

        System.out.println("\nFirst of pair1: " + pair1.getFirst());
        System.out.println("Second of pair1: " + pair1.getSecond() + "\n");

        System.out.println("First of pair2: " + pair2.getFirst());
        System.out.println("Second of pair2: " + pair2.getSecond() + "\n");

        System.out.println("pair1 and pair2 after change: ");
        pair1.setFirst(2);
        pair1.setSecond("Surname");
        System.out.println(pair1);

        pair2.setFirst(6.28);
        pair2.setSecond('B');
        System.out.println(pair2);

        System.out.println("\nFirst of pair1: " + pair1.getFirst());
        System.out.println("Second of pair1: " + pair1.getSecond() + "\n");

        System.out.println("First of pair2: " + pair2.getFirst());
        System.out.println("Second of pair2: " + pair2.getSecond() + "\n");
    }
}
