package session2.y26_m2.week02.step06_04_p10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 팰린드롬인지 확인하기
 * 작성자: 이승건
 * 작성일: 26. 2. 10.
 * 문제 주소: https://www.acmicpc.net/problem/10988
 */

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();

            StringBuilder sb = new StringBuilder(str);
            sb.reverse();

            System.out.println(str.equals(sb.toString())? 1 : 0);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
