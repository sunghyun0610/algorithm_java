package day01;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        //양의정수 입력받아 2진수로 출력하는법
        Scanner sc= new Scanner(System.in);
        System.out.println("양의 정수 입력 : ");
        int num=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            sb.append(num%2);
            num/=2;
        }
        System.out.println(sb.reverse().toString());
    }
}
