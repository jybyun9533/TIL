package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12928>
 * 2020.12.28.
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴
 * n은 0이상 3000이하
 *
 * 피드백 : i~n까지 계산할 필요없이 N의 제곱근까지만 계산해도 됨(반복 절반이상을 줄일 수있음)
 * */

public class TrivialDivisor {

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TrivialDivisor aa = new TrivialDivisor();
        System.out.print(aa.solution(12));

    }

}
