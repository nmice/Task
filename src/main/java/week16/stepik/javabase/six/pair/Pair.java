package week16.stepik.javabase.six.pair;

import java.util.Objects;

class Pair<First,Second> {

    First firstElement = null;
    Second secondElement = null;

    private Pair(First first, Second second){
        firstElement = first;
        secondElement = second;
    }

    public First getFirst() {
        return firstElement;
    }

    public Second getSecond() {
        return secondElement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(firstElement, pair.firstElement) &&
                Objects.equals(secondElement, pair.secondElement);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstElement, secondElement);
    }

    public static Pair of(Object first, Object second) {
        return new Pair(first, second);
    }
}
