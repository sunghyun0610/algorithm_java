class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = null;
        //시작 시간 구하기
        String[] startTime = pos.split(":");
        String currMinute = startTime[0];
        String currSec = startTime[1];
        //끝 시간 구하기
        String[] endTime = video_len.split(":");
        String endMinute = endTime[0];
        String endSec = endTime[1];
        
        int videoEndTime = Integer.valueOf(endMinute)*60 + Integer.valueOf(endSec);
        int currTime = Integer.valueOf(currMinute)*60 + Integer.valueOf(currSec);
       
        //오프닝 타임 구하기
        String[] opStartTime = op_start.split(":");
        String[] opEndTime = op_end.split(":");
        String opStartMinute = opStartTime[0];
        String opStartSec = opStartTime[1];
        String opEndMinute = opEndTime[0];
        String opEndSec = opEndTime[1];
        
        int videoOpStartTime = Integer.valueOf(opStartMinute)*60 + Integer.valueOf(opStartSec);
        int videoOpEndTime = Integer.valueOf(opEndMinute)*60 + Integer.valueOf(opEndSec);
        
        for(String command : commands){
          //오프닝 해당 안되는 경우
             if(currTime>=videoOpStartTime && currTime <=videoOpEndTime){
                currTime = videoOpEndTime;
            }
            
            if(command.equals("prev")){
                    if(currTime<=10){//10초보다 작으면 처음으로
                        currTime =0;
                    }
                    else{ // 10초 줄이기
                        currTime-=10;
                    }
                 if(currTime>=videoOpStartTime && currTime <=videoOpEndTime){
                currTime = videoOpEndTime;
            }
        }
            else if(command.equals("next")){
                    if(currTime+10>=videoEndTime){
                        currTime = videoEndTime;
                    }else{
                        currTime += 10;
                    }
            if(currTime>=videoOpStartTime && currTime <=videoOpEndTime){
                currTime = videoOpEndTime;
            }
            
            }
        }
        
        int finalMin = currTime/60;
        int finalSec = currTime%60;
        StringBuilder sb = new StringBuilder();
        if(finalMin<10){
            sb.append("0");
        }
        sb.append(finalMin);
        sb.append(":");
        if(finalSec<10){
            sb.append("0");
        }
        sb.append(finalSec);
        return sb.toString();
    }
}
// 기능 1. 10초전으로 이동(prev) : 10초전으로 이동 , 10초미만이면 0분0초로 이동
// 기능 2. 10초 후로 이동(next) : 10초 후로 이동, 남은 시간이 10초 미만일 경우 마지막으로 이동
// 기능 3. 오프닝 건너뛰기 : op_start<=현재 <= op_end 로 이동
// 동영상 길이 : video_len , 직전의 재생위치 : pos, 사용자의 입력 : commands
//사용자 입력이 모두 끝난 후 동영상 위치를 return하시오.
//pos가 시작위치임
//분*60 + 초 이래서 int로 계산해야겠네