package session2.y26_m2.week04.step08_07_p2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 달팽이는 올라가고 싶다
 * 작성자: 이승건
 * 작성일: 26. 2. 23.
 * 문제 주소: https://www.acmicpc.net/problem/2869
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            int day = (V - B) / (A - B);

            if ((V - B) % (A - B) != 0) {
                day += 1;
            }



            System.out.println(day);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
