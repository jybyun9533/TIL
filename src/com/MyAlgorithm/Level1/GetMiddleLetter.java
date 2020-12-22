package com.MyAlgorithm.Level1;
/* <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/12903>
 * 2020.12.16.
 * 단어 s의 가운데 글자를 반환하느 함수 만들기
 * s의 길이는 1이상, 100이하
 */


public class GetMiddleLetter {
    public static String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            answer = String.valueOf(s.charAt((s.length()/2)-1)) + String.valueOf(s.charAt(s.length()/2));
            return answer;
        } else {
            answer = String.valueOf(s.charAt(s.length() / 2));
            return answer;
        }

    }

    public static void main(String[] args) {
        String s = "abcd";

        System.out.println(solution(s));
    }
}
