package baekjoon.week08.p1330;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 18.
 * 문제: https://www.acmicpc.net/problem/1330
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static String solution(int a, int b) {
        String answer;

        if(a > b) answer = ">";
        else if(a < b) answer = "<";
        else answer = "==";

        return answer;
    }

    public static void main(String[] args) {

        int a, b;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("비교할 두 숫자를 입력하세요: ");
            StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String answer = solution(a, b);
        System.out.println("정답: " + answer);
    }
}
