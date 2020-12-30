package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12982>
 * 물품을 구매해 줄 때는 각 부서가 신청한 금액만큼 모두 지원해야 주어야함.
 * int[] d : 부서별로신청한 금액이 들어있는 배열, 길이(부서의 개수)는 1이상 100이하, 각 원소는 신청한 금액이며 1이상 100,000이하
 * int budget : 예산, 1이상 10,000,000 이하
 * 최대 몇개의 부서에 물품을 지원할 수 있는지 return
 * */

import java.util.Arrays;

public class Budget {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (d[i] <= budget) {
                answer++;
                budget -= d[i];
            } else
                break;
        }

        return answer;
    }

}
