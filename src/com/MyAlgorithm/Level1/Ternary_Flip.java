package com.MyAlgorithm.Level1;

/* <문제정의 :https://programmers.co.kr/learn/courses/30/lessons/68935>
 * n : 매개변수(자연수), 1이상 1억 이하
 * 3진법상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return
 * ex) n=45 -> 3진법 : 1200 -> 뒤집기 : 0021 -> 십진법으로 표현
 *
 * Feedback : Integer.toString(n, radix) : n을 redix진수 로 변형해서 저장
 */

public class Ternary_Flip {

    public static int solution(int n) {

        int answer = 0;
        String ternary = "";

        ternary = Integer.toString(n, 3);

        for (int i = 0; i < ternary.length(); i++) {
            answer += Integer.parseInt(String.valueOf(ternary.charAt(i))) * Math.pow(3, i);
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(45));
        System.out.println(solution(125));
    }
}
