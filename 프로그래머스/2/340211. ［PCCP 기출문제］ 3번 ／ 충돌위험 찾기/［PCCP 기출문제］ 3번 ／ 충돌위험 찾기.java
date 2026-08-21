import java.util.*;

class Solution {
    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Point)) return false;

        Point p = (Point)o;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }
    }
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        int robotNum = routes.length;
        List<List<Point>> list = new ArrayList<>();
        
        for(int i=0;i<robotNum;i++){
            int[] route = routes[i];
            List<Point> tmp = findRoot(route, points);
            list.add(tmp);
        }
        int maxTime =0;
        for(List<Point> k:list){
            int size = k.size();
            maxTime = Math.max(maxTime,size);
        }
        int time=0;
        
        while(time<=maxTime){
            Set<Point> set = new HashSet<>();
            Set<Point> collision = new HashSet<>();
            for(int i=0;i<robotNum;i++){
                List<Point> tmp = list.get(i);
                if(tmp.size()<=time) continue;
                Point p = tmp.get(time);
                if(set.contains(p)){
                    collision.add(p);
                }
                else set.add(p);
            }
            time++;
            answer+=collision.size();
        }
        return answer;
    }
    static List<Point> findRoot(int[] routes, int[][]points){
        int cnt=1;
        int pointIndex = routes[0];
        int currX = points[pointIndex-1][0];
        int currY = points[pointIndex-1][1];

        List<Point> list = new ArrayList<>();
        list.add(new Point(currX,currY));
        while(cnt<routes.length){
            int nextPointIndex = routes[cnt];
            int nextXPoint = points[nextPointIndex - 1][0];
            int nextYPoint = points[nextPointIndex - 1][1];
            if(currX<nextXPoint){
                currX+=1;
            }
            else if(currX>nextXPoint){
                currX-=1;
            }
            else{//높이는 맞췄을 때
                if(currY<nextYPoint){
                    currY++;
                }
                else if(currY>nextYPoint){
                    currY--;
                }
            }
            list.add(new Point(currX,currY));
              if (currX == nextXPoint && currY == nextYPoint) {
            cnt++;
        }
        }
        return list;
    }
    
}
//로봇별로 경로를 모두 저장한다
// 시간 별로 로봇들의 경로 충돌 여부를 검사한다