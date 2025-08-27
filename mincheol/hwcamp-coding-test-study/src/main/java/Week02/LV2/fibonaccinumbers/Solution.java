package Week02.LV2.fibonaccinumbers;

/*
 * 이름: 변민철
 * 날짜: 25. 8. 11.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12945
 * */

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        int f_0 = 0;
        int f_1 = 1;
        int num = 0;

        for (int i = 2; i <= n; i++) {
            num = (f_0 + f_1) % 1234567;
            f_0 = f_1;
            f_1 = num;
        }
        answer = num;
        return answer;
    }
}
