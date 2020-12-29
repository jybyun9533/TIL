package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12935>
 * 20.12.29.
 * int[] arr : 정수를 저장한 배열
 * arr에서 가장 작은수를 제거 후 리턴
 * 리턴하려는 배열이 비었을 경우 -1 리턴
 * */

import java.util.ArrayList;

public class RemoveMinNum {

    public int[] solution(int[] arr) {

        int index = 0, min = arr[0];

        if (arr.length == 1) {
            return new int[]{-1};
        }

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            if (min != arr[index]) {
                index = i;
            }

        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        arrayList.remove(index);

        int[] answer = new int[arr.length - 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        RemoveMinNum aaa = new RemoveMinNum();
        int[] answer = aaa.solution(new int[]{4, 3, 2, 1});

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

}


/*
        int index = 0, min = arr[0];

        if (arr.length == 1) {
            return new int[]{-1};
        }

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            if (min != arr[index]) {
                index = i;
            }

        }

        int[] answer = new int[arr.length - 1];

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                temp++;
                continue;
            }
            answer[temp] = arr[i];
            temp++;
        }

        return answer;

      * */