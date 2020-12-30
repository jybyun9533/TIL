package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/42889>
 * 20.12.30.
 * 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
 * int N : 전체 스테이지 개수 (1이상 500이하)
 * int[] stages : 게임 사용자가 현재 멈춰있는 스테이지(1이상, 200,000이하/ 원소:1이상 N+1이하)
 * 실패율이 높은 스테이지 부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return
 * 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0
 * */


import java.util.*;

public class FailureRate {
    // n : 전체스테이지 개수
    // stage.length : 플레이어의 수
    // stage.element : 멈춰있는 스테이지
    // 스테이지 실패율 : 도달했으니 클리어 못한 플레이어의 수(스테이지 원소값이 같은사람들) / 스테이지에 도달한 수 (원소값 이상인 사람들)


    public int[] solution(int N, int[] stages) {

        int[] challenging = new int[N + 2]; // 해당 스테이지 도전자의 수
        int[] arrival = new int[N + 2]; // 해당 스테이지 도전자의 수 + 클리어한 사람 수
        double[] rate = new double[N + 1];

        challenging[0] = 0;
        arrival[0] = 0;
        rate[0] = 0;


        // 도전자
        for (int i = 0; i < stages.length; i++) {
            challenging[stages[i]]++;
        }

        // 도달자
        for (int i = 0; i < arrival.length; i++) {
            arrival[i] = challenging[i];
        }
        for (int i = N + 1; i > 1; i--) {
            arrival[i - 1] += arrival[i];
        }

        //실패율
        for (int i = 1; i < rate.length; i++) {
            if (arrival[i] == 0) {
                rate[i] = (double) 0;
            } else
                rate[i] = (double) challenging[i] / (double) arrival[i];
        }

        // hashMap 저장 <스테이지, 실패율>
        HashMap<Integer, Double> map = new HashMap<>();
        for (int i = 1; i < N + 1; i++) { //map(stage, rate)
            map.put(i, rate[i]);
        }

        // hashMap 의 value값으로 정렬
        ArrayList<Integer> arrayList = new ArrayList<>(map.keySet());
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1) == map.get(o2)) {
                    return (map.get(o1).compareTo(map.get(o2)));
                }
                return (map.get(o2).compareTo(map.get(o1)));
            }
        });


        int[] answer = new int[N];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;

    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = {3, 4, 2, 1, 5};

        FailureRate failureRate = new FailureRate();

        if (Arrays.equals(failureRate.solution(N, stages), result))
            System.out.println("정답");
        else
            System.out.println("오답");

    }

}
