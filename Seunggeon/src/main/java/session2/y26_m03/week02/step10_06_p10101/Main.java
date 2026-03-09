package session2.y26_m03.week02.step10_06_p10101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 삼각형 외우기
 * 작성자: 이승건
 * 작성일: 26. 3. 9.
 * 문제 주소: https://www.acmicpc.net/problem/10101
 */

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            c = Integer.parseInt(br.readLine());

            int sumAngle = a + b + c; // 세 각의 합
            int sameAngle = 0; // 동일한 각의 개수

            if (a == b && b == c) sameAngle = 3;
            else if (a == b || a == c || b == c) sameAngle = 2;

            if (sumAngle != 180) {
                System.out.println("Error");
            }
            else if (sameAngle == 3) {
                System.out.println("Equilateral");
            } else if (sameAngle == 2) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
