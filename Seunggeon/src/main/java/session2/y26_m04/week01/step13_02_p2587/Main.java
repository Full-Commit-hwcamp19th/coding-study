package session2.y26_m04.week01.step13_02_p2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제: 대표값2
 * 작성자: 이승건
 * 작성일: 26. 4. 3.
 * 문제 주소: https://www.acmicpc.net/problem/2587
 */

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(br.readLine());
                sum += arr[i];
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}
