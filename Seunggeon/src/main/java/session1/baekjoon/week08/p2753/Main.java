package baekjoon.week08.p2753;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 18.
 * 문제: https://www.acmicpc.net/problem/2753
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int solution(int year) {
        int answer = 0;

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int year;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("년도를 입력하세요: ");
            year = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(year);
        System.out.println("정답: " + answer);
    }

}