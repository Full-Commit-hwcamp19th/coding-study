package session2.y26_m2.week01.step05_08_p1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 단어의 개수
 * 작성자: 이승건
 * 작성일: 26. 2. 5.
 * 문제 주소: https://www.acmicpc.net/problem/1152
 */

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());

            System.out.println(st.countTokens());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
