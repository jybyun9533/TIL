package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12937>
 * 20.12.29
 * int num : 짝수일때 Even, 홀수일때 Odd 리턴
 * */
public class EvenOdd {

    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else
            answer = "Odd";
        return answer;
    }

}
