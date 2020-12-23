package com.MyAlgorithm.Level1;

/* <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/12916>
 * 2020.12.23.
 * String s : 대문자와 소문자가 섞여있는 문자열
 * 'p' 와 'y'의 개수를 비교해 같으면 True, 아니면 false
 * p, y가 모두 없으면 true 리턴
 * 대소문자 구분X
 *
 * 피드백 : toUpperCase() 혹은 toLowerCase()를 사용하여 대문자(소문자)로 통일해서 구성할 것.
 */
public class StringPandS {

    static boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        if (!s.contains("p") && !s.contains("P") && !s.contains("y") && !s.contains("Y")) {
            return true;
        }
        if (s.contains("p") || s.contains("P")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                    pCount++;
                }
            }
        }
        if (s.contains("y") || s.contains("Y")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                    yCount++;
                }
            }
        }

        return pCount == yCount;

    }

    public static void main(String[] args) {

        String testCase = "pPoooyY";

        System.out.println(solution(testCase));

    }


}
