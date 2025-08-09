package LV0.addfraction;

/*
 * 이름: 변민철
 * 날짜: 25. 8. 9.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120808
 * */

public class Solution {
    public static int[] solution(int numer1,int denom1, int numer2,int denom2) {
        int[] answer = {};

        // 약분 전 분수의 분자, 분모
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        // while문에서만 사용할 변수 선언
        int num = numer;    // num에 덧셈 직후 분자를 대입
        int den = denom;    // den에 덧셈 직후 분모를 대입
        int gcd = 0;        // 덧셈 직후의 분자, 분모의 최대 공약수 선언.

        while(den != 0) {
            int remainder = num % den;
            num = den;
            den = remainder;
            if (den == 0) gcd = num; // 나머지가 0일 때의 분모가 최대 공약수이다.
        }
        // 기약분수의 분자, 분모는 두 수의 최대 공약수로 나눈 서로소이다.
        numer /= gcd;
        denom /= gcd;

        answer = new int[]{numer, denom};
        return answer;
    }
}
