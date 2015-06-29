/**
 * Created by Programmer on 20.06.2015.
 */
public class B extends A {
    int z;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof B)) return false;

        B b = (B) o;

        return z == b.z;

    }

    @Override
    public int hashCode() {
        return z;
    }
}
