package Week04.LV0.factorial;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 21.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120848
 * */

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        int i = 1;
        while(!(n / i < 1)){
            n /= i;
            i++;
        }
        answer = i - 1;
        return answer;
    }
}
