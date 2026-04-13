package session2.y26_m04.week02.step13_08_p11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 문제: 좌표 정렬하기 2
 * 작성자: 이승건
 * 작성일: 26. 4. 10.
 * 문제 주소: https://www.acmicpc.net/problem/11651
 */

public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        Map<Integer, List<Integer>> map = new TreeMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (map.containsKey(y)) {
                map.get(y).add(x);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(x);
                map.put(y, list);
            }
        }

        for (int key : map.keySet()) {
            Collections.sort(map.get(key));
            for (int val : map.get(key)) {
                System.out.println(val + " " + key);
            }
        }
    }
}
