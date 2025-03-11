import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer=0;
        int H =sc.nextInt();
        int W = sc.nextInt();
        int[][] world = new int[H][W];
        for(int i=0;i<W;i++){
            int x =sc.nextInt();
            for(int j=0;j<x;j++){
                world[j][i]=1;//
            }
        }//세계에 블록 배치완료

        for(int i=0;i<H;i++){
            for(int j=1;j<W-1;j++){
                int currH= i;
                int currW=j;
                if(i==0&& world[currH][currW]!=1){
                    if(world[currH][currW-1]==1){
                        int next=currW;
                        while(next<W && world[currH][next]!=1){
                            next++;
                        }
                        if(next==W){//끝까지 안막혀있다는 것
                            break;
                        }
                        answer+=next-currW;
                        for(int k=currW; k< next;k++){
                            world[currH][k]=1;
                        }

//                        System.out.println("바닥"+currH);
//                        System.out.println(currW);
                    }
                }
                else if(i>0 && world[currH][currW]!=1){
                    if(world[currH][currW-1]==1 && world[currH-1][currW]==1){
                        if(world[currH][currW-1]==1){
                            int next=currW;
                            while(next<W && world[currH][next]!=1){
                                next++;
                            }
                            if(next==W){//끝까지 안막혀있다는 것
                                break;
                            }
                            answer+=next-currW;
                            for(int k=currW; k< next;k++){
                                world[currH][k]=1;
                            }


                        }

                    }
                }
            }
        }

        System.out.println(answer);
    }
}
//빗물 고일 조건 : 아래, 옆 ,오른쪽이 막혀있어야함
//바닥이여도 아래는 막힌 거임
//세계의 옆, 오른쪽은 안막힌 거임
//바로옆이 안막혀있어도 ㄱㅊ -> 이건 직사각형 찾는 문제네