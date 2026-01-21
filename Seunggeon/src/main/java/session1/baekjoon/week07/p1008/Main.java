package baekjoon.week07.p1008;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 12.
 * 문제: https://www.acmicpc.net/problem/1008
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

            System.out.println(a / (double)b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
