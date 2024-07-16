package day01;

public class ArrayTest {
    public static void main(String[] args) {
        int [] arr=new int[5];//배열은 0으로 자동 초기화

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        for(int num : arr){
            System.out.println(num);
        }
    }
}
