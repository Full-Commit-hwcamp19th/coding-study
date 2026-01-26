package baekjoon.week07.p10998;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 12.
 * 문제: https://www.acmicpc.net/problem/10998
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a * b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
