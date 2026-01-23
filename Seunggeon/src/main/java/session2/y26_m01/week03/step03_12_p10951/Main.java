package session2.y26_m01.week03.step03_12_p10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: A+B - 4
 * 작성자: 이승건
 * 작성일: 26. 1. 23.
 * 문제 주소: https://www.acmicpc.net/problem/10951
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while(true) {
                // 종료 조건이 따로 없다 보니 입력이 없으면 종료 조건 -> 그런데 StringTokenizer에서 바로 입력을 받게 되면 입력이 안된 경우에 대한 처리가 안됨
                String str = br.readLine();
                if(str == null) break;

                StringTokenizer st = new StringTokenizer(str);

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if(a < 0 || b < 0 || a > 10 || b > 10) break;

                System.out.println(a + b);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
