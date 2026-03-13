package session2.y26_m03.week02.step11_02_p24263;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 알고리즘 수업 - 알고리즘의 수행 시간 2
 * 작성자: 이승건
 * 작성일: 26. 3. 13.
 * 문제 주소: https://www.acmicpc.net/problem/24263
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());


            System.out.println(n);
            System.out.println(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
