package baekjoon.week08.p9498;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 18.
 * 문제: https://www.acmicpc.net/problem/9498
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static char solution(int score) {
        char answer;

        score = score / 10;
        switch (score) {
            case 10:
            case 9:
                answer = 'A';
                break;
            case 8:
                answer ='B';
                break;
            case 7:
                answer ='C';
                break;
            case 6:
                answer ='D';
                break;
            default:
                answer ='F';
        };

        return answer;
    }

    public static void main(String[] args) {
        int score;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("점수를 입력하세요: ");
            score = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        char answer = solution(score);
        System.out.println("정답: " + answer);
    }
}
