package baekjoon.week08.p2884;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 18.
 * 문제: https://www.acmicpc.net/problem/2884
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static String solution(int h, int m) {
        String answer;

        m += h * 60;    // 전체를 분으로 변환
        m -= 45;        // 45분 빼기

        if (m < 0) {
            m += 24 * 60;
        }

        h = m / 60;
        m = m % 60;

        return h + " " + m;
    }

    public static void main(String[] args) {

        int h, m;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("현재 알람 시간을 입력하세요:");
            StringTokenizer st = new StringTokenizer(br.readLine());

            h = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String answer = solution(h, m);
        System.out.println("정답: " + answer);
    }
}
