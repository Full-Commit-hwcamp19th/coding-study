package session2.y26_m03.week01.step09_05_p2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 소수
 * 작성자: 이승건
 * 작성일: 26. 3. 3.
 * 문제 주소: https://www.acmicpc.net/problem/2581
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int m = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int min = Integer.MAX_VALUE;
            int sum = 0;

            for (int i = m; i <= n; i++) {
                if (isPrime(i)) {
                    sum += i;
                    if (min == Integer.MAX_VALUE) {
                        min = i;
                    }
                }
            }

            if (sum == 0) {
                System.out.println(-1);
            } else {
                System.out.println(sum);
                System.out.println(min);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
