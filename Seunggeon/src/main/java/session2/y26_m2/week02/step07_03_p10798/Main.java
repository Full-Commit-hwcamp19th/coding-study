package session2.y26_m2.week02.step07_03_p10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 세로읽기
 * 작성자: 이승건
 * 작성일: 26. 2. 14.
 * 문제 주소: https://www.acmicpc.net/problem/10798
 */

public class Main {
    public static void main(String[] args) {
        String[] str = new String[5];

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                str[i] = br.readLine();
            }

            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i < str[j].length()) {
                        System.out.print(str[j].charAt(i));
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
