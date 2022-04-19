package Chapter05.exception;

import java.util.Objects;

public class EqualsMethod {
    int i = 10;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsMethod that = (EqualsMethod) o;
        return i == that.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    @Override
    public String toString() {
        return "EqualsMethod{" +
                "i=" + i +
                '}';
    }
}
