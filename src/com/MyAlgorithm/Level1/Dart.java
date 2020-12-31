package com.MyAlgorithm.Level1;

/* <문제링크: https://programmers.co.kr/learn/courses/30/lessons/17682>
 *20.12.31.
 * 총 3번의 기회
 * 각 기회마다 얻는 점수는 0점에서 10점
 * 점수와 함께 S, D(점수^2), T(점수^3) 영역이 존재
 * 스타상(*) : 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만듬 (첫 기회에 나올 시 첫 경우만 2배)
 * 스타상은 다른 스타상과 중첩이 될 수 있다.
 * 아차상(#) : 당첨시 해당 점수는 마이너스
 * 스타상과 아차상이 중첩됐을 경우 점수는 -2배
 * 스타상과 아차상은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수 도 있다.
 * 입력 형식 : String dartResult = 점수|보너스|옵션
 * */

public class Dart {

    public int solution(String dartResult) {
        int first = 0, second = 0, third = 0, answer = 0;

        String[] score = {String.valueOf(dartResult.charAt(0)), "", ""};
        int index = 0; // score의 index

        for (int i = 1; i < dartResult.length(); i++) { // 각 회차의 점수 획득정보를 배열에 저장
            if (Character.isDigit(dartResult.charAt(i)) && !Character.isDigit(dartResult.charAt(i - 1))) { //10일 경우 대비
                index++;
            }
            score[index] += String.valueOf(dartResult.charAt(i));
        }

        for (int i = 0; i < score.length; i++) {
            String temp = "";
            int j = 0;

            while (Character.isDigit(score[i].charAt(j))) {
                temp += score[i].charAt(j);
                j++;
            }
            first = Integer.parseInt(temp);

            switch (score[i].charAt(j)) {
                case 'S':
                    break;
                case 'D':
                    //first = Math.pow(first, 2);

            }

        }


        return answer;
    }

    public static void main(String[] args) {
        Dart dart = new Dart();
        dart.solution("10S20D*3T");
    }

}
