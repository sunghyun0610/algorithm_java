package swea;

import java.util.Scanner;
import java.util.Stack;

public class _1289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();//후입선출
        int T=sc.nextInt();//테스트 케이스 개수
        String[] str = new String[T];
        for(int i=0;i<T;i++){
            str[i]=sc.next();//메모리 원래 값 입력 받음
            for(int j=str[i].length()-1;j>=0;j--){
                char c=str[i].charAt(j);
                stack.push(c);//stack에 다 입력받음
                //System.out.println(stack.peek());//잘 저장됨.
            }
            int cnt=0;
            char tmp='0';
            while (!stack.isEmpty()){
                if(stack.peek()!=tmp){
                    //System.out.println(stack.peek());
                    cnt++;
                    tmp=stack.pop();
                }
                else {tmp=stack.pop();}

            }
            System.out.println("#"+(i+1) +" "+ cnt);
        }



    }
}
//모든비트가 0으로 초기화 되어있음.
//일단 1이 나오기전까지는 0.
//앞이랑 뒤랑 바뀌는 횟수를 구하면 되네.