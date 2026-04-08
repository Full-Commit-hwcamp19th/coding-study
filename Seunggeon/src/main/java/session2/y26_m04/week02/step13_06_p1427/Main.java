package session2.y26_m04.week02.step13_06_p1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 소트인사이드
 * 작성자: 이승건
 * 작성일: 26. 4. 8.
 * 문제 주소: https://www.acmicpc.net/problem/1427
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10];

        while (n >= 10) {
            arr[n%10]++;
            n /= 10;
        }
        arr[n]++;

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            while (arr[i] > 0) {
                sb.append(i);
                arr[i]--;
            }
        }

        System.out.println(sb.toString());
    }
}
