package session2.y26_m01.week04.step05_02_p2743;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 단어 길이 재기
 * 작성자: 이승건
 * 작성일: 26. 1. 30.
 * 문제 주소: https://www.acmicpc.net/problem/2743
 */

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String str = br.readLine();

            System.out.println(str.length());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
