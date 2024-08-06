package queue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

//deque구하기
public class _10866 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();// deque구현
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));//입 력
        StringTokenizer st= new StringTokenizer(br.readLine());
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));//출력

        int N=Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            String str= st.nextToken();
//            System.out.println(str);
            switch(str){
                case "push_front":
                    String str2=st.nextToken();//공백 뒤 숫자
                    int num=Integer.parseInt(str2);// 문자열 -> 정수 변환
                    deque.addFirst(num);//덱의 앞에 데이터 삽입
                    break;
                case "push_back":
                    String str3=st.nextToken();
                    int tmp2=Integer.parseInt(str3);
                    deque.addLast(tmp2);
                    break;
                case "pop_front":
                    if(!deque.isEmpty()) bw.write(deque.removeFirst()+"\n");
                    else bw.write("-1\n");
                    break;
                case "pop_back":
                    if(!deque.isEmpty()) bw.write(deque.removeLast()+"\n");
                    else bw.write("-1\n");
                    break;
                case "size":
                    bw.write(deque.size()+"\n");
                    break;
                case "empty":
                    if(!deque.isEmpty()) bw.write("0\n");
                    else bw.write("1\n");
                    break;
                case "front":
                    if(!deque.isEmpty()) bw.write(deque.peekFirst()+"\n");
                    else bw.write("-1\n");
                    break;
                case "back":
                    if(!deque.isEmpty()) bw.write(deque.peekLast()+"\n");
                    else bw.write("-1\n");
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
