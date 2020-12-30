package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12969>
 * 20.12.30.
 * *문자를 이용하여 가로가n, 세로가m인 직사각형 형태를 출력
 * */

import java.util.Scanner;

public class MakeStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String line = "";

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                line += "*";
            }
            line += "\n";
        }

        System.out.println(line);
    }

}
