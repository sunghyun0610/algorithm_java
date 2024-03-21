package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
public class _1874 {
    public static void main(String []args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int [] num=new int[n];
        for (int i=0;i<n;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        int j=0;//j는 pop으로 뽑아낼 때마다 카운트
        Stack<Integer> stackInt = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i=1;
        while(j<n){
            if(!stackInt.isEmpty() && stackInt.peek()==num[j]){ //왜 num[j]ww지?
                stackInt.pop();
                sb.append("-\n");
                j++;
            }
            else {
                if(i>n){
                    System.out.println("NO");
                    return;//아예 종료할때는 return!!!!!!
                }
                stackInt.push(i);
                sb.append("+\n");
                i++;
            }
        }
        System.out.println(sb.toString());
    }

}

/*
* StringBuffer와 StringBuilder는 Java에서 문자열을 다루는 데 사용되는 두 가지 클래스
* */