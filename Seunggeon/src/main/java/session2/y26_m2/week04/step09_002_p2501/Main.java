package session2.y26_m2.week04.step09_002_p2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 약수 구하기
 * 작성자: 이승건
 * 작성일: 26. 2. 25.
 * 문제 주소: https://www.acmicpc.net/problem/2501
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int count = 0;
            int answer = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }

                if(count == k) {
                    answer = i;
                    break;
                }
            }

            System.out.println(answer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
