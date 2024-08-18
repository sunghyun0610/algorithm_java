package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());//테스트 케이스
        String str;
        int cnt_l;
        int cnt_r;

        for(int i=0;i<T; i++){
            str=br.readLine();//문자열 입력받기
            String tmp="YES";
            cnt_l=0;
            cnt_r=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='(') cnt_l++;
                else if (str.charAt(j)==')')cnt_r++;
                if(cnt_r>cnt_l) {
                    System.out.println("NO");
                    tmp="NO";
                    break;
                }
            }
            if("YES".equals(tmp)){
                if(cnt_r==cnt_l) System.out.println("YES");
                else if (cnt_r!=cnt_l) System.out.println("NO");
            }

        }
    }
}

//이렇게하는게 아니라 그냥 열었으면 그만큼 닫아야되네.
//전체 개수만 똑같으면 되는게 아님.
//시작은 ( 끝은 )여야함.
//)개수가 ( 보다 초과하는 순간 그건 안된다.