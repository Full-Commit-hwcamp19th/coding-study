package baekjoon.week08.p11021;

/*
 * 이름: 이승건
 * 날짜: 25. 10. 2.
 * 문제: https://www.acmicpc.net/problem/11021
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
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                StringBuilder sb = new StringBuilder();
                sb.append("Case #");
                sb.append(i+1);
                sb.append(": ");
                sb.append(a+b);


                bw.write(sb.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
