package outils;

public class MonInt {
    private int val;
    public MonInt(int val) {
        this.val = val;
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public String toString() {
        return String.valueOf(this.val);
    }
}
