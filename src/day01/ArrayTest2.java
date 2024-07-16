package day01;

public class ArrayTest2 {
    public static void main(String[] args) {
        int [][] arr=new int[2][3];
        arr[0][0]=10;
        arr[1][2]=12;
        for(int []i :arr ){
            for(int j : i){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
