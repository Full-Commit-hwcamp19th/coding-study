package session2.y26_m2.week01.step05_06_p10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제: 알파벳 찾기
 * 작성자: 이승건
 * 작성일: 26. 2. 4.
 * 문제 주소: https://www.acmicpc.net/problem/10809
 */

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String str = br.readLine();

            for (int i = 0; i < str.length(); i++) {

                char c = str.charAt(i);
                int n = c - 'a';

                if (arr[n] == -1) {
                    arr[n] = i;
                }
            }

            System.out.println(Arrays.toString(arr).replace("[","").replace("]","").replace(",",""));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
