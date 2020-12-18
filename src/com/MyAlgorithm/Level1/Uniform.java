package com.MyAlgorithm.Level1;

import java.util.HashMap;

public class Uniform {

    /* <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/42862>
     * 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있음
     * 최대한 많은 학생이 체육수업을 들을수 있도록 해야함
     * n : 전체학생의 수 (2이상 30이하)
     * lost[] : 체육복을 도난당한 학생들의 번호(1명 이상 n명 이하)
     * reserve[] : 여벌의 체육복을 가져온 학생들의 번호
     * 체육수업을 들을 수 있는 학생의 최대값을 return
     * 여벌 체육복을 가져온 학생이 도난 당했을수도 있음 : 하나만 도난당함
     * */

    public static int solution(int n, int[] lost, int[] reserve) {

        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        for (int i = 0; i < reserve.length; i++) {
            map.replace(reserve[i], map.get(reserve[i]) + 1);
        }

        for (int i = 0; i < lost.length; i++) {
            map.replace(lost[i], map.get(lost[i]) - 1);
        }

        for (int i = 1; i <= n; i++) {
            if (map.get(i) > 1) {
                if (i > 1 && map.get(i - 1) == 0) {
                    map.replace(i - 1, map.get(i - 1) + 1);
                    map.replace(i, map.get(i) - 1);
                } else if (i < n && map.get(i + 1) == 0) {
                    map.replace(i + 1, map.get(i + 1) + 1);
                    map.replace(i, map.get(i) - 1);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (map.get(i) > 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        int ans = solution(n, lost, reserve);

        System.out.println("참여 가능 인원 : " + ans);
    }
}
