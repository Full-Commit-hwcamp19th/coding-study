package session2.y26_m01.week03.step04_05_p10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 공 넣기
 * 작성자: 이승건
 * 작성일: 26. 1. 23.
 * 문제 주소: https://www.acmicpc.net/problem/10810
 */

public class Main {
    public static void main(String[] args) {

        int[] arr;  // 바구니

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // N, M 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // N의 크기만큼 바구니 준비
            arr = new int[n];

            // M회 만큼 공 넣기
            for (int i = 0; i < m; i++) {
                // 이번 반복의 start, end, number 입력
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int number = Integer.parseInt(st.nextToken());

                for (int j = start - 1; j < end; j++) {
                    arr[j] = number;
                }
            }

            for(int i = 0; i < n; i++) {
                System.out.print(arr[i]);
                if(i != n - 1) System.out.print(" ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
