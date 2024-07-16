package day01;

//클래스명 : 파스칼 표기법 파스칼 표기법은 첫 글자를 대문자로 구성하며 , 단어가 합성될 때 마다 각 단어의 첫 글자를  대문자로 표기하는 방식방법이다.
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!!");
        System.out.println("안녕하세요~~");
        System.out.print("하이여");
        System.out.println("잘해보자");

        int a=100;

        System.out.println("a = " + a);//문자열 + 변수 => 문자열 결합이 일어남.
        String text="Hello World";
        double pi=3.141592;

        System.out.printf("text: %s%n",text);
        System.out.printf("pi %.2f\n", pi);//소수점 2째자리까지 출력(3째자리에서 반올림)
        System.out.printf("a %04d\n", a);//4자리 출력 앞에 빈자리는 0으로 채우기(오른쪽기준)
        System.out.printf("a %-4d\n", a);//왼쪽 기준으로 4자리 출력하기
    }
}
