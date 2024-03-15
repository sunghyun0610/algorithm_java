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

        Stack<Integer> stack=new Stack<>();



    }

}
