import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Character> alpha = new HashSet<>();
        StringBuilder sb;


        for(int i=0;i<N;i++){
            String str = br.readLine();
            boolean bool = false;
            sb=new StringBuilder();
            sb.append(str);
            String lowstr=str.toLowerCase();
            String[] options = lowstr.split(" ");
            int idx=0;
            for(String k : options){
                char ch = k.charAt(0);//첫번째 글자부터 확인하기
                if(!alpha.contains(ch)){
                    alpha.add(ch);
                    sb.insert(idx,"[");
                    sb.insert(idx+2,"]");
                    System.out.println(sb.toString());
                    bool=true;
                    break;
                }//1번조건 만족하면 끝나게된다
                idx+=k.length()+1;
            }//1번 탐색 끝
            idx=1;
            if(bool) continue;
            while(idx<str.length()){
                char ch = str.charAt(idx);
                ch = Character.toLowerCase(ch);
                int tmp = ch-'a';
                if(ch!=' '&&!alpha.contains(ch)){
                    alpha.add(ch);
                    sb.insert(idx,"[");
                    sb.insert(idx+2,"]");
                    System.out.println(sb.toString());
                    bool= true;
                    break;
                }
                idx++;
            }
            if(bool) continue;
            System.out.println(sb.toString());

        }

    }
}
