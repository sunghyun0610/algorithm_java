
//8958
fun main(){
    var T= readLine()?.toInt()//case 개수 입력받기
    var score=0
    if (T != null) {
        for (i in 1..T) {
            var sum=0//합
            val str = readLine() ?: ""
            for(c in str){
                if(c=='O'){
                    score++
                    sum+=score
                }
                else{
                    score=0
                }
            }
            score=0
            println(sum)
        }
    } else {
        println("잘못된 입력입니다.")
    }

}