/**
 * Created by Programmer on 29.06.2015.
 */
public enum Numbers {
    ONE(1), TWO(2) {
        public int getNumber() {
            return x + x;
        }
    }, THREE(3) {
        public int getNumber() {
            return x + x + x;
        }
    }, FOUR(4), FIVE(5);
    int x;

    Numbers(int x) {
        this.x = x;
    }

    public int getNumber() {
        return x;
    }

}
