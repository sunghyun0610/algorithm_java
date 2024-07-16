package day01;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {
    public static void solution(){
        System.out.println("사람수를 입력하세요");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Random random=new Random();
        int []height =new int[num];

        int max=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<num;i++){
            height[i]=((int)(Math.random()*91))+100;
            System.out.println("heigth[" + i + "] : " +height[i]);
            min=Math.min(min,height[i]);
            max=Math.max(max,height[i]);
        }
        System.out.println("최솟값 :" +min);
        System.out.println("최대값 :" +max);
    }
    public static void main(String[] args) {
       solution();


    }
}
