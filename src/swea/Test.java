package swea;

public class Test {
    private int value=1;
    public void printValue(int value){
        System.out.println(this.value);
    }

    public static void main(String[] args) {
        Test c = new Test();
        c.printValue(2);
    }
}
