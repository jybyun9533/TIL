package com.MyAlgorithm.Level1;

/* <문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12919>
 * 20.12.26
 * String[] seoul : Kim의 위치를 찾아 "김서방은 x에 있다" 라는 String을 반환
 * seoul : 1이상 1000이하, 원소는 1이상 20이하, kim이 반드시 포함되어잇음
 * */
public class SearchKim {
    public static String solution(String[] seoul) {
        String answer = "";
        int index = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }

        answer = "김서방은 " + index + "에 있다";

        return answer;
    }

    public static void main(String[] args) {
        String[] seuol = {"Jane", "Kim"};

        System.out.println(solution(seuol));
    }
}
