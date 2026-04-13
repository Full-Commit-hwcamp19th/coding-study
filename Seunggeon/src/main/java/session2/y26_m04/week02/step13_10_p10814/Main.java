package session2.y26_m04.week02.step13_10_p10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제: 나이순 정렬
 * 작성자: 이승건
 * 작성일: 26. 4. 12.
 * 문제 주소: https://www.acmicpc.net/problem/10814
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (o1, o2) -> {
            int a, b;

            a = Integer.parseInt(o1[0]);
            b = Integer.parseInt(o2[0]);

            return a - b;
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }

}
