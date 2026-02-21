package session2.y26_m2.week03.step08_04_p2903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 중앙 이동 알고리즘
 * 작성자: 이승건
 * 작성일: 26. 2. 21.
 * 문제 주소: https://www.acmicpc.net/problem/2903
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int pointCount = 2;

            for (int i = 0; i < n; i++) {
                pointCount += pointCount - 1;
            }

            System.out.println((int)Math.pow(pointCount, 2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
