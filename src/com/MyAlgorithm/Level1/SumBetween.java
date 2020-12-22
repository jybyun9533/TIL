package com.MyAlgorithm.Level1;

/* <문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12912>
 *
 * 두 정수 a,b가 주어졌을 때, a와 b사이에 속한 모든 정수의 합을 리턴
 * a, b는 10,000,000 ~ 10,000,000
 * a, b 대소관게 x
 * */

public class SumBetween {

    public static long solution(int a, int b) {

        long answer = 0;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = min; i < max + 1; i++) {
            answer += i;
        }

        return answer;
    }


    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.print(solution(a, b));

    }

}
