package session2.y26_m2.week02.step06_05_p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 단어 공부
 * 작성자: 이승건
 * 작성일: 26. 2. 10.
 * 문제 주소: https://www.acmicpc.net/problem/1157
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            str = str.toUpperCase();

            int[] arr = new int[26];

            for (int i = 0; i < 26; i++) {
                arr[i] = 0;
            }

            for (int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 'A'] += 1;
            }

            int max = 0;
            char c = '?';

            for (int i = 0; i < 26; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                    c =  (char)('A' + i);
                } else if(max == arr[i]) {
                    c = '?';
                }
            }

            System.out.println(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
