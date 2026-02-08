package session2.y26_m2.week01.step05_03_p9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 문자열
 * 작성자: 이승건
 * 작성일: 26. 2. 2.
 * 문제 주소: https://www.acmicpc.net/problem/9086
 */

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int n;

            n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                String str = br.readLine();

                System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    
}
