package session2.y26_m2.week02.step06_03_p2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 별 찍기 -7
 * 작성자: 이승건
 * 작성일: 26. 2. 9.
 * 문제 주소: https://www.acmicpc.net/problem/2444
 */

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            for (int i = 1; i <= n; i++) {
                for(int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }

                for(int j = 0; j < 2 * i - 1; j ++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = n -1 ; i >= 1; i--) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                if(i != 1) {
                    System.out.println();
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
