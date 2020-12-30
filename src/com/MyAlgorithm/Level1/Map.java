package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/17681>
 * 20.12.30.
 * 지도는 한 변의 길이가 n인 정사각형 배열형태
 * 각 칸은 공백(" ") or 벽("#")
 * 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있음 (지도1, 2중 하나라도 벽인부분은 전체 지도에서도 벽)
 * 지도1과 지도2는 각각 정수 배열로 암호화 되어있음
 * 암호화 된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을때 얻어지는 이진수에 해당하는 값
 * n은 1이상, 16이하
 * arr 각 원소x를 이진수로 변환시 길이는 n이하
 * */

import java.util.Arrays;

public class Map {

    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];
        String[] tempArr1 = new String[arr1.length];
        String[] tempArr2 = new String[arr2.length];

        for (int i = 0; i < arr1.length; i++) { // 지도1 이진수로 바꿈
            String binary = "";
            binary = Integer.toBinaryString(arr1[i]);
            tempArr1[i] = "";
            if (binary.length() < n) {
                for (int j = 0; j < n - binary.length(); j++) {
                    tempArr1[i] += 0;
                }
            }
            tempArr1[i] += binary;
        }

        for (int i = 0; i < arr2.length; i++) { // 지도2 이진수로 바꿈
            String binary = "";
            binary = Integer.toBinaryString(arr2[i]);
            tempArr2[i] = "";
            if (binary.length() < n) {
                for (int j = 0; j < n - binary.length(); j++) {
                    tempArr2[i] += 0;
                }
            }
            tempArr2[i] += binary;
        }

        for (int i = 0; i < arr1.length; i++) { // 지도1,2 비교
            answer[i] = "";
            for (int j = 0; j < tempArr1.length; j++) {
                if (tempArr1[i].charAt(j) == '0' && tempArr2[i].charAt(j) == '0') {
                    answer[i] += " ";
                } else
                    answer[i] += "#";
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Map map = new Map();

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] answer1 = {"#####", "# # #", "### #", "#  ##", "#####"};


        if (Arrays.equals(map.solution(n, arr1, arr2), answer1))
            System.out.println("정답");
        else
            System.out.println("오답");
    }

}
