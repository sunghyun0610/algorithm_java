package implementation;

import java.util.Scanner;

public class _1978 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=  sc.nextInt();
        int []num=new int[N];
        int cnt=0;//약수 개수세기
        int cnt_num=0;
        for(int i=0;i<N;i++){
            num[i]=sc.nextInt();
            int sqrt= (int)Math.sqrt(num[i]);
            cnt_num=0;
            if(num[i]==2||num[i]==3) {
                cnt++;
            }else if(num[i]>3){
                for(int j=2;j<=sqrt;j++){
                    if(num[i]%j==0){//나머지가 0이다 즉 나누어떨어진다
                        cnt_num++;
                    }
                }
                if(cnt_num==0) cnt++;
            }

        }
        System.out.println(cnt);

    }
}
//주어진 수 중  소수를 찾는 것.
//소수의 조건 : 1, 자기자신을 제외한 나누어떨어지는 수 없어야함.
//제곱근 만큼만 탐색하면됨
//1은 소수가 아니고 2는 소수이다