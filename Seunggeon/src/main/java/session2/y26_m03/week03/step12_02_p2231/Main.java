package session2.y26_m03.week03.step12_02_p2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 분해합
 * 작성자: 이승건
 * 작성일: 26. 3. 21.
 * 문제 주소: https://www.acmicpc.net/problem/2231
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            boolean flag = false;

            for (int i = 1; i < n; i++) {
                int sum = 0;

                int temp = i;
                while (temp > 10) {
                    sum += temp % 10;
                    temp /= 10;
                }
                sum += temp + i;

                if (sum == n) {
                    System.out.println(i);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
