package swea;

public class Change {
    static String str="ABC123";
    public static void change(String str) {
        Change.str+="456";
    }

    public static void main(String[] args) {
        String str="ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After changing " + Change.str);
    }
}
