package day01;
import java.time.LocalDate;
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
            case "토" ->{
                System.out.println("즐거운 토요일!");
                yield 7;
            }

            default ->-1;
        };

        System.out.println(dayNum);

        Calendar cal=Calendar.getInstance();//선언법 알아두기
        int today=cal.get(Calendar.DAY_OF_WEEK);//7일을 기준으로 몇번 째 날인지 int로 반환
//        System.out.println("today : " +today);
        System.out.println("입력한 요일이 몇일 남았는지 : ");
        int rest=7-Math.abs(today-dayNum);
        System.out.println(rest);//해당 요일이 몇일 았는지 계산한 것.
        //해당 요일이 몇년 몇월 몇일인지
        System.out.println("입력한 요일이 몇년 몇월 몇일인지 : ");
        LocalDate date =LocalDate.now();
        LocalDate newdate = date.plusDays(rest);
        System.out.println(date);
        System.out.println(newdate);
    }
}
