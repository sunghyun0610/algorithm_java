package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _2018 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());//숫자가 주어짐.
        ArrayList<Long> sum= new ArrayList<>();
        long tmp=0;
        for(int i=1;i<N/2+2;i++){
            tmp+=i;
            sum.add(tmp);

            System.out.println(sum);
        }
        int cnt=1;
        for(int j=0;j<sum.size();j++){

            if(N==sum.get(j))
                cnt++;
            for(int k=0;k<sum.size();k++){
                if(sum.get(k)- sum.get(j)==N)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}
