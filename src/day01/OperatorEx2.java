package day01;


/*
        -------------------------------------------
비만도 측정(BMI지수)
BMI를 이용한 비만도 계산은 자신의 몸무게를 키의 제곱으로
나누는 것으로 공식은 kg/㎡. BMI가 18.5 이하면 저체중 ／
        18.5 ~ 24.9 사이면 정상 ／ 25.0 ~ 29.9 사이면 과체중 ／
        30.0 이상부터는 비만으로 판정.
신체질량지수
        (BMI) = 체중(kg)/[신장(m)]2
        -------------------------------------------
주의: 키 입력: 키를 cm 단위로 입력받습니다.
단위 변환: 입력받은 cm 단위의 키를 m 단위로 변환합니다 (heightCm / 100).
BMI 계산: 변환된 키를 사용하여 BMI를 계산합니다.
*/

import java.util.Scanner;

public class OperatorEx2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double height=sc.nextDouble();
        double weight=sc.nextDouble();

        OperatorEx2 calculator = new OperatorEx2();
        double result=calculator.Bmi(height,weight);
        System.out.printf("%.2f\n",result);

        if(result<=18.5){
            System.out.println("저체중");
        }
        else if(result>18.5 && result<=24.9){
            System.out.println("정상");
        }
        else if(result>=25.0 && result<=29.9){
            System.out.println("과체중");
        }
        else{
            System.out.println("비만");
        }
    }
    public  double Bmi(double height,double weight){
        height/=100;
        double result=weight/(height*height);
        return result;
    }
}
