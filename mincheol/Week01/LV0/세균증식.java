/*
 * 이름: 변민철
 * 날짜: 25. 8. 5.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120910
* */

public class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer = n * (int)Math.pow(2, t);
        return answer;
    }
}