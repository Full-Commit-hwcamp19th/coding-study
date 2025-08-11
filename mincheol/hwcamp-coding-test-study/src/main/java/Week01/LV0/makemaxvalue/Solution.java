package Week01.LV0.makemaxvalue;

/*
 * 이름: 변민철
 * 날짜: 25. 8. 5.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120847
 * */

import java.util.Arrays;

public class Solution {
    public static int solution(int[] numbers) {
        Arrays.sort(numbers);

        int max1 = numbers[numbers.length-1];
        int max2 = numbers[numbers.length-2];

        return  max1 * max2;
    }
}
