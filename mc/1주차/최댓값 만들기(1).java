/*
 * 이름: 변민철
 * 날짜: 25. 8. 5.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120847
* */

import java.util.*;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int max1 = numbers[numbers.length-1];
        int max2 = numbers[numbers.length-2];
        answer = max1 * max2;
        return answer;
    }
}