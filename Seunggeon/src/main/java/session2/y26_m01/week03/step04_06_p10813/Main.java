package session2.y26_m01.week03.step04_06_p10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제: 공 바꾸기 
 * 작성자: 이승건
 * 작성일: 26. 1. 24.
 * 문제 주소: https://www.acmicpc.net/problem/10813
 */

public class Main {
    public static void main(String[] args) {

        int n, m;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());

                int num1 = Integer.parseInt(st.nextToken()) - 1;
                int num2 = Integer.parseInt(st.nextToken()) - 1;

                if(arr[num1] == 0) arr[num1] = num1 + 1;
                if(arr[num2] == 0) arr[num2] = num2 + 1;

                int temp = arr[num2];
                arr[num2] = arr[num1];
                arr[num1] = temp;
            }

            for (int i = 0; i < n; i++) {
                if(arr[i] == 0) {
                    arr[i] = i + 1;
                }
            }

            System.out.print(Arrays.toString(arr).replace("[", "").replace("]", "").replace(",",""));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
