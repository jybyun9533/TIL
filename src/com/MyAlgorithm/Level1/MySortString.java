package com.MyAlgorithm.Level1;

import java.util.Arrays;

public class MySortString {
    /* <문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12915>
     * 2020.12.18.
     * strings : 문자열로 구성된 리스트, 1이상 50이하, 소문자 알파벳, 원소의기리는 1이상 100이하
     * n : 각 문자열의 인덱스, 정수
     * n번째 글자 기준으로 오름차순 정렬. 문자가 같은 경우 사전순으로 앞선 문자열이 앞쪽에 위치
     * */
    public static String[] solution(String[] strings, int n) {

        String[] answer = new String[strings.length];
        String[] temp = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            temp[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            answer[i] = "";
            for (int j = 1; j < temp[i].length(); j++) {
                answer[i] += temp[i].charAt(j);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] testcase1 = {"sun", "bed", "car"};
        int testcase1_n = 1;

        String[] testcase2 = {"abce", "abcd", "cdx"};
        int testcase2_n = 2;

        testcase1 = solution(testcase1, testcase1_n);
        testcase2 = solution(testcase2, testcase2_n);

        for (int i = 0; i < testcase1.length; i++) {
            System.out.print(testcase1[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < testcase2.length; i++) {
            System.out.print(testcase2[i] + " ");
        }
    }

}
