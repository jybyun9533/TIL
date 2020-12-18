package com.MyAlgorithm.Level1;

public class Year_2016 {
    /* <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/12901>
     * 2016년 1월 1일은 금요일 -> 2016년 a월 b일은 무슨 요일?
     * 2016년은 윤년
     * String[] day = {SUN,MON,TUE,WED,THU,FRI,SAT}
     * a = 달, b = 일
     */

    public static String solution(int a, int b) {
        // a는 1이상 12이하
        // b는 1이상 31이하 : 1,3,5,7,8,10,12
        // b는 1이상 30이하 : 4,6,9,11
        // b는 1이상 29이하 : 2

        int count = 0;

        int[] year = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        for (int i = 0; i < a - 1; i++) {
            count += year[i];
        }

        count += b-1;

        return day[count% day.length];

    }

    public static void main(String[] args) {
        int a = 5, b = 24;

        String ans = solution(a, b);

        System.out.println("요일 : " + ans);
    }
}
