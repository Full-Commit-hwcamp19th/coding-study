package session2.y26_m04.week05.step15_04_p2485;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 가로수
 * 작성자: 이승건
 * 작성일: 26. 4. 28.
 * 문제 주소: https://www.acmicpc.net/problem/2485
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] arr2 = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr2[i] = arr[i + 1] - arr[i];
        }

        int gcdValue = arr2[0];

        for (int i = 1; i < n - 1; i++) {
            gcdValue = gcd(gcdValue, arr2[i]);
        }

        System.out.println((arr[n - 1] - arr[0]) / gcdValue + 1 - n);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
