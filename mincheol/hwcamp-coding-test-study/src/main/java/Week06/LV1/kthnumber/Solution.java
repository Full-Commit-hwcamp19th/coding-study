package Week06.LV1.kthnumber;

import java.util.Arrays;

/*
 * 이름: 변민철
 * 날짜: 25. 09. 04.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * */
public class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int n = commands.length;
        answer = new int[n];
        int[] arr;
        for (int i = 0; i < n; i++) {
            int start = commands[i][0];
            int end = commands[i][1];

            arr = new int[end - start + 1];

            //배열 뽑기
            for (int j = start; j <= end; j++) {
                arr[j - start] = array[j - 1];
            }
            System.out.println(Arrays.toString(arr));

            //버블 정렬
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < arr.length; k++) {
                    for (int l = k + 1; l <arr.length; l++) {
                        if(arr[k] > arr[l]) {
                            int temp = arr[k];
                            arr[k] = arr[l];
                            arr[l] = temp;
                        }
                    }
                }
            }
//            System.out.println(Arrays.toString(arr));

            //정렬된 배열의 K번째 수 뽑아 정답 배열에 담기
            int result = arr[commands[i][2] - 1];
            answer[i] = result;

        }

        return answer;
    }
}
