package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12918>
 * 20.12.25.
 * 문자열 s : 1이상 8이하
 * 숫자로만 구성되어있으면 true
 *
 * 피드백 : Integer.parseInt = 문자열을 숫자로변환시킴. 그 과정에서 문자열이 있으면 에러발생.
 * */

public class StringHandling {

    public static boolean solution(String s) {

        int[] arr = new int[s.length()];

        if (arr.length!=4){
            return false;
        } else if (arr.length!=4){
            return false;
        }

        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(s);
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("1qwe"));
    }

}
