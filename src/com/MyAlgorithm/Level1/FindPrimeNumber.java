package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12921>
 * 20.12.28.
 * 1부터 입력받은 숫자n 사이에 있는 소수의 개수를 반환하는 함수
 * n은 2이상 10000000이하
 *
 * 피드백 : 에라토스테네스의 체를 사용, 배열을 사용 (참고 : https://wooaoe.tistory.com/50)
 **/
public class FindPrimeNumber {
    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        // 배열의 원소값이 1이면 소수, 0이면 소수x

        // 0,1은 소수x
        arr[0] = 0;
        arr[1] = 0;

        // 배열 초기화
        for (int i = 2; i < n + 1; i++) {
            arr[i] = 1;
        }

        // 제곱근
        int root = (int) Math.sqrt(n);

        // 각 소수의 배수는 소수가 아님
        for (int i = 2; i < root + 1; i++) {
            if (arr[i] == 1) {
                for (int j = i; i * j < n + 1; j++) {
                    arr[i * j] = 0;
                }
            }
        }

        for (int i = 2; i < n + 1; i++) {
            if (arr[i] == 1)
                answer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.print(solution(10));
    }
}
