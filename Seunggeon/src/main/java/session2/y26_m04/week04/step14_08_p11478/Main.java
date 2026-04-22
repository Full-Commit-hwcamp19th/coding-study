package session2.y26_m04.week04.step14_08_p11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 문제: 서로 다른 부분 문자열의 개수
 * 작성자: 이승건
 * 작성일: 26. 4. 22.
 * 문제 주소: https://www.acmicpc.net/problem/11478
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new HashSet<>();
        String str = br.readLine();

        for (int i = 1; i <= str.length(); i++) {
                String temp;
                for (int j = 0; j <= str.length() - i; j++) {
                    temp = str.substring(j, j+i);

                    set.add(temp);
                }
        }

        System.out.println(set.size());
    }
}
