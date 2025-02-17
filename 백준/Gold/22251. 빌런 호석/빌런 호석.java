import java.util.Scanner;

public class Main {
    static boolean[] visited;
    static int[][] num;
    static int cnt;
    static int [][] diff;
    static int [][] changes;
    static String temp;
    static int answer;
    static int N,K,P,X;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();//1~N층 까지 가는 엘리베이터
        K = sc.nextInt();// 디스플레이에 표시되는 자리수 k
        P = sc.nextInt();//1~p개 반전시키기
        X = sc.nextInt();//실제 멈추어있는 층수 x

        num = new int[10][7];
        num[0] = new int[]{1, 1, 1, 1, 1, 1, 0};
        num[1] = new int[]{0, 1, 1, 0, 0, 0, 0};
        num[2] = new int[]{1, 1, 0, 1, 1, 0, 1};
        num[3] = new int[]{1, 1, 1, 1, 0, 0, 1};
        num[4] = new int[]{0, 1, 1, 0, 0, 1, 1};
        num[5] = new int[]{1, 0, 1, 1, 0, 1, 1};
        num[6] = new int[]{1, 0, 1, 1, 1, 1, 1};
        num[7] = new int[]{1, 1, 1, 0, 0, 0, 0};
        num[8] = new int[]{1, 1, 1, 1, 1, 1, 1};
        num[9] = new int[]{1, 1, 1, 1, 0, 1, 1};

        diff = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int tmp = 0;
                for (int k = 0; k < 7; k++) {
                    if (num[i][k] != num[j][k]) tmp++;
                }
                diff[i][j] = tmp;
            }
        }//각 숫자들끼리 차이 구함




        String str = String.valueOf(X);


        int len = K - str.length();
        //자릿수 차이 구하기 : 앞에 0 이 붙을 수도 있으니
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append("0");
        }
        sb.append(str);

        String actualDisplay = sb.toString();


        changes = new int[K][10];

        for (int i = 0; i < actualDisplay.length(); i++) {
            int num = Character.getNumericValue(actualDisplay.charAt(i));
            changes[i] = diff[num];
        }
        answer=0;
        villan(0,0,0);
        System.out.println(answer);
    }
    //pos : 현재 처리중인 자리
    //cost : 지금까지 누적된 반전 개수
    //numValue: 지금까지 만든 수
    static void villan(int pos,int cost,int numValue){
        if(pos==K){
            if(cost>0 && cost<=P){
                if(numValue>=1 && numValue<=N && numValue!=X){
                    answer++;
                }
            }
            return;
        }

        for(int j=0; j<10;j++){
            int newCost = cost + changes[pos][j];
            if(newCost <= P){ //이미 P를 초과하면 더 진행할 필요 없음
                villan(pos+1, newCost, numValue*10+j);
            }
        }

    }
}
