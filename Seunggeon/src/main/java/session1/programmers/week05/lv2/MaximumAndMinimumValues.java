package programmers.week05.lv2;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 27.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12939
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumAndMinimumValues {
    public static String solution(String s) {

        // 문자열 분할
        StringTokenizer st = new StringTokenizer(s);

        // for 조건문에 countTokens을 직접 사용하면 반복마다 값이 변경되서 원하는 만큼 반복이 안되므로 따로 저장
        int count = st.countTokens();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 임시로 사용할 변수 생성
        int temp;

        // 반복문을 통해 분할 된 문자열을 순서대로 확인해 max, min 찾기
        for (int i = 0; i < count; i++) {
            temp = Integer.parseInt(st.nextToken());

            if (temp > max) max = temp;
            if (temp < min) min = temp;
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
        String str;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("숫자들을 입력해주세요(공백을 통해 구분): ");
            str = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String answer = solution(str);
        System.out.println("정답: " + answer);
    }
}
