package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12932>
 * 20.12.28.
 * 자연수 n을 뒤집에 배열에 저장한것을 리턴
 * */

public class ReverseNumber {
    public int[] solution(long n) {
        String temp = String.valueOf(n);

        int[] answer = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            answer[temp.length()-i-1] = Integer.parseInt(String.valueOf(temp.charAt(i)));
        }

        return answer;
    }
}
