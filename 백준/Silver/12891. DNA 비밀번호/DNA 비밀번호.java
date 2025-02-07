

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer=0;

        int S = sc.nextInt();
        int P = sc.nextInt();
        String str = sc.next();
        int [] dna =new int[4];
        for(int i=0;i<4;i++){
            dna[i]=sc.nextInt();
        }//입력받기 완료
        int[] cnt = new int[4];//부분문자열마다 카운트
        for(int i=0;i<P;i++){
            char ch = str.charAt(i);
            if(ch =='A') cnt[0]++;
            else if(ch =='C') cnt[1]++;
            else if(ch =='G') cnt[2]++;
            else if(ch =='T') cnt[3]++;
        }//일단 첫번째꺼 카운트

        if(dna[0]<=cnt[0] && dna[1]<=cnt[1] && dna[2]<= cnt[2] && dna[3] <= cnt[3]){
            answer++;
        }
        for(int i=1;i<=S-P;i++){
            char start = str.charAt(i-1);
            if(start =='A') cnt[0]--;
            else if(start =='C') cnt[1]--;
            else if(start =='G') cnt[2]--;
            else if(start =='T') cnt[3]--;

            char end = str.charAt(i+P-1);
            if(end =='A') cnt[0]++;
            else if(end =='C') cnt[1]++;
            else if(end =='G') cnt[2]++;
            else if(end =='T') cnt[3]++;

            if(dna[0]<=cnt[0] && dna[1]<=cnt[1] && dna[2]<= cnt[2] && dna[3] <= cnt[3]){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
//부분 문자열 + 고정된 길이 -> 슬라이딩 윈도우
//모든 문자가 ACGT로 이루어짐이 보장
