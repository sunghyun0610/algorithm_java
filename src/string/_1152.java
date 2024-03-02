package string;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class _1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();//String은 배열이 아니므로 인덱스로 바로 접근 불가
        int cnt = 0;
        String[] list = str.trim().split("\\s+");//split 함수 : 문자열을 배열로 분리하기 위해 자주 사용
        //trim은 문자열 앞뒤 공백을 제거하기 위한 것. 내부 공백이 아닌 오직 앞뒤만 제거!
        if(str.trim().isEmpty()){
            cnt=0;
            // 입력된 문자열이 공백만 있을 경우 단어 수는 0
        }
        else {
            // 공백으로 분리된 단어의 수 계산
            cnt=list.length;
        }
        System.out.println(cnt);
    }
}
//공백은 단어로 취급 X 오직 단어를 구분하는 역할