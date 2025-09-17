package baekjoon.week05.p1193;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 2.
 * 문제: https://www.acmicpc.net/problem/1193
* */

import java.io.*;

public class Main {
    private static void solution(int n) {
        boolean flag = true;
        boolean flag2 = true;
        int Numer = 1;
        int Denom = 1;

        while(n > 1) {
            if (flag == true && Numer == 1 && flag2) {
                Denom += 1;
                n--;
                flag2 = false;
                continue;
            } else if (flag == false && Denom == 1 && flag2) {
                Numer += 1;
                n--;
                flag2 = false;
                continue;
            }

            if(flag == true && flag2 == false) {
                Numer += 1;
                Denom -= 1;
            } else if (flag == false && flag2 == false) {
                Numer -= 1;
                Denom += 1;
            }

            if(Numer == 1 || Denom == 1) {
                flag = !flag;
                flag2 = true;
            }
            n--;
        }
        System.out.println(Numer + "/" + Denom);
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            solution(n);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
