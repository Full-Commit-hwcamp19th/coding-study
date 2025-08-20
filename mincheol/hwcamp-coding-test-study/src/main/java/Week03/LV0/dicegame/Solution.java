package Week03.LV0.dicegame;

/*
 * 이름: 변민철
 * 날짜: 25. 8. 16.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/181916
 * */

import java.util.Arrays;

public class Solution {
    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        if(arr[0] == arr[3]) {
            answer = arr[0] * 1111;
        } else if(arr[0] == arr[2] || arr[1] == arr[3]) {
            answer = (int) Math.pow(10 * arr[1] + (arr[0] + arr[3] - arr[1]), 2);
        } else if(arr[0] == arr[1] && arr[2] == arr[3]) {
            answer = (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
        } else if(arr[0] == arr[1]) {
            answer = arr[2] * arr[3];
        } else if(arr[1] == arr[2]) {
            answer = arr[0] * arr[3];
        } else if(arr[2] == arr[3]) {
            answer = arr[0] * arr[1];
        } else {
            answer = Math.min(Math.min(arr[0], arr[1]), Math.min(arr[2], arr[3]));
        }
        return answer;
    }
}
