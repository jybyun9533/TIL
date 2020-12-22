package com.MyAlgorithm.Level1;

import java.util.Arrays;

public class KNumber {
 /* <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/42748>
 * 2020.12.11.
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬, k번째 수는?
 * array 원소 : 1이상 100이하
 * array.length : 1이상 50이하
 * commands.length : 1이상 50이하
 * commands의 원소의 길이는 3(i,j,k)
 * */

    public static int[] solution(int[] array, int[][] commands) {
        int i, j, k;
        int[] answer = new int[commands.length];

        for (int a = 0; a < commands.length; a++) {
            i = commands[a][0];
            j = commands[a][1];
            k = commands[a][2];

            int[] array_temp = new int[j - i + 1];

            for (int b = 0; b < array_temp.length; b++) {
                array_temp[b] = array[i - 1];
                i++;
                if (i > j)
                    break;
            }

            Arrays.sort(array_temp);

            answer[a] = array_temp[k - 1];
        }

        return answer;
    }

    public static void main(String[] args) {


        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = solution(array, commands);

        for (int j : answer) {
            System.out.print(j + " ");
        }
    }
}