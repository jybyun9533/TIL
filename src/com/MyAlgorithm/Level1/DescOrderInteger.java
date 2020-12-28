package com.MyAlgorithm.Level1;

import java.util.Arrays;
import java.util.Collections;

/* <문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12933>
 * 20.12.28.
 * n을 매개변수로 받아 내림차순으로 정렬하여 리턴
 * */
public class DescOrderInteger {

    public long solution(long n) {

        String temp = String.valueOf(n);

        Integer[] arr = new Integer[temp.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(temp.charAt(i)));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        temp = "";
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }

        long answer = 0;
        answer = Long.parseLong(temp);
        return answer;
    }

    public static void main(String[] args) {
        DescOrderInteger aa = new DescOrderInteger();

        System.out.print(aa.solution(118372));
    }

}
