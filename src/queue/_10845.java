package queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _10845 {
    static int tmp;
    public static void main(String [] args)throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));//입력받기
        StringTokenizer st= new StringTokenizer(br.readLine());//공백기준으로 문자열 분리
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int N= Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());//초기화
            String str=st.nextToken();


            switch(str){
                case "push":
                    String str2=st.nextToken();//공백 다음수 읽기
                    tmp=Integer.parseInt(str2);
                    queue.add(tmp);
                    break;
                case "pop":
                    if(!queue.isEmpty()) bw.write(queue.remove()+"\n");
                    else bw.write("-1"+"\n");//큐가 비어있는 경우
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if(!queue.isEmpty()) bw.write("0"+"\n");
                    else bw.write("1"+"\n");
                    break;
                case "front" :
                    if(queue.isEmpty()) bw.write("-1"+"\n");
                    else bw.write(queue.peek()+"\n");//가장 앞에 있는 정수 출력
                    break;
                case "back":
                    if (queue.isEmpty()) bw.write("-1"+"\n");
                    else bw.write(tmp+"\n");
            }
        }
        bw.flush();
        bw.close();
        
    }
}
// 정수 + 문자열 ==> 문자열