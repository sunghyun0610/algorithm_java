package day01;
import java.util.*;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("요일을 입력하세요");
        String day= scanner.next();
        System.out.println(day);
        int dayNum=0;
        dayNum = switch(day){

            case "일" ->1;
            case "월" ->2;
            case "화" ->3;
            case "수" ->4;
            case "목" ->5;
            case "금" ->6;
            case "토" ->7;

            default ->-1;
        };

        System.out.println(dayNum);
    }
}
