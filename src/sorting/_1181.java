package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class _1181 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> stringSet=new HashSet<>();
        int N= Integer.parseInt(br.readLine());
        for(int i=-0;i <N;i++){
            stringSet.add(br.readLine());
        }//set으로 입력받아 중복제거 까지 완료
        String [] str=stringSet.toArray(new String[stringSet.size()]);
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()!=o2.length()){
                    return o1.length()-o2.length();//이게 양수면 두번째 문자열이 길이가 더길다. 즉, 더 뒤에 와야한다
                }
                return o1.compareTo(o2);

            }
        });
        for(String tmp: str){
            System.out.println(tmp);
        }
    }
}
//comparator : 두개의 다른 객체를 비교
//comparable: 현재 객체와 다른 객체를 비교