package com.MyAlgorithm.Level1;

/*<문제링크 : https://programmers.co.kr/learn/courses/30/lessons/67256>
 * 20.12.29.
 * 전화 키패드에서 왼쪽 엄지, 오른쪽 엄지로 숫자를 입력
 * 시작위치 = 왼쪽 : *, 오른쪽 : #
 * 규칙1. 엄지손가락은 상하좌우 4가지 방향으로만 이동 가능, 한칸은 거리1
 * 규칙2. 왼쪽열 3개의 숫자(1,4,7)을 입력할때는 왼손 사용
 * 규칙3. 오른쪽열 3개의 숫자(3,6,9)를 입력할 때는 오른손 사용
 * 규칙4. 가운데 열의 4개의 숫자(2,5,8,0)을 입력할 때는 두 엄지손가락에서 가까운 손 사용
 *  -> 만약 거리가 같다면 왼손잡이는 왼손, 오른손잡이는 오른손 사용
 * int[] numbers : 순서대로 누를 번호가 담긴 배열(1이상 1000이하, 원소는 0이상 9이하)
 * String hand : 손잡이 표시 ("left" || "right")
 * return String answer : L, R로 쓴 손가락 표시
 * */

public class Keypad {

    /* 3y+x : 배열상 위치
     * x : 0~2
     * y : 0~3
     * 각index : 배열에서의 위치
     * */
    public String solution(int[] numbers, String hand) {

        int lIndex = 9; // 왼손 위치
        int rIndex = 11; // 오른손 위치

        int lDist, rDist; // 각 손과의 위치

        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) { // 0일시 배열의 index+1인 11로 교체
                numbers[i] = 11;
            }

            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) { // 1,4,7인 경우
                lIndex = numbers[i]-1;
                answer += "L";

            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {// 3,6,9인 경우
                rIndex = numbers[i]-1;
                answer += "R";

            } else {
                lDist = Math.abs((numbers[i]-1)%3-lIndex%3)+Math.abs((numbers[i]-1)/3-lIndex/3);
                rDist = Math.abs((numbers[i]-1)%3-rIndex%3)+Math.abs((numbers[i]-1)/3-rIndex/3);
                if (lDist > rDist) {
                    rIndex = numbers[i]-1;
                    answer += "R";
                } else if (lDist < rDist) {
                    lIndex = numbers[i]-1;
                    answer += "L";
                } else {
                    if (hand.equals("right")) {
                        rIndex = numbers[i]-1;
                        answer += "R";
                    } else {
                        lIndex = numbers[i]-1;
                        answer += "L";
                    }
                }
            }


        }

        return answer;

    }


    public static void main(String[] args) {

        Keypad keypad = new Keypad();

        int[] testCase1Numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String testCase1Hand = "right";
        String testCase1Result = "LRLLLRLLRRL";

        int[] testCase2Numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String testCase2Hand = "left";
        String testCase2Result = "LRLLRRLLLRR";

        int[] testCase3Numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String testCase3Hand = "right";
        String testCase3Result = "LLRLLRLLRL";

        if (keypad.solution(testCase1Numbers, testCase1Hand).equals(testCase1Result)) {
            System.out.println("정답");
        } else
            System.out.println("오답");

        if (keypad.solution(testCase2Numbers, testCase2Hand).equals(testCase2Result)) {
            System.out.println("정답");
        } else
            System.out.println("오답");

        if (keypad.solution(testCase3Numbers, testCase3Hand).equals(testCase3Result)) {
            System.out.println("정답");
        } else
            System.out.println("오답");
    }

}
