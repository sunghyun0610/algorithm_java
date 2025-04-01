import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        String str = scanner.next();
        int len = N;
        int idx=0;
        char first = str.charAt(0);
        char last = str.charAt(len-1);
        int red =0;
        int blue =0;
        int cnt =0;
        while(idx<len){
            if(str.charAt(idx)=='R'){
                red++;
            }
            else if(str.charAt(idx)=='B'){
                blue++;
            }
            idx++;
        }//blue , red 몇개씩인지 카운트

        if(first == last){//처음과 끝이 같을 때
            int firstChar =0;//처음부터 얼마나 연속되는지
            int lastChar =0;//뒤부터 얼마나 연속되는지
            idx=0;
            while(idx<len && str.charAt(idx)==first){
                firstChar++;
                idx++;
            }
            if(idx==len){//다  똑같은 문제인 경우
                System.out.println(0);
                return;
            }
            idx=len-1;
            while (idx>=0 && str.charAt(idx)==last){
                lastChar++;
                idx--;
            }

            if(firstChar<lastChar){
                if(first=='R'){
                    red-=lastChar;
                }
                else if(first=='B'){
                    blue-=lastChar;
                }
            }
            else{
                if(first=='R'){
                    red-=firstChar;
                }
                else if(first=='B'){
                    blue-=firstChar;
                }
            }

            if(red<blue){
                cnt=red;
            }
            else{
                cnt=blue;
            }
            
        }
        else{// 시작과 끝 다를 때
           int tmp =0;
           int firstCnt=0;
           int lastCnt=0;
           while(tmp<len && str.charAt(tmp)==first){
               firstCnt++;
               tmp++;
           }
           tmp=len-1;
           while(tmp>=0 && str.charAt(tmp)==last){
               lastCnt++;
               tmp--;
            }
           if(first =='R'){
               red-=firstCnt;
               blue-=lastCnt;
           }
           else if(first=='B'){
               red-=lastCnt;
               blue-=firstCnt;
           }
           if(red<blue){
               cnt=red;
           }
           else{
               cnt=blue;
           }
        }
        System.out.println(cnt);
    }
}
//볼을 옮겨서 같은 색 볼끼리 인접하게 놓이도록 하려한다
//옮기는 규칙
// 1.바로 옆에 다른 색깔의 볼이 있으면 그 볼을 모두 뛰어 넘어 옮길 수 있다
// 2. 옮길 수 있는 볼의 색깔은 한 가지이다.
//총 6가지 경우의수
/*
* 1.R이 왼쪽 B가 오른쪽정렬
* 2.R오른쪽 b왼쪽
*/