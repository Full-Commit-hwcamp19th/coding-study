package session2.y26_m04.week03.step14_05_p10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 문제: 숫자 카드 2
 * 작성자: 이승건
 * 작성일: 26. 4. 19.
 * 문제 주소: https://www.acmicpc.net/problem/10816
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());

            if(map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int temp = Integer.parseInt(st.nextToken());

            if (map.containsKey(temp)) {
                sb.append(map.get(temp)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
