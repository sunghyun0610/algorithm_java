package string;

import java.util.Arrays;
import java.util.Scanner;

public class _10809 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int [] Alphabet=new int[26];//automatically 0으로 초기화 됨.
        Arrays.fill(Alphabet,-1);//배열값 전부 -1로 초기화
        for(int i=0; i<S.length(); i++){
            for(int j=0;j<26;j++){
                if(S.charAt(i)==j+97 && Alphabet[j]<0){
                    Alphabet[j]=i;//위치 저장
                }
            }

        }

        for(int k=0;k<Alphabet.length;k++){
            System.out.print(Alphabet[k]+ " ");
        }

    }
}
//소문자 아스키코드 :97~122