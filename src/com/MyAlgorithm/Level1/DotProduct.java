package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/70128>
 * 20.12.28.
 * 길이가 같은 두 1차원 정수배열 a, b가 매개변수
 * a의 내적을 return
 * 내적 : a[n]*b[n] + a[n-1]*b[n-1]+..+a[0]*b[0]
 * */

public class DotProduct {

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        DotProduct aaa = new DotProduct();

        System.out.print(aaa.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}));
    }
}
