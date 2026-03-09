package session2.y26_m03.week01.step10_05_p9063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 대지
 * 작성자: 이승건
 * 작성일: 26. 3. 8.
 * 문제 주소: https://www.acmicpc.net/problem/9063
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int minX = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxY = Integer.MIN_VALUE;

            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if (maxX < x) {
                    maxX = x;
                }

                if(minX > x){
                    minX = x;
                }

                if (maxY < y) {
                    maxY = y;
                }

                if(minY > y){
                    minY = y;
                }
            }

            System.out.println((maxX - minX) * (maxY - minY));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
