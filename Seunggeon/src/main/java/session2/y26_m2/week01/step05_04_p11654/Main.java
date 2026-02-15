package session2.y26_m2.week01.step05_04_p11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 아스키 코드
 * 작성자: 이승건
 * 작성일: 26. 2. 2.
 * 문제 주소: https://www.acmicpc.net/problem/11654
 */

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char ch = br.readLine().charAt(0);

            System.out.println((int)ch);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
