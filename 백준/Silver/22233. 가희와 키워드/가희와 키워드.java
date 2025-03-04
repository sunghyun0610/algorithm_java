import java.util.*;

public class Main {
    static int answer;
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();//메모장에 적은 키워드 개수
        int M = sc.nextInt();// 글 개수
        Set<String> keyword = new HashSet<>();
        for(int i=0;i<N;i++){
            String str= sc.next();
            keyword.add(str);
        }//키워드 입력 완료




        answer=N;//빼가는 형식
        for(int i=0;i<M;i++){
            String str = sc.next();
            String [] tmp = str.split(",");

            int idx=0;
            while(idx<tmp.length){
                String use = tmp[idx];
              if(keyword.contains(use)){
                  keyword.remove(use);
                  answer--;
              }
                idx++;
            }
            System.out.println(answer);
        }




    }
}
//키워드 모둗 다르며 N개존재
//한개의 글에 최대 10개 키워드 사용 ->< 사용되면 키워드는 메모장에서 지워짐
//구지 메모장에 있는 키워드를 안쓰는 경우도 있음
//한 키워드는 여러 글에 있을 수 있음
//글을 쓰고 나서 메모장에 남아있는 키워드 수가 몇개인지
