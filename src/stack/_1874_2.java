package stack;

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1874_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        int [] num=new int[n];
        Stack<Integer> numStack= new Stack<>();
        numStack.push(1);
        int cnt=2;
        int max=0;//스택  peek와 비교하면서 최댓값이 아니면 NO출력해야함.
        sb.append("+\n");
        String wrong="NO";
        String result="";
        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(br.readLine());
            if(numStack.peek()>num[i]){
                System.out.println(wrong);
                result="NO";
                break;//스택 젤 상단보다 입력이 작으면 그건 못만듬
            }
            else {
                if(num[i]==numStack.peek()){
                    numStack.pop();
                    sb.append("-\n");
                    if(numStack.isEmpty()&& i<n-1){
                        numStack.push(cnt);
                        cnt++;
                        sb.append("+\n");
                    }
                }
                else if(num[i]>numStack.peek()){
                    while(num[i]>numStack.peek()){
                        numStack.push(cnt);
                        cnt++;
                        sb.append("+\n");
                    }
                    numStack.pop();
                    sb.append("-\n");
                }
            }
        }
        if(!"NO".equals(result)){
            System.out.println(sb.toString());
        }

    }
}

//스택은 Last In first Out 이다.
//스택은 오름차순으로 push된다.
//수열 중에서 작은수를 먼저 꺼내라하면 그건 불가능하다.
