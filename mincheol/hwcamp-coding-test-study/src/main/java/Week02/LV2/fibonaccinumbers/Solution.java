package Week02.LV2.fibonaccinumbers;

/*
 * 이름: 변민철
 * 날짜: 25. 8. 11.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12945
 * */

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        answer = fib[n] % 1234567;
        return answer;
    }
}
