package baekjoon.week08.p25304;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 20.
 * 문제: https://www.acmicpc.net/problem/25304
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static String solution(int x, int[][] prod) {

        int prodSum = 0;
        for (int i = 0; i < prod.length; i++) {
            prodSum += prod[i][0] * prod[i][1];
        }

        if(x == prodSum) return "Yes";
        else return "No";
    }

    public static void main(String[] args) {
        int x;
        int[][] prod;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("총 금액: ");
            x = Integer.parseInt(br.readLine());

            System.out.print("물건의 종류 수: ");
            int n =  Integer.parseInt(br.readLine());

            prod = new int[n][2];
            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                System.out.print("물건의 금액과 개수를 입력하세요: ");
                st = new StringTokenizer(br.readLine());

                prod[i][0] = Integer.parseInt(st.nextToken());
                prod[i][1] = Integer.parseInt(st.nextToken());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String answer = solution(x, prod);
        System.out.print("정답: ");
        System.out.println(answer);

    }
}
