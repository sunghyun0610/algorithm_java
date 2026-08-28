import java.util.*;

class Solution {
    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    static int count;
    public int solution(String dirs) {
        int answer = 0;
        int[][] map = new int[11][11];
        count = 0;
        Point startP = new Point(0,0);
        Set<String> set = new HashSet<>();
        
        for(int i=0;i<dirs.length();i++){
            char dirChar = dirs.charAt(i);
            String dir = Character.toString(dirChar);
            Point currP = startP;
            startP = move(dir,currP,set);
            
        }
        // for(String s : set){
        //     System.out.println(s);
        // }
        answer = set.size();
        return answer;
    }
    private Point move(String dir, Point p, Set<String> set){
        int nextX = p.x;
        int nextY = p.y;
        
        if(dir.equals("U")){
            nextX = p.x+1;
            if(nextX>=-5 && nextX<=5 && nextY>=-5 && nextY<=5){
                String str = p.x+""+p.y+""+nextX+""+nextY;
                String strReverse = nextX+""+nextY+""+p.x+""+p.y;
                if(!set.contains(str) && !set.contains(strReverse)){
                    set.add(str);
                }
                return new Point(nextX, nextY);
            }
        }
        else if(dir.equals("D")){
            nextX = p.x-1;
             if(nextX>=-5 && nextX<=5 && nextY>=-5 && nextY<=5){
                String str = p.x+""+p.y+""+nextX+""+nextY;
                String strReverse = nextX+""+nextY+""+p.x+""+p.y;
                if(!set.contains(str) && !set.contains(strReverse)){
                    set.add(str);
                }
                return new Point(nextX, nextY);
            }
        }
        else if(dir.equals("R")){
            nextY = p.y+1;
            if(nextX>=-5 && nextX<=5 && nextY>=-5 && nextY<=5){
                String str = p.x+""+p.y+""+nextX+""+nextY;
                String strReverse = nextX+""+nextY+""+p.x+""+p.y;
                if(!set.contains(str) && !set.contains(strReverse)){
                    set.add(str);
                }
                return new Point(nextX, nextY);
            }
        }
        else if(dir.equals("L")){
            nextY = p.y-1;
             if(nextX>=-5 && nextX<=5 && nextY>=-5 && nextY<=5){
                String str = p.x+""+p.y+""+nextX+""+nextY;
                String strReverse = nextX+""+nextY+""+p.x+""+p.y;
                if(!set.contains(str) && !set.contains(strReverse)){
                    set.add(str);
                }
                return new Point(nextX, nextY);
            }
        }
        return p;
    }
}
//5*5 사이즈 map
//처음 걸어본 길의 길이를 구하려고 한다
//이점을 방문했냐가 아닌 새로운 경로냐가 중요한거라서