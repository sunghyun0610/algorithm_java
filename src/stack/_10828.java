package stack;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class _10828 {
    public static void main(String[] args)throws IOException {

        Stack<Integer> stack = new Stack<>();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String order=br.readLine();//명령어 입력

            if(order.contains("push")){
                String tmp=order.substring(5);
                int num=Integer.parseInt(tmp);
                stack.push(num);
            }
            else if(order.contains("pop")){
                if(!stack.isEmpty()){
                    bw.write(stack.pop()+"\n");
                }
                else{
                    bw.write("-1\n");
                }
            }
            else if(order.contains("size")){
                bw.write(stack.size()+"\n");
            }
            else if(order.contains("empty")){
                if(!stack.isEmpty()){
                    bw.write("0"+"\n");//안비어있으면 0
                }
                else {
                    bw.write(("1"+"\n"));//비어있으면 1
                }
            }
            else if(order.contains("top")){
                if(!stack.isEmpty()){
                    bw.write(stack.peek()+"\n");
                }
                else{
                    bw.write("-1"+"\n");
                }
            }
    }
        bw.flush();
        bw.close();

        }

}

/*
* nextInt 이후에 nextLine을 바로 사용하는 것과 관련이 있을 수 있습니다.
*  nextInt는 정수를 읽고, 다음 줄로 넘어가지 않고 남은 줄의 끝을 읽습니다. 이로 인해 첫 번째 명령어를 제대로 읽지 못하게 됩니다.
* */

//입 출력 한번에 하기위해 버퍼이용