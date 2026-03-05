package session2.y26_m03.week01.step10_01_p27323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 직사각형
 * 작성자: 이승건
 * 작성일: 26. 3. 5.
 * 문제 주소: https://www.acmicpc.net/problem/27323
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            System.out.println(a * b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
