package session2.y26_m03.week01.step10_03_p3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 문제: 네 번재 점
 * 작성자: 이승건
 * 작성일: 26. 3. 6.
 * 문제 주소: https://www.acmicpc.net/problem/3009
 */

public class Main {
    public static void main(String[] args) {

        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st;
            for (int i = 0; i < 3; i++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if(!xSet.contains(x)) {
                    xSet.add(x);
                } else {
                    xSet.remove(x);
                }

                if(!ySet.contains(y)) {
                    ySet.add(y);
                } else {
                    ySet.remove(y);
                }
            }

            int x = xSet.iterator().next();
            int y = ySet.iterator().next();

            System.out.println(x + " " + y);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
