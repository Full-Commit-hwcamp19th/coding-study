package session2.y26_m03.week02.step10_07_p5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 삼각형과 세 변
 * 작성자: 이승건
 * 작성일: 26. 3. 10.
 * 문제 주소: https://www.acmicpc.net/problem/5073
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st;

            while (true) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                if(a == 0 && b == 0 && c == 0) {
                    break;
                }

                int max = Math.max(Math.max(a, b), c);
                int sum = a + b + c - max;

                if (max >= sum) {
                    System.out.println("Invalid");
                } else if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
