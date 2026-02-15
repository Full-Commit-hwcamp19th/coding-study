package session2.y26_m01.week04.step04_10_p1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 평균
 * 작성자: 이승건
 * 작성일: 26. 1. 28.
 * 문제 주소: https://www.acmicpc.net/problem/1546
 */

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            double[] arr = new double[n];

            double max = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = Double.parseDouble(st.nextToken());

                if(max <= arr[i]) {
                    max = arr[i];
                }
            }
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i] / max * 100;
            }

            System.out.println(sum/n);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
