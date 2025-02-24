import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] len = new int[N-1];//도시사이 거리
        int[] price = new int[N];//도시별 리터당 기름 값

        for(int i=0;i<N-1;i++){
            len[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++){
            price[i] = sc.nextInt();
        }

        long answer=0;

        int i=0;
        while(i<N-1){
            int tmp=0;
            int tmpPrice=price[i];
            while((i+tmp)<N-1 && tmpPrice<=price[i+tmp]){
                answer+=tmpPrice*len[i+tmp];
                tmp++;
            }
            i+=tmp;
        }
        //현재 기름이 다음 칸까지는 갈수있어야함

        System.out.println(answer);


    }
}
//기름통의 크기는 무제한
//1km 이동 == 1리터 기름
//각 도시에 1나의 주유소, 각 도시마다 가격 다름
//2번째 부터 그 이후로 나보다 싼 가격이 나올때 까지 다넣어버림
