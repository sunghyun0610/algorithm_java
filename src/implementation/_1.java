package implementation;

public class _1 {
    public static int[] Solution(int[][] arr){
        //0에서 출발한 칸에 적힌 숫자 X
        int [] positions= new int[2];//행,열좌표 입력받을 곳.
        int length_width=arr[0].length;//arr 가로열의 길이가 answer의 길이 열의길이
        int length_height=arr.length;//arr 세로갈이 행의길이
        int[] answer = new int[length_width];//가로 길이가 answer의 길이
        //0부터 length_width-1까지 숫자
        for(int i=0;i<length_width;i++){
            int num=arr[0][i];//뭐부터 증가하는지는 모름 0번째 인덱스부터
            int idx1=i;//현재의 열 인덱스번호
            int idx2=0;//다음줄 같은숫자의 열 인덱스번호

            for(int j=1;j<length_height;j++){
                for(int k=0;k<length_width;k++){
                    if(num==arr[j][k]){
                        idx2=k;
                        answer[num]+=Math.abs((idx1-idx2));
                        break;
                    }
                }
                idx1=idx2;

            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,2,0},
                {2,0,1,3},
                {1,2,0,3}

        };
        int[] result = Solution(arr);
        for (int distance : result) {
            System.out.print(distance + " ");
        }
        // Expected output: [3, 4, 3, 2]
    }
}