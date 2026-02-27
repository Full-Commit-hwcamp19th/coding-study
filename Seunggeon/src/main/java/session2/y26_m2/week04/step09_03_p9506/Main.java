package session2.y26_m2.week04.step09_03_p9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 문제: 약수들의 합
 * 작성자: 이승건
 * 작성일: 26. 2. 27.
 * 문제 주소: https://www.acmicpc.net/problem/9506
 */

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int number = 0;

            while (true) {
                number = Integer.parseInt(br.readLine());

                if (number == -1) {
                    break;
                }

                int sum = 1;

                List<Integer> list = new ArrayList<>();
                list.add(1);

                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                           sum += i;
                           list.add(i);
                    }
                }
                StringBuilder sb = new StringBuilder(String.valueOf(number));
                if (sum == number) {
                    sb.append(" = ");

                    for (int i = 0; i < list.size(); i++) {
                        sb.append(list.get(i));

                        if (i != list.size() - 1) {
                            sb.append(" + ");
                        }
                    }
                } else {
                    sb.append(" is NOT perfect.");
                }

                System.out.println(sb.toString());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
