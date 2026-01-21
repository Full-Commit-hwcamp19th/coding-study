package baekjoon.week08.p2480;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 18.
 * 문제: https://www.acmicpc.net/problem/2480
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int solution(int a, int b, int c) {
        int answer;

        if(a == b && a == c) {
            answer = 10000 + a * 1000;
        } else if (a == b || b == c || a == c) {
            answer = 1000;
            if(a == b) answer += a * 100;
            else answer += c * 100;
        } else {
            int max = Math.max(a, b);
            max = Math.max(max, c);
            answer = max * 100;
        }
        return answer;
    }

    public static void main(String[] args) {
        int a, b, c;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("주사위의 눈을 입력하세요: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(a, b, c);
        System.out.println("정답: " + answer);
    }
}
