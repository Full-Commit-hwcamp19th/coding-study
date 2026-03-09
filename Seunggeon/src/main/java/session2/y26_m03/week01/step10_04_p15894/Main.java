package session2.y26_m03.week01.step10_04_p15894;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 수학은 체육과목 입니다
 * 작성자: 이승건
 * 작성일: 26. 3. 7.
 * 문제 주소: https://www.acmicpc.net/problem/15894
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            // 문제의 범위를 꼭 확인하고 현재 자료형이 해당 범위를 커버할 수 있는지 꼭 확인하자!!
            System.out.println(4L * n);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
