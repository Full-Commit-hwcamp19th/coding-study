package session2.y26_m2.week02.step07_04_p2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제: 색종이
 * 작성자: 이승건
 * 작성일: 26. 2. 15.
 * 문제 주소: https://www.acmicpc.net/problem/2563
 */


public class Main {
    public static void main(String[] args) {
        boolean[][] map = new boolean[100][100];

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        map[x + j][y + k] = true;
                    }
                }
            }
//            System.out.println(Arrays.deepToString(map));
            int count = 0;

            for (int i = 0; i < 100; i++ ) {
                for(int j = 0; j < 100; j++) {
                    if(map[i][j]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
