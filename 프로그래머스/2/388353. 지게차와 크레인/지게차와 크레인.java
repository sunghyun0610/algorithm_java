import java.util.*;

class Solution {
    static class Point{
        int x;
        int y;
        Point(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    int [] dx={-1,1,0,0};
    int [] dy={0,0,-1,1};
    public int solution(String[] storage, String[] requests) {
        int answer = 0;
        int row = storage.length;
        int col = storage[0].length();
        boolean [][] visited = new boolean[row][col];
        char [][] str = new char [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                str[i][j] = storage[i].charAt(j);
            }
        }
        
        for(String request : requests){
            if(request.length()==1){
                useCar(str,request);
            }else if(request.length()==2){
                useKrain(str,request);
            }
            // for(char[] k : str){
            //     System.out.println(Arrays.toString(k));
            // }
        }
        for(char[] k : str){
            for(char ch : k){
                if(ch!='0') answer++;
            }
        }
        return answer;
    }
    private void useCar(char [][] str, String request){
         char ch = request.charAt(0);
        // System.out.println(ch);
        int row = str.length;
        int col = str[0].length;
        List<Point> list = new ArrayList<>();
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                boolean [][] visited = new boolean[row][col];
                if(str[i][j]==ch && isAccessible(visited,i,j,str)){  
                    // 여기에 상하좌우 중에 하나라도 visited= true여야 접근가능한거임
                    // System.out.println("제거하는 컨테이너 " +i +","+j);
                    list.add(new Point(i,j));
                    // visited[i][j] = true;
                }
            }
        }
        for(Point p : list){
            int x = p.x;
            int y = p.y;
            str[x][y] = '0';
        }
    }
    
    private boolean isAccessible(boolean[][] visited , int x, int y, char [][] str){
        int row = visited.length;
        int col = visited[0].length;
        visited[x][y] = true;
        if(x==0||y==0 || x==row-1 || y==col-1) {
            // System.out.println("여기 안들어옴?" +x +","+y);
            return true;
        }
            
            
        for(int i=0;i<4;i++){
            int nextX = x +dx[i];
            int nextY = y + dy[i];
            if(str[nextX][nextY]=='0'&&!visited[nextX][nextY]){
                if(isAccessible(visited, nextX, nextY, str)){
            return true;
        }
            }
        }
        
        return false;
    }
    
    private void useKrain(char [][] str, String request){
        char ch = request.charAt(0);
        // System.out.println(ch);
        int row = str.length;
        int col = str[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(str[i][j]==ch){
                    str[i][j] = '0';
                }
            }
        }
    }
}
//특정 종류 컨테이너 추고 요청 -> 접근이 가능한 해당 종류 컨테이너 모두 꺼낸다
//모든 요청을 수행한후 남은 컨테이너 수
//알파벳 1개 요청 -> 지게차 사용 (접근 가능한 컨테이너만 꺼냄)
// 알파벳 2번 반복된 경우 -> 크레인 사용 : 그냥 다 꺼냄

// 문제 2. 옆에 빈 요소가 막혀있는건데 접근가능한 것처럼됨 (접근 가능 로직이 잘못됨)