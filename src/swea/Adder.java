package swea;

public class Adder {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));
    }
}
