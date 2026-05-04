package session2.y26_m04.week05.step15_03_p1735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 문제: 분수 합
 * 작성자: 이승건
 * 작성일: 26. 4. 27.
 * 문제 주소: https://www.acmicpc.net/problem/1735
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[2][2];

        StringTokenizer st;
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] temp = new int[2];

        temp[1] = arr[0][1] * arr[1][1];
        temp[0] = arr[0][0] * arr[1][1] + arr[1][0] * arr[0][1];

        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();

        for (int i = 2; i <= temp[0]; i++) {
            while (temp[0] % i == 0) {
                if (mapA.containsKey(i)) {
                    mapA.put(i, mapA.get(i) + 1);
                } else {
                    mapA.put(i, 1);
                }

                temp[0] /= i;
            }
        }

        for (int i = 2; i <= temp[1]; i++) {
            while (temp[1] % i == 0) {
                if (mapB.containsKey(i)) {
                    mapB.put(i, mapB.get(i) + 1);
                } else {
                    mapB.put(i, 1);
                }

                temp[1] /= i;
            }
        }

        for (int key: mapA.keySet()) {
            if (mapB.containsKey(key)) {
                int min = Math.min(mapA.get(key), mapB.get(key));

                mapA.put(key, mapA.get(key) - min);
                mapB.put(key, mapB.get(key) - min);
            }
        }

        int[] result = {1, 1};
        for (int key: mapA.keySet()) {
            result[0] = (int) (result[0] * Math.pow(key, mapA.get(key)));
        }

        for (int key: mapB.keySet()) {
            result[1] = (int) (result[1] * Math.pow(key, mapB.get(key)));
        }

        System.out.println(result[0] + " " + result[1]);
    }
}
