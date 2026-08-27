import java.util.*;

class Solution {
    static class Server{
        int addTime; //증설된 시간
        Server(int addTime){
            this.addTime = addTime;
        }
    }
    
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int time=0;
        List<Server> serverList = new ArrayList<>();
        
        for(int i=0;i<24;i++){
            int player = players[i];
                        for(int j = serverList.size() - 1; j >= 0; j--){
    Server server = serverList.get(j);

    if(i - server.addTime == k){
        serverList.remove(j);
    }
}
            int needServer = getServerCnt(player,m);
            int currServerCnt = serverList.size();
            int addServerCnt = needServer - currServerCnt;
            // System.out.println("현재 시간 : "+ i + "현재 가용중인 서버수"+currServerCnt);
            if(addServerCnt>0){
                for(int j=0;j<addServerCnt;j++){
                    serverList.add(new Server(i));
                    
                }
                answer+=addServerCnt;
                // System.out.println("현재 시간 : "+ i + "필요한 서버수"+needServer);
                // System.out.println("현재 시간 : "+ i + "현재 가용중인 서버수"+currServerCnt);
                // System.out.println("현재 시간 : "+ i + " 증설해야하는 서버 수"+addServerCnt);
            }

            
            
        }
        
        return answer;
    }
    private int getServerCnt(int player, int m){
        //이 사용자일때 서버 몇대 증설해야하는지 계산
        int n = 0;//가용해야하는 서버 수
        if(player<m) return 0 ;
        else{
            while(true){
                if(player>= m*n && player<m*(n+1)){
                    break;
                }
                n++;
            }
        }
        return n;
    }
}
//증설 기준 사용자 m명, 서버 증설하면 k시간 운영 가능
//모든 사용자가 이용하기 위해서 최소 몇번 증설해야하는지?