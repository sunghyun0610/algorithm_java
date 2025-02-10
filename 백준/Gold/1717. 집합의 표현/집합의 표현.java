

import java.util.Scanner;

public class Main {
    static int[] parent;//대표노드 저장 배열
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//집합 최대 원소
        int M = sc.nextInt();//연산의 개수
        parent = new int[n+1];
        for(int i=0;i<=n;i++){
            parent[i]=i;
        }//대표노드 초기화

        for(int i=0;i<M;i++){
            int check = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(check==0){
                union(a,b);
            }
            else if(check==1){
                if(find(a)==find(b)){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }

    }
    static void union(int x, int y){//두개의 집합을 합친다! , 작은게 루트노드
        int rootX = find(x);
        int rootY= find(y);

        if(rootX!=rootY){
            if(rootX<rootY){
                parent[rootY]=rootX;
            }
            else parent[rootX] = rootY;
        }

    }
    static int find(int num){
        if(num != parent[num]){
            parent[num] = find(parent[num]);
        }
        return parent[num];
    }
}
