package session2.y26_m2.week04.step09_04_p1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 소수 찾기
 * 작성자: 이승건
 * 작성일: 26. 3. 1.
 * 문제 주소: https://www.acmicpc.net/problem/1978
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int count = 0;

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());

                if (num == 1) {
                    continue;
                } else {
                    count += isPrime(num);
                }
            }

            System.out.println(count);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
