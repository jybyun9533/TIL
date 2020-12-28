package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12926>
 * 2020.12.28.
 * 각 알파벳을 n만큼 밀어서 다른 알파벳으로 바꾸는 암호방식
 * 공백은 아무리 밀어도 공백
 * s: 소문자, 대문자, 공백 으로 이뤄짐
 * s의 길이는 8000이하
 * n은 1이상 25이하
 * */

import java.nio.charset.StandardCharsets;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        int[] box = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            box[i] = (int) s.charAt(i);
        }

        for (int i = 0; i < box.length; i++) {
            if (box[i] != 0) {

                //대문자의 경우
                if (box[i] > 64 && box[i] < 91) {
                    box[i] += n;
                    if (box[i] > 90) {
                        int temp = box[i] - 90;
                        box[i] = 64 + temp;
                    }
                }

                //소문자의 경우
                if (box[i] > 96 && box[i] < 123) {
                    box[i] += n;
                    if (box[i] > 122) {
                        int temp = box[i] - 122;
                        box[i] = 96 + temp;
                    }
                }
            }

        }

        for (int i = 0; i < s.length(); i++) {
            answer += (char) box[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher aa = new CaesarCipher();

        System.out.print(aa.solution("AB", 1));
    }

}
