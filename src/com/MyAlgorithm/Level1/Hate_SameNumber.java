package com.MyAlgorithm.Level1;

/*
 * <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/12906>
 * arr : 각 원소는 0이상 9이하, arr.length = 1,000,000이하
 * arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려함
 * return시 중복은 제거하되 순서는 그대로 유지할것.
 * */

import java.util.ArrayList;

public class Hate_SameNumber {

    public static int[] solution(int[] arr) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            } else {
                arrayList.add(arr[i]);
            }
        }

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        int[] arr1_answer = solution(arr1);
        int[] arr2_answer = solution(arr2);

        for (int i=0; i< arr1_answer.length;i++){
            System.out.print(arr1_answer[i]+" ");
        }
        System.out.println();
        for (int i=0; i< arr2_answer.length;i++){
            System.out.print(arr2_answer[i]+" ");
        }
    }

}
