package session2.y26_m2.week01.step05_11_p11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 그대로 출력하기
 * 작성자: 이승건
 * 작성일: 26. 2. 7.
 * 문제 주소: https://www.acmicpc.net/problem/11718
 */

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str;

            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
