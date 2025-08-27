package week04.lv0;

import java.io.*;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 20.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120848
* */

public class Factorial {
    private static int solution(int n) {
        int answer = 1;

        int factorial = 1;
        while(factorial <= n) {
            answer++;
            factorial = factorial * answer;
        }
        return answer - 1;
    }

    public static void main(String[] args) {
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            str = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int n = Integer.parseInt(str);
        int answer = solution(n);

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(Integer.valueOf(answer).toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
