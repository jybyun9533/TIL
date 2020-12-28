package com.MyAlgorithm.Level1;

import java.util.StringTokenizer;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12930>
 * 2020.12.28.
 * String s : 한개 이상의 단어
 *  각 단어는 하나 이상의 공백문자로 구분되어 있음
 *  각 단어의 짝수번째 알파벳은 대문자, 홀수는 소문자로 바꾸어 s 리턴(단어기준)
 * public StringTokenizer(String str,String delim,boolean returnDelims) : 마지막 bool은 delim까지 토큰에 포함시킬지 여부
 * */
public class StrangeString {

    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ", true);

        while (st.hasMoreTokens()) {
            String temp = st.nextToken();

            if (temp.equals(" ")) {
                answer += " ";
                continue;
            }

            for (int i = 0; i < temp.length(); i++) {
                if (i % 2 == 0) {
                    answer += Character.toUpperCase(temp.charAt(i));
                } else
                    answer += Character.toLowerCase(temp.charAt(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StrangeString aa = new StrangeString();

        System.out.print(aa.solution("Ho hO OO  n n n n n n n n m M M M m M m   oa Hello    Hello Hello   Hello"));
    }

}
