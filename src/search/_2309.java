package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2309 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int height[]=new int[9];
        int sum=0;//합이 100이면 가능
        for(int i=0;i<9;i++){
            height[i]=Integer.parseInt(bf.readLine());
            sum+=height[i];
        }
        int temp=sum;
        Arrays.sort(height);//오름차순 정리
            //sum에서 2개빼서 100이되면 그게 정답
        //int targetSum = totalSum - 100;  // 전체 합에서 100을 빼서 목표값을 설정 이것도 가능
            int idx[]=new int[9];
            int num1=0;
            int num2=0;

            for(int i=0;i<8;i++){//끝까지 탐색할 필요없다 밑에서 해주니까
                for(int j=i+1;j<9;j++){
                if(sum-height[i]-height[j]==100){
                    num1=i;
                    num2=j;
                    break;
                }
            }
        }
            for(int i=0;i<9;i++){
                if(i==num1 || i==num2){
                    continue;
                }
                System.out.println(height[i]);
            }

    }

}
//7명합 100을 구하라 == 9명합에서 2명을 제외해서 100이 나오면 그 두명을 빼라!
//처음 생각했을때 아니다 싶으면 발상의 전환 해보자
//브루트포스 기법! : 모든 경우의 수를 전부 찾아서 탐색한다