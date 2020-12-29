package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12943>
 * 20.12.29.
 * 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들수 있다는 추측
 * 규칙1. 입력된 수가 짝수라면 2로 나눈다.
 * 규칙2. 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
 * 규칙3. 1이 나올때까지 반복
 * 몇번만에 1이 나왔는지 return
 * 500번 이상 반복시 -1 return
 * */
public class Collatz {

    public int solution(long num) {
        int answer = 0;

        while (num != 1) {
            if (answer > 500) {
                return -1;
            }

            if (num % 2 == 0)
                num /= 2;
            else
                num = (num * 3) + 1;

            answer++;
        }
        return answer;
    }
}
