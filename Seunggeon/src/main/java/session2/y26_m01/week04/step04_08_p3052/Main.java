package session2.y26_m01.week04.step04_08_p3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 문제: 나머지
 * 작성자: 이승건
 * 작성일: 26. 1. 26.
 * 문제 주소: https://www.acmicpc.net/problem/3052
 */

public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st;
            for (int i = 0; i < 10; i++) {
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());

                map.put(num % 42, 1);
            }

            System.out.println(map.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
