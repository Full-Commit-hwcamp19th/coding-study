package LV0.adddigits;

/*
 * 이름: 변민철
 * 날짜: 25. 8. 5.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120906
 * */

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        int[] numArr = new int[num.length()];

        for(int i = 0; i < num.length(); i++) {
            numArr[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
            answer += numArr[i];
        }
        return answer;
    }
}
