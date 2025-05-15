import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        int[][] bingo = {
                {0,1,2},{3,4,5},{6,7,8},
                {0,3,6},{1,4,7},{2,5,8},
                {0,4,8},{2,4,6}
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while(!str.equals("end")){
            str = br.readLine();
            if(str.equals("end")) break;
            List<Integer> black = new ArrayList<>();
            List<Integer> white = new ArrayList<>();
            List<Integer> blank = new ArrayList<>();

            for(int i=0;i<9;i++){
                if(str.charAt(i)=='X') black.add(i);
                else if(str.charAt(i)=='O') white.add(i);
                else blank.add(i);
            }
//            System.out.println(black.size());
//            System.out.println(white.size());
                //X가 항상 O보다 같거나 1개 많아야함
                //빙고 완성했어? 여부
                boolean success = false;
                int bSuc=0;
                int wSuc=0;
                if(black.size()>=3) {
                    for (int i = 0; i < 8; i++) {
                        success = false;
                        for (int j = 0; j < 3; j++) {
                            if (black.contains( bingo[i][j])) {
                                success = true;
                            } else {
                                success = false;
                                break;
                            }
                        }
                        if (success) {//검정색 빙고가 있다는 뜻
                            bSuc++;
                        }
                    }
                }
                if(white.size()>=3) {
                    for (int i = 0; i < 8; i++) {
                        success = false;
                        for (int j = 0; j < 3; j++) {
                            if (white.contains(bingo[i][j])) {
                                success = true;
                            } else {
                                success = false;
                                break;
                            }
                        }
                        if (success) {//검정색 빙고가 있다는 뜻
                            wSuc++;
                        }
                    }
                }

            if(black.size()==white.size() || black.size()==white.size()+1){
                if(bSuc>0 && wSuc>0){
                    System.out.println("invalid");
                }
                else if(bSuc>0) {
                    System.out.println(black.size()==white.size()+1 ?"valid" :"invalid" );
                }
                else if (wSuc>0){
                    System.out.println(black.size()==white.size() ? "valid" : "invalid");
                }
                else {
                    System.out.println(black.size()+white.size()==9 ? "valid" :"invalid");
                }
            }
            else{
                System.out.println("invalid");
            }


        }

    }
}
//종료조건 칸 다채움 + 검은색 5개 흰색 4개 개수 맞아야함
// 종료 2 : 칸 다 못채움. 검은색 승리 or 흰색 승리 한경우 + 승리한 쪽 돌이 마지막에 놓여있어여함.
//이 두가지 조건이 아닌 이상 다 Invalid이다.
//이게 가능한 최종상태인지만 판단할 수 있으면 됨
//결국 가장 먼저 판단은 3칸 잇는데 성공함? 못함?이야