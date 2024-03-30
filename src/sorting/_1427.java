package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1427 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int []num=new int[str.length()];
        for (int i=0;i<str.length();i++){
            num[i]=Character.getNumericValue(str.charAt(i));// Character,getNumericValue : 단일문자 정수 변환

        }

    }
}
