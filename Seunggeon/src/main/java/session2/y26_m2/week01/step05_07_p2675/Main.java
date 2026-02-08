package session2.y26_m2.week01.step05_07_p2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 문자열 반복
 * 작성자: 이승건
 * 작성일: 26. 2. 4.
 * 문제 주소: https://www.acmicpc.net/problem/2675
 */

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(br.readLine());

            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                int r = Integer.parseInt(st.nextToken());

                String str = st.nextToken();
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < str.length(); j++) {
                    for (int k = 0; k < r; k++) {
                        sb.append(str.charAt(j));
                    }
                }

                System.out.println(sb.toString());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
