package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _18352 {
    //1~N번까지 도시와 M개의 단방향 도로가 존재. 모든 도로의 거리는 1이다.
    Scanner sc= new Scanner(System.in);
    int N=sc.nextInt();//도시의 개수
    int M=sc.nextInt();//도로의 개수
    int K=sc.nextInt();//거리 정보, 최단거리가 K인 모든 도시들의 번호를 출력하라
    int X=sc.nextInt();//출발 도시의 번호

    static ArrayList<Integer>[] A;//인접 리스트로 가중치 없는 그래프 표현하기
    static int [] visited;
    static List<Integer> answer;
    //BFS배우고 오기
}
