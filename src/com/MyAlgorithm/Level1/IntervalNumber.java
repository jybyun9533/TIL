package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12954>
 * 20.12.30.
 * int x, n
 * x부터 시작해 x씩 증가하는 숫자 n개의 return
 * */

public class IntervalNumber {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i+1);
        }

        return answer;
    }

}
