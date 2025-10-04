package baekjoon.week10.p25314;

/*
 * 이름: 이승건
 * 날짜: 25. 10. 2.
 * 문제: https://www.acmicpc.net/problem/25314
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("n을 입력하세요: ");
            int n = Integer.parseInt(br.readLine());

            String str = "int";
            for(int i = 0; i < (int)Math.ceil(n/4.0); i++) {
                str = "long " + str;
            }

            System.out.println(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
