package session2.y26_m2.week01.step05_05_p11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 숫자의 합
 * 작성자: 이승건
 * 작성일: 26. 2. 3.
 * 문제 주소: https://www.acmicpc.net/problem/11720
 */

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(br.readLine());

            String str = br.readLine();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }

            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
