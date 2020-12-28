package com.MyAlgorithm.Level1;

/* <문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12922>
 * 2020.12.28.
 * 길이가 n, "수박수박수박..."와 같은 패턴을 유지하는 문자열을 리턴하는 함수
 * ex) n=4, 수박수박 return
 * */

public class RepeatPattern {

    public static String solution(int n) {
        String answer = "";
        int count = 0;

        if (n % 2 == 0) {
            while (count < n) {
                answer += "수박";
                count += 2;
            }

        } else {
            while (count < n - 1) {
                answer += "수박";
                count += 2;
            }
            answer += "수";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.print(solution(7));
    }

}
