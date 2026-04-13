package session2.y26_m04.week02.step13_05_p10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 수 정렬하기 3
 * 작성자: 이승건
 * 작성일: 26. 4. 7.
 * 문제 주소: https://www.acmicpc.net/problem/10989
 */

public class Main {
    public static void main(String[] args) {
        // 입력되는 수의 범위가 1 ~ 10,000 이므로 크기가 10001인 배열 선언
        int[] count = new int[10001];

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            // 입력받는 즉시 카운트 배열의 값 증가 (메모리 절약을 위해 모든 값을 배열에 저장하지 않음)
            for (int i = 0; i < n; i++) {
                count[Integer.parseInt(br.readLine())]++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 출력 속도 향상을 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        
        System.out.println(sb);
    }
}
