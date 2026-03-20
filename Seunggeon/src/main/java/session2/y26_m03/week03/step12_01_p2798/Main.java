package session2.y26_m03.week03.step12_01_p2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제: 블랙잭
 * 작성자: 이승건
 * 작성일: 26. 3. 20.
 * 문제 주소: https://www.acmicpc.net/problem/2798
 */

public class Main {
    public static void main(String[] args) {
        int n, m;
        int[] arr;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            arr = new int[n];

            st = new StringTokenizer(br.readLine());

            if(st.countTokens() != n) {
                throw new IOException("숫자의 개수가 다릅니다.");
            }

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int max = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if(sum > m) {
                        break;
                    } else {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);


    }
}
