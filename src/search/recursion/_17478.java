package search.recursion;

import java.util.Scanner;

public class _17478 {
    static int N;
    static String str1 = "\"재귀함수가 뭔가요?\"";
    static String str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static String str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static String str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    static String str5 = "라고 답변하였지.";
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();//몇번 재귀할건지
        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");



        recursion(0);
        System.out.print(sb.toString());
    }
    public static void print(int cnt,String msg){
        for(int i=0;i<cnt;i++){
            sb.append("____");
        }
        sb.append(msg+"\n");
    }

    public static void recursion(int cnt){
//        for(int i=0;i<cnt;i++){
//            sb.append("____");
//        }-> ____찍는게 계속 중복되서 따로 메서드로 뺌
//        sb.append(str1);//재귀함수가 뭔가요?
        print(cnt,str1);
        //종료 조건 cnt==N이되면 재귀함수는 자기 자신을 호출하는 함수라네 하며 종료
        if(cnt<N){
            print(cnt,str2);
            print(cnt,str3);
            print(cnt,str4);
            recursion(cnt+1);//증가시켜줘야 끝나지
        }
        else {
            print(cnt,"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        }
        print(cnt,str5);
    }


}
//문자열 조작이 많이 일어날 때는 StringBUilder가 필수이다.