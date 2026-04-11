package session2.y26_m04.week02.step13_09_p1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 문제: 단어 정렬
 * 작성자: 이승건
 * 작성일: 26. 4. 11.
 * 문제 주소: https://www.acmicpc.net/problem/1181
 */

public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        Set<String> set = new HashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        String[] arr = set.toArray(new String[0]);

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
