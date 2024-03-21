package stack;

import java.util.Stack;

public class test {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.add(0, 4); // add 메소드를 호출함으로써 stack의 의미와는 다르게 특정 인덱스의 값이 추가

// 마지막에 넣은 요소는 "4" 인데 스택은 "3"로 뽑혀진다
        int num = stack.pop(); // 3
        System.out.println(num);
    }
}
