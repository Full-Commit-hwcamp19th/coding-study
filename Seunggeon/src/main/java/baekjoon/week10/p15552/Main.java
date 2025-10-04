package baekjoon.week10.p15552;

/*
 * 이름: 이승건
 * 날짜: 25. 10. 2.
 * 문제: https://www.acmicpc.net/problem/15552
* */

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st;
            int a, b;
            for(int i = 0 ; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                bw.write(String.valueOf(a+b));
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
