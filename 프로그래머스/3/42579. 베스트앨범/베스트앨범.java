import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
class Solution {
    class Song{
        int playCnt;//재생횟수
        int songNum;//고유번호(인덱스)
        
        Song(int playCnt, int songNum){
            this.playCnt = playCnt;
            this.songNum = songNum;
        }
    }
    public List<Integer> solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String,List<Song>> genrePlayCntMap = new HashMap<>();
        for(int i=0;i<plays.length;i++){
            String genre = genres[i];
            int playCount = plays[i];
            if(genrePlayCntMap.containsKey(genre)){//이미 장르가 맵에 있음
                List<Song> tempSongList = genrePlayCntMap.get(genre);
                tempSongList.add(new Song(playCount,i));
                genrePlayCntMap.put(genre,tempSongList);
            }else{//해당 장르 처음 추가하는 경우
                List<Song> tempSongList = new ArrayList<>();
                tempSongList.add(new Song(playCount,i));
                genrePlayCntMap.put(genre,tempSongList);
            }
        }
        int genreTypeCnt = genrePlayCntMap.size();
        Map<Integer,String> genreRankMap = new TreeMap<>();//key기준 순서 정렬해줌
        String[] genreRankArr = new String[genreTypeCnt];
        for(String k : genrePlayCntMap.keySet()){
            List<Song> temp = genrePlayCntMap.get(k);
            int playSum = 0;
            for(int i=0;i<temp.size();i++){//장르에 곡 수만큼 이더럴
                playSum+=temp.get(i).playCnt;
            }
            genreRankMap.put(playSum,k);
        }//장르 순서 별로 정렬 완료
        for(Integer k : genreRankMap.keySet()){
            String genre = genreRankMap.get(k);
            System.out.println(genre);
            List<Song> tempGenreSong = genrePlayCntMap.get(genre);
            tempGenreSong.sort(
                (a,b)->{
                    if(a.playCnt!=b.playCnt){
                        return Integer.compare(b.playCnt , a.playCnt);
                    }
                    return Integer.compare(a.songNum ,b.songNum);
                }
            );//list 정렬 완료됨
            // for(Song l:tempGenreSong){
            //     System.out.println(l.songNum);
            // }
            if(tempGenreSong.size()>=2){
           
                // System.out.println(tempGenreSong.get(0).songNum);
                // System.out.println(tempGenreSong.get(1).songNum);
                answer.add(tempGenreSong.get(1).songNum);
                answer.add(tempGenreSong.get(0).songNum);
            }
            else{
                answer.add(tempGenreSong.get(0).songNum);
            }
            
        }
        // System.out.println(answer.toString());
        List<Integer> result = new ArrayList<>();
        for(int i=answer.size()-1;i>=0;i--){
            result.add(answer.get(i));
        }
        
        return result;
    }
}