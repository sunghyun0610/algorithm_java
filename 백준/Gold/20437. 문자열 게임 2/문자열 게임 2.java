import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            String str = sc.next();
            int K = sc.nextInt();
            if(K==1){
                System.out.println(1 +" "+1);
                continue;
            }
            int min= Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            boolean bool = false;
            List<Integer>[] alpha = new ArrayList[26];
            for(int k=0;k<26;k++){
                alpha[k] = new ArrayList<>();//초기화 해줘야댐
            }
            int idx=0;
            while(idx<str.length()){
                char ch = str.charAt(idx);
                int tmp = ch-'a';
                alpha[tmp].add(idx);//위치 저장
                idx++;
            }//이상 위치 저장끝
            for(int j=0;j<26;j++){
                int len=alpha[j].size();
                if(len<K) continue;
                else{
                    for(int l=0;l<len-K+1;l++){
                        int strSize = alpha[j].get(l+K-1) - alpha[j].get(l)+1;//이러면 k개까지 길이 나옴
                        if(strSize<min){
                            min=strSize;
                            bool=true;
                        }
                        if(strSize>max){
                            max=strSize;
                        }
                    }
                }
            }
            if(!bool){
                System.out.println(-1);
                continue;
            }

            System.out.println(min+" "+max);


        }

    }
}
//문자열 W, 양의 정수 K
//어떤 문자를 정확히 K개 포함하는 가장 짧은 연속 문자열 길이를 구한다
//어떤 문자를 정확히 K개 포함하고, 문자열의 첫 번쨰와 마지막 글자가 해당 문자로 같은 가장 긴 문자열의 길이를 구한다 == K개 찾으면 바로 끝이네
//위 방식으로 게임을 T회 진행
//없으면 -1