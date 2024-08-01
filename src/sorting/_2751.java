package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(num);
        for(int value : num) {
            sb.append(value).append('\n');
        }
        System.out.println(sb.toString());

        //이 방식에서는 StringBuilder를 사용하여 모든 출력 문자열을 한 번에 만들어 놓은 다음, 최종적으로 System.out.println을 통해 한 번에 출력합니다.
    }
}

//    private static void quickSort(int[] arr){
//        quickSort(arr,0,arr.length-1);
//    }
//    private static void quickSort(int[] arr,int start, int end){
//        int part2=partition(arr, start, end);// 집합 왼쪽 오른쪽으로 나누었을 때 오른쪽 첫번째 인덱스를 구하는 코드
//
//        if(start+1<part2){
//            quickSort(arr,start,part2-1);
//        }
//        if(part2<end){
//            quickSort(arr,part2,end);
//        }
//    }
//
//    private static int partition(int[] arr, int start, int end){
//
//        int pivot=arr[start+(end-start)/2];//중간값을 pivot으로
//
//        while(start<=end){
//            while(arr[start]<pivot) start++;
//            while(arr[end]>pivot) end--;
//            if(start<=end){
//                swap(arr,start,end);
//                start++;
//                end--;
//            }
//        }
//        return start;
//    }
//
//    private static void swap(int[] arr,int x,int y){
//        int tmp=arr[x];
//        arr[x]=arr[y];
//        arr[y]=tmp;
//        //x와 y는 인덱스이다. 그래야 참조형 매개변수로 값이 swap된다.
//    }
//}
//퀵 정렬 시간초과
//Arrays.sort시간초과

//Collections.sort()

/*
*
* 첫 번째는 Collections.sort() 를 쓰는 방법이다. Collections.sort() 은 Timsort이다. Timsort 의 경우 합병 및 삽입정렬 알고리즘을 사용한다.
* 이렇게 두 가지가 섞여있는 정렬 알고리즘을 hybrid sorting algorithm 이라고 하는데, 합병정렬(Merge Sort)의 경우 최선, 최악 모두 O(nlogn)  을 보장하고. 삽입정렬(Insertion sort)의 경우 최선의 경우는 O(n) , 최악의 경우는 O(n2) 이다.
* 그리고 두 정렬 모두 안정 정렬(stable sort)이기 때문에 Timsort를 hybrid stable sorting algorithm이라고도 한다.


즉, 합병정렬의 최악의 경우와 삽입정렬의 최선의 경우를 짬뽕한 알고리즘이 Timsort 라는 것이다. 실제로 파이썬이나 기타 정렬 알고리즘에서 가장 많이 쓰이는 알고리즘이기도 하다.

시간복잡도 O(n) ~ O(nlogn) 을 보장한다는 장점이 있다. 대신에 Collections.sort()를 사용하고자 한다면 가장 쉬운 방법으로는 일반적인 primitive 배열이 아닌 List 계열(ArrayList, LinkedList 등..)의 자료구조를 사용하여 정렬해야한다.*/
