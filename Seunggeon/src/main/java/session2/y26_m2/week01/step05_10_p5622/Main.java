package session2.y26_m2.week01.step05_10_p5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 다이얼
 * 작성자: 이승건
 * 작성일: 26. 2. 6.
 * 문제 주소: https://www.acmicpc.net/problem/5622
 */

public class Main {
    public static void main(String[] args) {

        int[] arr = {
            3, 3, 3,
            4, 4, 4,
            5, 5, 5,
            6, 6, 6,
            7, 7, 7,
            8, 8, 8, 8,
            9, 9, 9,
            10, 10, 10, 10
        };

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String str = br.readLine();
            str = str.toUpperCase();
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += arr[str.charAt(i) - 'A'];
            }

            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
