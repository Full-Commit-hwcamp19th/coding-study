package Week08.LV2;

import java.util.Arrays;

/*
 * 이름: 변민철
 * 날짜: 25. 10. 12.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42746
 * */
//   {6, 10, 2}, "6210"
//   {3, 30, 34, 5, 9}, "9534330"
public class 가장_큰_수 {
    public static String solution(int[] numbers) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        // 정수형 배열을 문자열 배열로 바꾸기
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 문자형 배열을 정렬하기
        // 두 문자열을 더 했을 때 더 큰 수가 나오도록 정렬
        Arrays.sort(arr, (a, b) -> (b + a).compareTo((a + b)));

        // 모든 원소가 0일 때는 0을 반환하기
        if (arr[0].equals("0")) return "0";

        // 모든 문자열 배열을 이어붙이기
        for (String s : arr) {
            sb.append(s);
        }

        answer = sb.toString();
        return answer;
    }
}
