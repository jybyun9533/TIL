package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12931>
 * 20.12.28.
 * n의 각 자릿수의 합을 구해서 return
 * */

public class AddDigits {
    public int solution(int n) {
        int answer = 0;
        String temp = "";
        temp = Integer.toString(n);

        for (int i = 0; i < temp.length(); i++) {
            answer += Integer.parseInt(String.valueOf(temp.charAt(i)));
        }

        return answer;
    }

    public static void main(String[] args) {
        AddDigits aaa = new AddDigits();

        System.out.print(aaa.solution(123));
    }
}
