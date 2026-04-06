package session2.y26_m04.week01.step12_06_p2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 설탕 배달
 * 작성자: 이승건
 * 작성일: 26. 4. 1.
 * 문제 주소: https://www.acmicpc.net/problem/2839
 */

public class Main {
    public static void main(String[] args) {
        int n;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int count = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5;
                break;
            }
            n -= 3;
            count++;
        }

        System.out.println(n < 0 ? -1 : count);
    }
}
