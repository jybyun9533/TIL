package com.MyAlgorithm.Level1;

/*<문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12925>
 * 2020.12.28.
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수
 * 길이는 1이상 5이하
 * s의 맨앞에 부호가 올 수 있음
 * s는 부호와 숫자로만 이루어져있음
 * s는 0부터 시작x
 * */
public class StringToInteger {

    public int solution(String s) {
        int answer = 0;

        String temp = "";
        if (s.charAt(0) == '-') {
            temp = s.substring(1);
            answer = -Integer.parseInt(temp);
        } else {
            answer = Integer.parseInt(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        StringToInteger aa = new StringToInteger();

        System.out.print(aa.solution("-123"));
    }
}
