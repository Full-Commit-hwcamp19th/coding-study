package programmers.week08.lv2;

/*
 * 이름: 이승건
 * 날짜: 25. 10. 13.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42746
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BiggestNumber {
    private static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((a, b) -> (b+a).compareTo(a+b))
                .forEach(sb::append);
        if(sb.toString().charAt(0) == '0') {
            return "0";
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        int[] numbers;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("enter numbers: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            numbers = new int[st.countTokens()];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String answer = solution(numbers);
        System.out.println("정답: " + answer);
    }
}
