//20.8 (Generic Class Pair) Write a generic class Pair which has two type parameters—F and S—
// each representing the type of the first and second element of the pair, respectively. Add get and set
// methods for the first and second elements of the pair. [Hint: The class header should be public
// class Pair<F, S>.]

public class GenericClassPair_20_8<F, S> {
    private F first;
    private S second;

    public GenericClassPair_20_8(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public F getFirst() {
        return first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair: (" + first + ", " + second + ")";
    }
}
