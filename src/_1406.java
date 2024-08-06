import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1406 {
    public static void main(String[] args)throws IOException {
        StringBuilder sb= new StringBuilder();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        String str=st.nextToken();//초기 문자열 입력받기
        sb.append(str);//sb에 문자열 복사 완료.
//        System.out.println(sb.toString());
        int N=sb.length();//문자열의길이
        int cursor=N;//문장의 맨뒤 = 마지막 문자의 오른쪽
        //System.out.println(str.charAt(cursor-1));//이게 마지막 문자가르킴.
        st=new StringTokenizer(br.readLine());
        int M=Integer.parseInt(st.nextToken());

        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            String order=st.nextToken();
            switch(order){
                case "L":
                    if(cursor>0) cursor--;
                    else continue;
                    break;
                case "D":
                    if(cursor<sb.length()) cursor++;//커서가 문장의 맨뒤가 아닌경우
                    else continue;
                    break;
                case "B":
                    if(cursor<=0) continue;
                    else{ sb.deleteCharAt(cursor-1);//cursor왼쪽 원소 제거
                        cursor--;
                         }
                    break;
                case "P":
                    String tmp=st.nextToken();//공백 기준 새 문자
                    sb.insert(cursor,tmp);
                    cursor++;
                    break;
            }
        }
        System.out.println(sb.toString());

    }
}
