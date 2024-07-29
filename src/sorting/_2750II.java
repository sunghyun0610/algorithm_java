package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _2750II {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//bufferreader는 문자열로 저장됨.
        int [] num= new int[N];
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(br.readLine());
        }

        sort(num);

        for(int result : num){
            System.out.println(result);
        }
    }


    //맨 왼쪽 값으로 pivot으로 정하기
    public static void sort(int[]a){
        l_pivot_sort(a,0,a.length-1);
    }



    private static void l_pivot_sort(int[] a, int start, int end) {
        if(start>=end) return; //start가 end보다 크거나 같으면 정렬할 데이터가 1개 이하이므로 return한다.

        int pivot=partition(a,start,end);
        l_pivot_sort(a,start,pivot-1);
        l_pivot_sort(a,pivot+1,end);



    }


    /**
     * pivot을 기준으로 파티션을 나누기 위한 약한 정렬 메소드
     *
     * @param a		정렬 할 배열
     * @param left	현재 배열의 가장 왼쪽 부분
     * @param right	현재 배열의 가장 오른쪽 부분
     * @return		최종적으로 위치한 피벗의 위치(lo)를 반환
     */

    private static int partition(int[] a, int left, int right){
        int start=left;
        int end= right;
        int pivot=a[left];// 부분리스트 왼쪽 요소를 pivot으로 결정, pivot은 인덱스가 아니라 값임.

        while(start<end){
            while(a[start]<pivot && start<end){//왼쪽에서부터 pivot보다 큰값 찾는로직
                start++;
            }
            while(a[end]>pivot && start<end){//오른쪽에서부터 pivot보다 작은값 찾는 로직
                end--;
            }
            //교환될 두 요소를 찾았으면 바꾼다.
            swap(a,start,end);


        }
        swap(a,left,start);

        return start;

    }

    private static void swap(int [] a,int x,int y){
        int tmp= a[x];
        a[x]=a[y];
        a[y]=tmp;
    }

}
/*
1.정렬이네 -> 어떤 정렬 쓸까?
2.입력 1000 -> O(N^2)까지 아무거나 다 가능
*
* */

