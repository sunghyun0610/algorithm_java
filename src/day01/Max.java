package day01;

import java.util.Arrays;
import java.util.Scanner;


public class Max {
    public int solution(int []numbers){
        int answer=0;
        Arrays.sort(numbers);
        int a=numbers[0]*numbers[1];
        int b=numbers[numbers.length-1]*numbers[numbers.length-2];

        answer=Math.max(a,b);

        return answer;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []num=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        Max sol=new Max();
        int result= sol.solution(num);
        System.out.println(result);
    }
}
