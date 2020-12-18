package com.MyAlgorithm.Level1;

/* <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/68644>
 * 정수 배열 numbers
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 오른차순으로 담아 Return
 * numbers의 길이는 2이상 100이하
 * numbers의 모든 수는 0이상 100이하
 * */

import java.util.ArrayList;
import java.util.Arrays;

public class Add_number {

    public static int[] solution(int[] numbers) {
        int index1 = 0, index2 = 1, sum = 0;

        int[] answer_temp = new int[(numbers.length * (numbers.length - 1)) / 2];

        for (int i = 0; i < answer_temp.length; i++) {
            sum = numbers[index1] + numbers[index2];
            answer_temp[i] = sum;
            index2++;
            if (index2 == numbers.length) {
                index1++;
                index2 = index1 + 1;
            }
        }
        Arrays.sort(answer_temp);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < answer_temp.length; i++) {
            if (!arr.contains(answer_temp[i])) {
                arr.add(answer_temp[i]);
            }
        }

        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 1, 3, 4, 1};
        int[] ans = solution(numbers);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}


/*
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0 ; i < numbers.length; i++){
            for(int j = i+1 ; j < numbers.length; j++){
                int tmp = numbers[i] + numbers[j];
                if(!list.contains(tmp)){
                    list.add(tmp);
                }
            }
        }

        int size = 0;
        answer = new int[list.size()];
        for(int num : list){
            answer[size++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}*/
