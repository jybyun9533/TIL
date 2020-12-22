package com.MyAlgorithm.Level1;

/* <문제 정의 : https://programmers.co.kr/learn/courses/30/lessons/12910>
 * 2020.12.18.
 * arr의 각 원소중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수
 * 나누어 떨어지는 원소가 업다면 -1을 return
 * arr[] : 자연수를 담은 배열, 1이상의 길이
 * i!=j -> arr[i]!=arr[j]
 * divisor는 자연수
 * */

import java.util.ArrayList;
import java.util.Collections;

public class CleanDivision {
    public static int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrayList.add(arr[i]);
            } else if (i == arr.length - 1 && arrayList.size() == 0)
                arrayList.add(-1);
        }
        Collections.sort(arrayList);

        int answer[] = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        int[] answer = solution(arr, divisor);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

}
