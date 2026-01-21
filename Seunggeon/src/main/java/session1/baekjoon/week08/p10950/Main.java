package baekjoon.week08.p10950;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 19.
 * 문제: https://www.acmicpc.net/problem/10950
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("반복 횟수를 입력하세요: ");
            int n = Integer.parseInt(br.readLine());
            int a, b;
            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                System.out.print("덧셈할 두개의 숫자를 입력핫메요: ");
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                System.out.println(a + b);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
