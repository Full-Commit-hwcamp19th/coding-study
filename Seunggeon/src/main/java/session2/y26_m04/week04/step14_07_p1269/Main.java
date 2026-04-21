package session2.y26_m04.week04.step14_07_p1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 문제: 대칭 차집합
 * 작성자: 이승건
 * 작성일: 26. 4. 21.
 * 문제 주소: https://www.acmicpc.net/problem/1269
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> diffA = new HashSet<>(setA);
        Set<Integer> diffB = new HashSet<>(setB);

        diffA.removeAll(setB);
        diffB.removeAll(setA);

        System.out.println(diffA.size() + diffB.size());
    }
}
