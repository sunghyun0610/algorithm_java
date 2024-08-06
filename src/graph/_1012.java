package graph;

import java.util.LinkedList;

class Graph{
    class Node{
        int data;
        LinkedList<Node> adjacent;
        boolean marked;
        Node(int data){
            this.data =data;
            this. marked =false;
            adjacent = new LinkedList<>();
        }
    }

}

public class _1012 {
    public static void main(String[] args) {

    }
}

/*
* 이게왜 그래프로 풀리는 문제인지 알아보는 시간~
*1.인접한 다른 배추로 이동 가능
* 2.상하좌우 네 방향에 다른 배추가 위치한 경우에 서로 인접해 있는 것.
* ->최소 몇마리의 지렁이가 필요한가 -> 서로 인접해있는 배추들이 몇 군데에 퍼져있나
*
* 어떤게 정점? : 한 칸이 정점 new Point(x,y) 총 60개의 정점이있다 예시로 치면 -> 정점이 2차 배열로 표현됨 x좌표 y좌표 dfs(int x, int y)
* 아까 문제는 숫자하나로 정점이 표시되었으므로 dfs(int node)로만 풀 수 있다.
* 어떤게 간선? :
* 내 친구 후보가 4칸(상/하/좌/우)로 제한됨. 즉 갈 수 있는 간선이 최대 4개임
* */