package com.MyAlgorithm.Level1;


/* <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/12947>
 * 20.12.29.
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나눠져야 함
 * ex) 18 => 자릿수의 합 : 1+8=9, 18%9=0
 * 하샤드의 수가 맞으면 True, 아니면 false return
 * */

public class Harshad {

    public boolean solution(int x) {

        String temp = "";
        int sum = 0;

        temp = String.valueOf(x);

        for (int i = 0; i < temp.length(); i++) {
            sum += Integer.parseInt(String.valueOf(temp.charAt(i)));
        }

        return (x%sum==0);
    }


}
