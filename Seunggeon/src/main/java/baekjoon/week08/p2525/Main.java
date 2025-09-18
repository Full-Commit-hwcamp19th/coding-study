package baekjoon.week08.p2525;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 18.
 * 문제: https://www.acmicpc.net/problem/2525
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static String solution(int h, int m, int time) {
        m += time;

        if(m >= 60) {
            h += m / 60;
            m %= 60;
        }
        if(h >= 24) {
            h %= 24;
        }

        return h + " " + m;
    }

    public static void main(String[] args) {
        int h, m, time;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("현재 시간을 입력하세요: ");
            StringTokenizer st = new StringTokenizer(br.readLine());

            h = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            System.out.print("조리 시간을 입력하세요: ");
            st = new StringTokenizer(br.readLine());
            time = Integer.parseInt(st.nextToken());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String answer = solution(h, m, time);
        System.out.println("정답: " + answer);
    }
}