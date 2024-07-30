package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2750II {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//bufferreader는 문자열로 저장됨.
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        quickSort(num);

        for (int result : num) {
            System.out.println(result);
        }
    }

    private static void quickSort(int[] arr){//첫 시작할떄 호출되는 quickSort메서드
        quickSort(arr,0,arr.length-1);
    }
    //quickSort오버로딩을 했네
    private static void quickSort(int[] arr, int start, int end){//처음 이후에 호출되는 quickSort메서드
        int part2= partition(arr,start,end);
        if(start+1<part2){
           quickSort(arr,start,part2-1);
        }
        //else return;
        if(part2<end){
            quickSort(arr,part2,end);
        }
        //else return;

    }

    private static int partition(int[] arr, int start, int end){
        int pivot= arr[(start+end)/2];

        while(start<=end){
            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;
          if(start<=end){
              swap(arr,start,end);
              start++;
              end--;
          }
        }
        return start;
    }

    public static void swap(int[] arr,int a,int b){//a,b는 인덱스값
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }

}





/*
1.정렬이네 -> 어떤 정렬 쓸까?
2.입력 1000 -> O(N^2)까지 아무거나 다 가능
*
* */

