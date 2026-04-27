package session2.y26_m04.week03.step14_02_p14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 문제: 문자열 집합
 * 작성자: 이승건
 * 작성일: 26. 4. 15.
 * 문제 주소: https://www.acmicpc.net/problem/14425
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), true);
        }

        String temp;
        for (int i = 0; i < m; i++) {
            temp = br.readLine();

            if(map.containsKey(temp)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
