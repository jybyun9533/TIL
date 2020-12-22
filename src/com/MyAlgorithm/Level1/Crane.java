package com.MyAlgorithm.Level1;


/* <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/64061>
 * 2020.12.03.
 * 1x1크기의 칸들로 이뤄진 NxN크기의 정사각 격자
 * 인형들은 1x1크기 한칸을 차지
 * 격자의 가장 아래 칸부터 쌓여있음
 * 사용자는 크레인을 좌우로 움직여 멈춘 위치의 맨 위 인형을 집어올림
 * 뽑은 인형은 바구니 맨 아래부터 순서대로 쌓이게 됨
 * 바구니에서 같은모양의 인형이 연속으로 쌓이면 같은 모양의 인형 2개가 없어짐
 * 빈칸에 크레인이 작동시 아무일도 안일어남
 * 바구니의 크기제한x
 * board : 게임 화면의 격자 2차원 배열, 각 칸에는 0이상 100이하의 정수(각 숫자는 다른 인형의 모양)
 * moves : 인형을 잡기위해 작동시킨 크레인 위치, 배열의 크기는 1이상 1000이하, 원소값은 1이상 board크기 이하
 * answer : 사라진 인형의 개수
 * 첫 시작 인형의 배열은 [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
 * */

public class Crane {
    public static int solution(int[][] board, int[] moves) {

        int[] basket = new int[board.length * board.length];
        int temp;
        int answer = 0;
        int basketIndex = 0;

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    temp = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;

                    basket[basketIndex] = temp;

                    if (basketIndex > 0) {
                        if (basket[basketIndex] == basket[basketIndex - 1]) {
                            basket[basketIndex] = 0;
                            basket[basketIndex - 1] = 0;

                            answer += 2;
                            basketIndex--;
                            break;
                        }
                    }
                    basketIndex++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int ans = solution(board, moves);

        if (4 == ans) {
            System.out.println("정답");
        } else
            System.out.println("실패");
        System.out.println("answer : " + ans);

    }

}

/*for (int move : moves) {
        for (int j = 0; j < board.length; j++) {
            if (board[j][move - 1] != 0) {
                temp = board[j][move - 1];
                board[j][move - 1] = 0;

                basket[basketIndex] = temp;

                if (basketIndex > 0) {
                    if (basket[basketIndex] == basket[basketIndex - 1]) {
                        basket[basketIndex] = 0;
                        basket[basketIndex - 1] = 0;

                        answer += 2;
                        basketIndex--;
                        break;
                    }
                }
                basketIndex++;
                break;
            }
        }
    }*/