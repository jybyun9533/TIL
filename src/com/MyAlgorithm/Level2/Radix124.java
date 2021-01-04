package com.MyAlgorithm.Level2;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12899?language=java>
 * 21.01.04.
 * 다음과 같은 규칙을 사용
 * -----------------
 * 10진법 124나라
 *   1      1
 *   2      2
 *   3      4
 *   4      11
 *   5      12
 *   6      14
 *   7      21
 *   8      22
 *   9      24
 *   10     41
 * ----------------
 * 자연수 n이 매개변수로 주어질대 124나라에서 사용하는 숫자로 바꾼 뒤 return
 * */

//   1 2  3 4  5 6 7  8  9  10 11 12 13 14  15  16
//   1 2  4 11 12 14 21 22 24 41 42 44 111 112 114

public class Radix124 {
    public String solution(int n) {
        String answer = "";
        String[] rule = {"1", "2", "4"}; //반복하는 숫자 배열

        while (n > 0) {
            answer = rule[(n - 1) % 3] + answer;
            n = (n - 1) / 3;
        }

        return answer;
    }

    public static void main(String[] args) {
        Radix124 radix124 = new Radix124();

        System.out.println(radix124.solution(100));

    }

}
