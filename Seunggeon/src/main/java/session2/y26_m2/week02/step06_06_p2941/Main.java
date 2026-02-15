package session2.y26_m2.week02.step06_06_p2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 크로아티아 알파벳
 * 작성자: 이승건
 * 작성일: 26. 2. 11.
 * 문제 주소: https://www.acmicpc.net/problem/2941
 */

public class Main {
    public static void main(String[] args) {
        /**
         * c=
         * c-
         * dz=
         * d-
         * lj
         * nj
         * s=
         * z=
         */

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String str = br.readLine();

            int count = 0;

            for (String tmp : arr) {
                int k;
                while ((k = str.indexOf(tmp)) != -1) {
                    str = str.substring(0, k) + ' ' + str.substring(k + tmp.length());
                    count++;
                }
            }
            str = str.trim();   // 앞뒤 공백 제거
            str = str.replace(" ", "");
            System.out.println(count + str.length());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
