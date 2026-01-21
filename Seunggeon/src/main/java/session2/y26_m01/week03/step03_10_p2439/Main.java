package session2.y26_m01.week03.step03_10_p2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 별 찍기 - 2
 * 작성자: 이승건
 * 작성일: 26. 1. 21.
 * 문제 주소: https://www.acmicpc.net/problem/2439
 */

public class Main {

    private static void solution(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("N을 입력하세요: ");
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        solution(n);
    }
}
