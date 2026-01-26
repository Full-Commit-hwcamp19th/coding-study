package session2.y26_m01.week03.step04_07_p5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 과제 안 내신 분..?
 * 작성자: 이승건
 * 작성일: 26. 1. 25.
 * 문제 주소: https://www.acmicpc.net/problem/5597
 */

public class Main {
    public static void main(String[] args) {
        boolean[] arr = new boolean[30];

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st;
            for (int i = 0; i < 28; i++) {
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());

                arr[num - 1] = true;}

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 30; i++) {
            if(!arr[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
