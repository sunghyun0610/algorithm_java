package swea;

class Base {
    Base() {
        System.out.println("call");
    }
}
public class Alpha extends Base{
        public static void main(String[] args) {
            Alpha aa = new Alpha();
            Base bb = new Base();
        }
    }


