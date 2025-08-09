package LV0.distributepizza;

/*
 * 이름: 변민철
 * 날짜: 25. 8. 5.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120814
 * */

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        if (n % 7 != 0) {
            answer = n / 7 + 1;
        } else
            answer = n / 7;
        return answer;
    }
}
