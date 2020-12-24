package com.MyAlgorithm.Level1;

/* <문제 정의 : https://programmers.co.kr/learn/courses/30/lessons/12917?
 *  20.12.24
 *  문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해서 새로운 문자열을 리턴
 *  s: 대소문자로만 구성, 대문자<소문자
 * */

import java.util.Arrays;
import java.util.Collections;

public class DescOrderString {

    public static String solution(String s) {

        String[] arr = new String[s.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("Zbcdefg"));
    }
}
