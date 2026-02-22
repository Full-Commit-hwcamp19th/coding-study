package session2.y26_m2.week03.step08_02_p11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 진법 변환 2
 * 작성자: 이승건
 * 작성일: 26. 2. 19.
 * 문제 주소: https://www.acmicpc.net/problem/11005
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();

            int next = 0;
            int temp = 0;

            while((next = n / b) != 0) {
                temp = n % b;

                if (temp < 10) {
                    sb.append(temp);
                } else {
                    sb.append((char)(temp - 10 + 'A'));
                }

                n = next;
            }

            temp = n % b;
            if (temp < 10) {
                sb.append(temp);
            } else {
                sb.append((char)(temp - 10 + 'A'));
            }



            System.out.println(sb.reverse().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
