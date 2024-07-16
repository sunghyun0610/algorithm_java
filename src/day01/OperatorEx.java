package day01;

import java.util.Scanner;

public class OperatorEx {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
//        System.out.println("2자리 양수를 입력하시오.");
//        int num=sc.nextInt();
//        int num_4=sc.nextInt();
//        String str= sc.next();
//        StringBuilder sb= new StringBuilder(str);
//        String reverse= sb.reverse().toString();
//        System.out.println(reverse);
//        sb=new StringBuilder();
//        while(num!=0){
//            sb.append(num%10);
//            num/=10;
//        }
//
//        System.out.println(sb.toString());
//        sb=new StringBuilder();
//        while(num_4!=0){
//            sb.append(num_4%10);
//            num_4/=10;
//        }
//        System.out.println(sb);


        System.out.println("화씨 온도를 입력하세요");
        double f=sc.nextDouble();
        double celsius= (5.0/9.0) * (f-32);
        System.out.printf("%.2f\n", celsius);


    }
}
      /*
 아래는 화씨 를 섭씨 로 변환하는 코드이다 변환공식이 (Fahrenheit) (Celcius) . 'C =
5/9 ×(F - 32)' , 라고 할 때 에 알맞은 코드를 넣으시오 단 변환 결과값은 소수점
셋째자리에서 반올림해야한다

*/