package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());//이미 심어져있는 가로수의 수
        int []tree=new int[N];
        List<Integer> list =new ArrayList<>();//사이 간격을 저장할 리스트
        for(int i=0;i<N;i++){
            tree[i]=Integer.parseInt(br.readLine());
        }//나무 심어져있는 위치 입력받기
        int min_dis=Integer.MAX_VALUE;
        for(int i=0;i<N-1;i++){
            int dis=tree[i+1]-tree[i];
            list.add(dis);//간격 저장됨
        }//가장 작은 간격 찾기
        min_dis=findGcd(list);//최대 공약수 찾음
        System.out.println(findGcd(list));




        int cnt=0;
        int start=tree[0];
        while (start<=tree[N-1]){
            start+=min_dis;
            cnt++;
        }
        cnt=cnt-N;
        System.out.println(cnt);

    }
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(x,x%y);
    }
    public static int findGcd(List<Integer> numList){
        int result=numList.get(0);
        for(int i=1;i<numList.size();i++){
            gcd(result,numList.get(i));
            if(result==1) break;
        }
        return result;
    }
}
//int는 최대 21억까지 ㄱㄴ
