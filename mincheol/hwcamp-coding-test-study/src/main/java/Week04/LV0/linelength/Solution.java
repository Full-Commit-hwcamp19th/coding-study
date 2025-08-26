package Week04.LV0.linelength;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 21.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120876
 * */

public class Solution {
    public static int solution(int[][] lines) {
        int[] arr = new int[201]; // 좌표 -100 ~ 100 대응

        // 각 선분이 차지하는 영역 카운트
        for (int[] line : lines) {
            int start = line[0] + 100; // 음수 보정
            int end = line[1] + 100;
            for (int i = start; i < end; i++) {
                arr[i]++;
            }
        }

        int answer = 0;
        // 겹치는 부분의 길이 계산
        for (int count : arr) {
            if (count > 1) answer++;
        }

        return answer;
    }
}
