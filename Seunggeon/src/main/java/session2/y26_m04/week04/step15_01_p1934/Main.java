package session2.y26_m04.week04.step15_01_p1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 문제: 최소공배수
 * 작성자: 이승건
 * 작성일: 26. 4. 24.
 * 문제 주소: https://www.acmicpc.net/problem/1934
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int A, B;

        StringTokenizer st;


        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            System.out.println(findMultiple(A ,B));
        }
    }

    private static int findMultiple(int a, int b) {
        int minNum = Math.min(a, b);
        int maxNum = Math.max(a, b);

        // 큰 수가 작은 수의 배수인 경우
        if (maxNum % minNum == 0) {
            return maxNum;
        }

        Map<Integer, Integer> mapMin = new TreeMap<>();
        Map<Integer, Integer> mapMax = new TreeMap<>();

        for (int i = 2; i <= minNum; i++) {
            while (minNum % i == 0) {
                if (mapMin.containsKey(i)) {
                    mapMin.put(i, mapMin.get(i) + 1);
                } else {
                    mapMin.put(i, 1);
                }
                minNum /= i;
            }
        }

        for (int i = 2; i <= maxNum; i++) {
            while (maxNum % i == 0) {
                if (mapMax.containsKey(i)) {
                    mapMax.put(i, mapMax.get(i) + 1);
                } else {
                    mapMax.put(i, 1);
                }
                maxNum /= i;
            }
        }

        Map<Integer, Integer> map = new HashMap<>(mapMax);

        for (int key: mapMin.keySet()) {
            if (map.containsKey(key)) {
                map.put(key, Math.max(mapMin.get(key), map.get(key)));
            } else {
                map.put(key, mapMin.get(key));
            }
        }

        int result = 1;
        for (int key: map.keySet()) {
            result = (int) (result * Math.pow(key, map.get(key)));
        }
        return result;
    }
}
