package session2.y26_m03.week03.step11_07_p24313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 알고리즘 수업 - 점근적 표기 1
 * 작성자: 이승건
 * 작성일: 26. 3. 19.
 * 문제 주소: https://www.acmicpc.net/problem/24313
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int c = Integer.parseInt(br.readLine());
            int number = Integer.parseInt(br.readLine());


            if (n > c) {
                System.out.println(0);
            } else if (n * number + m <= c * number) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
