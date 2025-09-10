package Week06.LV2.lifeboat;

import java.util.Arrays;

/*
 * 이름: 변민철
 * 날짜: 25. 09. 07.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42885
 * */
import java.util.Arrays;

public class Solution {
    public static int solution(int[] people, int limit) {
        int answer = 0;

        // 1. 사람들의 몸무게를 오름차순으로 정렬
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        // 2. 투 포인터(left, right)를 사용하여 보트 태우기
        while (left <= right) {
            // 가장 가벼운 사람과 가장 무거운 사람의 몸무게 합이 limit 이하인 경우
            if (people[left] + people[right] <= limit) {
                left++;  // 가벼운 사람 이동
                right--; // 무거운 사람 이동
            } else {
                // 가장 무거운 사람 혼자 보트를 타야 하는 경우
                right--; // 무거운 사람만 이동
            }
            answer++; // 보트 1개 추가
        }

        return answer;
    }
}
