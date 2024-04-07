package sorting;

class QuickSort{//자바에서 public 클래스가 있다면, 그 파일의 이름은 public 클래스의 이름과 정확히 일치해야 합니다
    public static void quickSort(int [] arr){
        quickSort(arr,0, arr.length-1);
    }
    private static void quickSort(int []arr,int start,int end){
        int part2=partition(arr,start,end);// 뒷 배열 첫번쨰 인자
        if(start<part2-1){
            quickSort(arr,start,part2-1);
        }
        if(part2<end){
            quickSort(arr,part2,end);
        }
    }

    private static int partition(int []arr, int start,int end){
        int pivot = arr[(start+end)/2];// pivot으로 항상 중간값을 선택.
        while(start<=end){
            while(arr[start]<pivot) start++;//pivot보다 작은 값은 다 무시
            while(arr[end]>pivot) end--;//pivot보다 큰 값은 다 무시
            if(start<=end){
                swap(arr,arr[start],arr[end]);
                start++;
                end--;
            }

        }
        return start;

    }

    private static void swap(int [] arr,int start, int end){//매개변수 참조형이여야지 실제값 바끼자나!!
        int tmp=0;
        tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
        //기본형 매개변수 -변수의 값을 읽기만 가능/ 수정은 불가
        //참조형 매개변수 -변숳의 값을 읽고 수정도 가능.
          }

}
public class _1920 {
    public static void main(String[] args){

    }
}
