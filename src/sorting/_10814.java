package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//퀵소트는  안정적인 정렬 알고리즘이 아니므로 순서 유지가 안될 수 있다.
//class QuickSort{
//    public static void quickSort(Person [] arr){
//        quickSort(arr,0,arr.length-1);
//    }
//
//    private static void quickSort(Person[] arr,int start, int end){
//        int part2=partition(arr,start,end);//뒷 배열의 첫 인덱스
//        if(start<part2-1){
//            quickSort(arr,start,part2-1);
//        }
//        if(part2<end){
//            quickSort(arr,part2,end);
//        }
//
//    }
//
//    private static int partition(Person []arr,int start, int end){
//        int pivot = arr[(start+end)/2].age;// 배열의 중간값을 pivot으로 하는 퀵 정렬.
//        while(start<=end){
//            while(arr[start].age<pivot) start++;//pivot보다 왼쪽부분 작은 수는 다 무시
//            while(arr[end].age>pivot) end--;
//            if(start<=end){
//                swap(arr,start,end);
//                start++;
//                end--;
//            }
//
//        }
//        return start;
//    }
//    public static void swap(Person arr[], int start,int end){
//        int temp=0;
//        temp=arr[start].age;
//        arr[start].age=arr[end].age;
//        arr[end].age=temp;
//        String str="";
//        str=arr[start].name;
//        arr[start].name=arr[end].name;
//        arr[end].name=str;//나이 바꿨으면 이름도 바꿔줘야 짝이 맞지.
//    }
//}
class Person{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }//class 는 생성자 필수!!
}
public class _10814 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Person [] ps=new Person[N];//Person 객체 배열생성 -> 각 배열 요소들은 null로 초기화 되어있다.
        for(int i=0;i<N;i++){
            int age=sc.nextInt();
            String name=sc.next();
            ps[i]=new Person(age,name);//배열의 각 요소를 Person 객체로 초기화
        }


        Arrays.sort(ps, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.age != p2.age) {
                    return p1.age - p2.age;
                } else {
                    return 0; // 나이가 같으면 원래 순서를 유지 (안정적 정렬)
                }
            }
        });


        for(Person k: ps){
            System.out.println(k.age +" "+ k.name);
        }


    }
}
