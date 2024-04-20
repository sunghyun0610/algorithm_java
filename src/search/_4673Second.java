package search;

public class _4673Second {
    public static void main(String[] args) {
        boolean [] num=new boolean[10001];//1~10000까지 이므로 0제외되서 10001개 생성 -> 기본값 false로 됨
        // 인덱스와 숫자 사이의 관계를 더 쉽게 다루기 위해 배열의 크기를 10001로 지정합니다. 이렇게 하면 인덱스 1부터 10000까지가 각각 1부터 10000까지의 숫자에 대응하게 됩니다.
        for(int i=1;i<10001;i++){
            int a=self_number(i);
            if(a<10001){
                num[a]=true;
            }
        }
        for(int j=1;j<10001;j++){
            if(num[j]==false)
                System.out.println(j);
        }

    }

    public static int self_number(int num){//static 메서드 -> 객체 생성없이 호출가능.
        int sum=num;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
