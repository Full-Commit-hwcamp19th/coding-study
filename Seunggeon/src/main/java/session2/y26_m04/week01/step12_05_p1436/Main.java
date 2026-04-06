package session2.y26_m04.week01.step12_05_p1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 영화감독 숌
 * 작성자: 이승건
 * 작성일: 26. 3. 31.
 * 문제 주소: https://www.acmicpc.net/problem/1436
 */

public class Main {
    public static void main(String[] args) {

        int n;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int count = 0;

        for (int i = 666; i < Integer.MAX_VALUE; i++) {
            String temp = Integer.toString(i);

            if(temp.contains("666")) {
                count++;
            }

            if(count == n) {
                System.out.println(i);
                break;
            }
        }
    }
}
