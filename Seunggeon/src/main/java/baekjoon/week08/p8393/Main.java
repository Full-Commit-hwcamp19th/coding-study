package baekjoon.week08.p8393;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 19.
 * 문제: https://www.acmicpc.net/problem/8393
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("숫자를 입력하세요: ");
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(n);
        System.out.print("정답: ");
        System.out.println(answer);
    }
}
