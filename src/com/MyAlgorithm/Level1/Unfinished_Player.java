package com.MyAlgorithm.Level1;

import java.util.HashMap;

/* <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/42576>
 * 단 한명의 선수를 제외하고 모든 선수가 마라톤을 완주
 * participant[] : 마라톤 참여한 선수 (1이상 100,000 이하)
 * completion[] : 완주한 선수 (participant.length-1)
 * answer[] : 완주하지 못한선수 return
 * 동명이인이 있을수 있음
 *
 * 1. 이중포문 사용시 효율성이 떨어짐 : 이중포문 사용X
 *  ->Hashmap을 사용해서 구현
 */
public class Unfinished_Player {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) { // 모든 참가자를 HashMap에 put | <이름, 0>
            map.put(participant[i], 0);
        }

        for (int i = 0; i < completion.length; i++) { // 완주자는 <이름, value+1> | 1 인사람은 완주자, 2이상인 사람은 동명이인, 0인 사람은 미완주자
            map.replace(completion[i], map.get(completion[i]) + 1);
        }

        for (int i = 0; i < participant.length; i++) { // value가 0보다 큰 값이면 value-1, value 가 0이면(완주X) answer에 저장
            if (map.get(participant[i]) > 0) {
                map.replace(participant[i], map.get(participant[i]) - 1);
            } else
                answer += participant[i] + " ";

        }



        return answer;
    }

    public static void main(String[] args) {

        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};
        String print_ans = "";

        print_ans = solution(participant, completion);

        System.out.println(print_ans);
    }
}
