package session2.y26_m03.week03.step12_03_p19532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 수학은 비대면강의입니다
 * 작성자: 이승건
 * 작성일: 26. 3. 22.
 * 문제 주소: https://www.acmicpc.net/problem/19532
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[6];

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        boolean flag1 = false;
        boolean flag2 = false;

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (arr[0] * i + arr[1] * j == arr[2]) {
                    flag1 = true;
                } else {
                    flag1 = false;
                }

                if (arr[3] * i + arr[4] * j == arr[5]) {
                    flag2 = true;
                } else {
                    flag2 = false;
                }

                if (flag1 && flag2) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
