package baekjoon.week08.p2739;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 19.
 * 문제: https://www.acmicpc.net/problem/2739
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static void solution(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        int n;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("원하는 구구단을 입력하세요: ");
            n = Integer.parseInt(br.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        solution(n);
    }
}
