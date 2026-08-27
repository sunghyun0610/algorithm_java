import java.util.*;

class Solution {
    static class Server{
        int addTime;
        Server(int addTime){
            this.addTime=addTime;
        }
    }
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int needServerCnt = 0;
        List<Server> serverList = new ArrayList<>();
        
        for(int i=0;i<24;i++){
            int player = players[i];
            for(int j=serverList.size()-1;j>=0;j--){
                Server server = serverList.get(j);
                if(server.addTime+k==i){
                    serverList.remove(j);
                }
            }
            needServerCnt = player/m; //사용자에 따른 필요 서버 대수
            int currServerCnt = serverList.size();//현재 서버 대수
            int addServerCnt = needServerCnt - currServerCnt;
            // System.out.println("시간 : "+i + "현재 서버 대수 : "+currServerCnt);
            if(addServerCnt>0){//서버 증설이 필요하다
               for(int j=0;j<addServerCnt;j++){
                   serverList.add(new Server(i));
               }
               answer+=addServerCnt;
               // System.out.println("시간 : "+i + "서버 증설 횟수 : "+addServerCnt);
            }
        }
        return answer;
    }
}