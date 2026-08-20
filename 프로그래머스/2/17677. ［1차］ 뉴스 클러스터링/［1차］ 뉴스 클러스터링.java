import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int len1 = str1.length();
        int len2 = str2.length();
        List<String> strArr1 = new ArrayList<>();
        List<String> strArr2 = new ArrayList<>();
        for(int i=0;i<len1-1;i++){
            String tmp = str1.substring(i,i+2);
            if(isWord(tmp)) strArr1.add(tmp);
        }
        for(int i=0;i<len2-1;i++){
            String tmp = str2.substring(i,i+2);
            if(isWord(tmp)) strArr2.add(tmp);
        }
        int listLen1 = strArr1.size();
        int listLen2 = strArr2.size();
        //교집합 구해야댐
        double intersection = 0;
        for(int i=0;i<listLen1;i++){
            String str = strArr1.get(i);//비교할 문자열
            char ch1 = str.charAt(0);
            char ch2 = str.charAt(1);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String strUpper = str.toUpperCase();
            String strLower = str.toLowerCase();
            sb.append(Character.toUpperCase(ch1));
            sb.append(Character.toLowerCase(ch2));
            String other1 = sb.toString();
            sb2.append(Character.toLowerCase(ch1));
            sb2.append(Character.toUpperCase(ch2));
            String other2 = sb2.toString();
            if(strArr2.contains(strUpper)){
                intersection++;
                strArr2.remove(strUpper);
            }
            else if(strArr2.contains(strLower)){
                intersection++;
                strArr2.remove(strLower);
            }
            else if(strArr2.contains(other1)){
                intersection++;
                strArr2.remove(other1);
            }
             else if(strArr2.contains(other2)){
                intersection++;
                strArr2.remove(other2);
            }
            
        }
        double union = listLen1+listLen2 - intersection;
        if(union == 0 ) return 65536;
        //System.out.println("교집합 크기 :"+intersection + " 합집합 크기 : "+union);
        
        answer = (int) ((intersection / union) * 65536);
      
        return answer;
    }
    public static boolean isWord(String str){ // 유효한 단어인 체크
        for(int i=0;i<2;i++){
            char ch = str.charAt(i);
            if((ch>='A' &&ch<='Z')|| (ch>='a' && ch<='z')) continue;
            else return false;
        }
        return true;
    }
}
// 둘다 공집합일 때 : 자카드 유사도는 1
//다중집합으로 확장
//문자열 두 글자씩 끊어서 다중집합의 원소로 만든다
//공백이나 숫자,특수문자가 포함된 글자 쌍은 버림

//다중 집합에서 개수 고려해야되네