package com.MyAlgorithm.Level1;
/*<문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12944>
 * 20.12.29.
 * int[] arr의 원소값들의 평균을 return
 * */

public class Avg {

    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        answer = sum / arr.length;

        return answer;
    }

}
