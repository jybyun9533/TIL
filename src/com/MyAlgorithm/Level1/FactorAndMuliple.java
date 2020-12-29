package com.MyAlgorithm.Level1;

/* <문제정의 : https://programmers.co.kr/learn/courses/30/lessons/12940>
 * 20.12.29
 * 두 수를 입력받아 최대공약수와 최소공배수를 반환하는 함수
 * return(최대공약수, 최소공배수)
 *
 *
 <유클리드 호제법을 이용한 최대 공약수>
  - r= a%b, a와 b의 최대공약수= (a,b)면, (a,b) = (b,r)
   -> a=b, b=r

 <최대공약수를 이용한 최소공배수>
  - 최소공배수*최대공약수 = a*b
   -> 최소공배수 = (a*b)/최대공약수
 **/

public class FactorAndMuliple {

    public int[] solution(int n, int m) {
        FactorAndMuliple factorAndMuliple = new FactorAndMuliple();

        int gcd = factorAndMuliple.gcd(n, m); //최대 공약수
        int lcm = factorAndMuliple.lcm(n, m); //최소 공배수

        int[] answer = new int[2];

        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }

    private int gcd(int n, int m) {
        while (m > 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }

    private int lcm(int n, int m) {
        FactorAndMuliple factorAndMuliple = new FactorAndMuliple();
        int gcd = factorAndMuliple.gcd(n, m);
        int lcm = (n * m) / gcd;
        return lcm;
    }

}
