package session2.y26_m2.week01.step06_02_p3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 킹, 퀸, 룩, 비숍, 나이트, 폰
 * 작성자: 이승건
 * 작성일: 26. 2. 8.
 * 문제 주소: https://www.acmicpc.net/problem/3003
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 8};

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 0; i < arr.length; i++) {
                if(i != 0) {
                    System.out.print(" ");
                }

                System.out.print(arr[i] - Integer.parseInt(st.nextToken()));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
