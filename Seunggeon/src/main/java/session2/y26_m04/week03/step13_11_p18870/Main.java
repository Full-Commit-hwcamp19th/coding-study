package session2.y26_m04.week03.step13_11_p18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 문제: 좌표 압축
 * 작성자: 이승건
 * 작성일: 26. 4. 13.
 * 문제 주소: https://www.acmicpc.net/problem/18870
 */

public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        int[] arr;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int count = 0;
        for (int num: set.toArray(new Integer[0])) {
            map.put(num, count);
            count++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i]) + " ");
        }

        System.out.println(sb.toString().trim());
    }
}
