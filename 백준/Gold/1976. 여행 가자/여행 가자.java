import java.util.Scanner;

public class Main {

    static int[][] city;
    static int[] travel;
    static int N;
    static int cnt=0;
    static int[] parent;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        N = sc.nextInt();// 도시의 수
        int M =sc.nextInt(); //여행 계획에 속한 도시들의 수
        city = new int[N+1][N+1];//1번  도시부터 시작하기 때문
        parent = new int[N+1];

        for(int i=1;i<N+1;i++){
            parent[i] = i;//대표노드 자기자신으로 초기화
        }

        for(int i=1;i<N+1;i++){
            for(int j=1;j<N+1;j++){
                city[i][j]=sc.nextInt();
                if(city[i][j]==1){
                    union(i,j);
                }
            }
        }//도시 정보까지 입력 완료
        travel = new int[M];
        for(int i=0;i<M;i++){
            travel[i]=sc.nextInt();
        }//여행 순서 입력완료


        for(int i=0;i<M-1;i++){
            if(find(travel[i]) != find(travel[i+1])){
//                System.out.println(find(travel[i]));
//                System.out.println(find(travel[i+1]));
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
    static int find(int x){
        if(x!=parent[x]){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    static void union(int start, int end){
        int x = find(start);
        int y =find(end);

        if(x!=y) {
            if (x > y) {
                parent[x] = y;
            } else {
                parent[y] = x;
            }
        }
    }
}
//같은도시 중복 방문 가능
//일단 부분적으로 갈 수 있는지 확인한다
//유니온 파인드? -> 어떻게 연결되어있는지 모르고 그냥 연결되어있는지만 알면 되자나!