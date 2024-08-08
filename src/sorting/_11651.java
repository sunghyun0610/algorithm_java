package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _11651 {
    static class Point{
        int  x;
        int y;
        Point(){}
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int N= Integer.parseInt(st.nextToken());
        Point[] arr= new Point[N];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            arr[i]=new Point(x,y); //같은 클래스 내에서는 static 중첩 클래스의 객체를 생성할 때 외부 클래스의 이름을 생략할 수 있습니다.
        }//입력 완료
        Arrays.sort(arr,new Comparator<Point>(){
                    @Override
                    public int compare(Point o1,Point o2){
                        if(o1.y==o2.y){//만약 x좌표가 같다면
                            return o1.x-o2.x;//y좌표를 비교해서 큰게 뒤로 가도록
                        }
                        return o1.y-o2.y;//x좌표 비교해서 큰게 뒤로 가도록
                    }

                }
        );
        for(Point result : arr){
            System.out.print(result.x+" "+result.y);
            System.out.println();
        }
    }
}
