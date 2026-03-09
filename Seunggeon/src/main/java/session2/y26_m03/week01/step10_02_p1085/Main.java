package session2.y26_m03.week01.step10_02_p1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 직사각형에서 탈출
 * 작성자: 이승건
 * 작성일: 26. 3. 5.
 * 문제 주소: https://www.acmicpc.net/problem/1085
 */

public class Main {
    public static void main(String[] args) {
        int x, y, w, h;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            int min = Math.min(x, w-x);
            min = Math.min(min, y);
            min = Math.min(min, h-y);

            System.out.println(min);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
