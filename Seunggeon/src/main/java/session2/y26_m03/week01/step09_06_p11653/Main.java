package session2.y26_m03.week01.step09_06_p11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 소인수분해
 * 작성자: 이승건
 * 작성일: 26. 3. 4.
 * 문제 주소: https://www.acmicpc.net/problem/11653
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            if (n != 1) {
                for (int i = 2; i <= n; i++) {
                    while (n % i == 0) {
                        System.out.println(i);
                        n /= i;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
