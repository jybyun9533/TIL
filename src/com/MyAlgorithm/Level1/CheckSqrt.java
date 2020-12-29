package com.MyAlgorithm.Level1;

/* <문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12934>
* 20.12.29.
* int n : 임의의 양의 정수 (1이상 500000000000이하)
* n이 어떤 양의 정수 x의 제곱인지 아닌지 판단
* n이 양의 정수 x의 제곱이면 x+1의 제곱을 리턴
* n이 양의 정수 x의 제곱이 아니면 -1을 리턴
* */

import java.util.ArrayList;

public class CheckSqrt {
    public long solution(long n){

        long root = (long) Math.sqrt(n);

        if(Math.pow(root,2)==n){
            return (long) Math.pow((root+1),2);
        } else
            return -1;
    }

    public static void main(String[] args) {
        CheckSqrt aaa = new CheckSqrt();
        System.out.print(aaa.solution(121));
    }
}
