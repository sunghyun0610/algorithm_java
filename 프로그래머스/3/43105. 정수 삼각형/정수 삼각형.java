class Solution {

    public int solution(int[][] triangle) {
        int answer = 0;
        int row = triangle.length;
        int col = row;
        int [][] memoTriangle = new int[row][col];
        memoTriangle[0][0] = triangle[0][0];
        for(int x=1;x<row;x++){
            for(int y=0;y<=x;y++){
                if(y==0){
                    memoTriangle[x][0] = memoTriangle[x-1][y]+triangle[x][y];
                }else{
                memoTriangle[x][y] = Math.max(memoTriangle[x-1][y-1] + triangle[x][y], 
                                              memoTriangle[x-1][y]+triangle[x][y]);
                }
            }
        }
        
        
        for(int i=0; i<col; i++){
            answer = Math.max(memoTriangle[row-1][i], answer);
            //System.out.println(memoTriangle[row-1][i]);
        }
        return answer;
    }
//     public static void recur(int[][] triangle, int [][] memoTriangle, int x, int y, int value){     
//         memoTriangle[x][y] = Math.max(memoTriangle[x][y],value);
//         if(x==triangle.length-1) return; //종료 조건
//         // System.out.println("x,y에서 최대값 :"+ "x: "+x +" y: "+y+ " value : "+ memoTriangle[x][y]);
//         int currColCnt = x+1; // y는 인덱스이기 때문에 (0,0)에서 요소 1개가지는 것 표현
            
//             //위에서 내려오거나
//         if(y>currColCnt-1) return;
        
//             //아래로 이동
//             if(memoTriangle[x+1][y]<memoTriangle[x][y]+triangle[x+1][y]) 
//             {recur(triangle, memoTriangle,x+1,y, memoTriangle[x][y]+triangle[x+1][y]);}
//             //대각선 으로 이동
//             if(memoTriangle[x+1][y+1]< memoTriangle[x][y]+triangle[x+1][y+1])
//             {recur(triangle, memoTriangle, x+1, y+1, memoTriangle[x][y] + triangle[x+1][y+1]);}
        
//     }
}

//2^n-1으로 DFS로풀면 시간초과 -> DP
// 어떤 것을 저장할까 : 각 배열 요소까지 올 수 있는 경우의 수 중 최대값만 저장