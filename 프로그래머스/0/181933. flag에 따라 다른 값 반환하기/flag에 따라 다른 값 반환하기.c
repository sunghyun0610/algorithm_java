#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b, bool flag) {
    int answer = 0;
    if(flag==true){
        answer=a+b;
    }
    else answer=a-b;
    return answer;
}