package session2.y26_m2.week04.step09_01_p5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 배수와 약수
 * 작성자: 이승건
 * 작성일: 26. 2. 24.
 * 문제 주소: https://www.acmicpc.net/problem/5086
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {


            while(true) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if(a == 0 && b == 0) {
                    break;
                }

                if (b % a == 0) {
                    System.out.println("factor");
                } else if (a % b == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
