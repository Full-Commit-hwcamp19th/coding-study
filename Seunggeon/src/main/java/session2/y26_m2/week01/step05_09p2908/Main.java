package session2.y26_m2.week01.step05_09p2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 상수
 * 작성자: 이승건
 * 작성일: 26. 2. 5.
 * 문제 주소: https://www.acmicpc.net/problem/2908
 */

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            StringBuilder sb1 = new StringBuilder(st.nextToken());
            sb1.reverse();

            StringBuilder sb2 = new StringBuilder(st.nextToken());
            sb2.reverse();

            System.out.println(Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
