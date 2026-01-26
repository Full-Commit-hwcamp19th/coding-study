package baekjoon.week08.p14681;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 18.
 * 문제: https://www.acmicpc.net/problem/14681
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int solution(int x, int y) {
        int answer;

        if(x > 0 && y > 0){
            answer = 1;
        } else if (x < 0 && y > 0) {
            answer = 2;
        } else if (x < 0 && y < 0) {
            answer = 3;
        } else {
            answer = 4;
        }

        return answer;
    }

    public static void main(String[] args) {

        int x, y;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("x 좌표를 입력하세요: ");
            x = Integer.parseInt(br.readLine());

            System.out.print("y 좌표를 입력하세요: ");
            y = Integer.parseInt(br.readLine());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(x, y);
        System.out.println("정답: " + answer);
    }
}