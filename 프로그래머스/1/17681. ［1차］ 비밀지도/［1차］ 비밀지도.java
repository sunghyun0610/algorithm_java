class Solution {
    static StringBuilder sb;
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            String str1=toBinary(arr1[i],n);
            String str2=toBinary(arr2[i],n);
            sb=new StringBuilder();
            for(int j=0;j<n;j++){
                if(str1.charAt(j)=='1' || str2.charAt(j)=='1'){
                    sb.append("#");
                }
                else if(str1.charAt(j)=='0' && str2.charAt(j)=='0'){
                    sb.append(" ");
                }
            }
            answer[i]=sb.toString();
            System.out.println(answer[i]);
        }
        
        return answer;
    }
    public static String toBinary(int num,int n){
        sb=new StringBuilder();
        int cnt=0;
        while(cnt!=n){
            if(num>0){
                sb.append(num%2);
                num/=2;
            }else{
                sb.append(0);
            }
            cnt++;
            
        }
        String result= sb.reverse().toString();
        //System.out.println(result);
        return result;
    }
}