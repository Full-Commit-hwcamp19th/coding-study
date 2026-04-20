package session2.y26_m04.week04.step14_06_p1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * 문제: 듣보잡
 * 작성자: 이승건
 * 작성일: 26. 4. 20.
 * 문제 주소: https://www.acmicpc.net/problem/1764
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new TreeMap<>();
        for (int i = 0; i < n + m; i++) {
            String temp = br.readLine();

            if(map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (String key: map.keySet()) {
            if (map.get(key) == 2) {
                count++;
                sb.append(key).append("\n");
            }
        }

        sb.insert(0, count + "\n");
        System.out.println(sb.toString().trim());
    }
}
