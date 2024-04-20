package search;



public class _4673 {
    int self_number(String str){
        //char a=str[0]; 문자열에 직접 접근 x charAt써야댐.
        int num=Integer.parseInt(str);//일단 정수형
        for(int i=0;i<str.length();i++){
            num+=Character.getNumericValue(str.charAt(i));//
        }
        return num;
    }
    //sum = sum + (number % 10); // 첫 째 자리수
    //		number = number/10;	// 10을 나누어 첫 째 자리를 없앤다 - >이방식으로도 각 자리별 숫자 구하기 가능
    public static void main(String [] args){
        //셀프넘버 d(75)= 75+7+5=87
        _4673 search =new _4673();
        int num=2;//이게 셀프넘버인지 판단해야하는 수
        System.out.println(1);
        while(num<=10000){
            boolean check =false;
            for(int i=1;i<num;i++){
                if(search.self_number(String.valueOf(i))==num){
                    check=true;
                    break;//생성자가 있다
                }
            }
            if(check==false){
                System.out.println(num);
            }
            num++;
        }

    }
}
