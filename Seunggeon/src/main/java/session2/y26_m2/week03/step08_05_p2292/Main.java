package session2.y26_m2.week03.step08_05_p2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 벌집
 * 작성자: 이승건
 * 작성일: 26. 2. 22.
 * 문제 주소: https://www.acmicpc.net/problem/2292
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int b = 1;
            int count = 1;
            while(b < n) {
                b += 6 * count;
                count++;
            }

            System.out.println(count);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
