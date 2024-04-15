package two_pointer;
import java.util.Scanner;

// 슬라이딩 윈도우 : '범위'가 일정한 투 포인터라고 생각하면 됨.
public class _12891 {
    //P와 S의 길이가 1000000백만으로 크기때문에 시간복잡도 고려해야함. O(N)으로 풀어야한다는 결론
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();//문자열 길이 A,C,G,T만 사용가능
        int P=sc.nextInt();//부분 문자열 길이
        String str=sc.next();
        int [] dna=new int[4];
        for(int i=0;i<4;i++){
            dna[i]=sc.nextInt();
        }
        int cnt=0;
        int start_index=0;
        int [] count= new int[4];
        for(int i=0;i<P;i++){//처음 슬라이딩 윈도우 만들어 놓고 앞뒤로 하나씩만 줄이고 늘려가면서 진행한다.
            if(str.charAt(i)=='A')
                count[0]++;
            else if(str.charAt(i)=='C')
                count[1]++;
            else if(str.charAt(i)=='G')
                count[2]++;
            else if (str.charAt(i)=='T')
                count[3]++;
        }
        if(count[0]>=dna[0] && count[1]>=dna[1] && count[2]>=dna[2] && count[3]>=dna[3] ) cnt++;

        for(int j=P;j<S;j++){
            int pre_index=j-P;
            if(str.charAt(pre_index)=='A') count[0]--;
            else if(str.charAt(pre_index)=='C') count[1]--;
            else if(str.charAt(pre_index)=='G') count[2]--;
            else if(str.charAt(pre_index)=='T') count[3]--;

            if(str.charAt(j)=='A') count[0]++;

            else if(str.charAt(j)=='C') count[1]++;

            else if(str.charAt(j)=='G') count[2]++;

            else if(str.charAt(j)=='T') count[3]++;

            if(count[0]>=dna[0] && count[1]>=dna[1] && count[2]>=dna[2] && count[3]>=dna[3] ) cnt++;
        }


        System.out.println(cnt);
    }
}
