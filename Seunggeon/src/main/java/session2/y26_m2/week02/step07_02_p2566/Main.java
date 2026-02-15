package session2.y26_m2.week02.step07_02_p2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 최댓값
 * 작성자: 이승건
 * 작성일: 26. 2. 13.
 * 문제 주소: https://www.acmicpc.net/problem/2566
 */

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int max = 0;
            int x = 0;
            int y = 0;

            StringTokenizer st;

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());

                    if (max < arr[i][j]) {
                        max = arr[i][j];
                        x = j;
                        y = i;
                    }

                }
            }

            System.out.println(max);
            System.out.println((y + 1) + " " + (x + 1));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
