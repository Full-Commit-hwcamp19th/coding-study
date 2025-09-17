package baekjoon.week07.p10926;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 12.
 * 문제: https://www.acmicpc.net/problem/10926
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringBuilder sb = new StringBuilder();
            sb.append(br.readLine());
            sb.append("??!");

            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}