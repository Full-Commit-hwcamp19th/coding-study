package session2.y26_m03.week03.step11_04_p24265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 알고리즘 수업 - 알고리즘의 수행 시간 4
 * 작성자: 이승건
 * 작성일: 26. 3. 16.
 * 문제 주소: https://www.acmicpc.net/problem/24265
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            Long sum = 0L;
            for (int i = 1; i < n; i++) {
                sum += i;
            }
            System.out.println(sum);
            System.out.println(2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
