package session2.y26_m01.week03.step03_11_p10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 문제: A+B - 5
 * 작성자: 이승건
 * 작성일: 26. 1. 22.
 * 문제 주소: https://www.acmicpc.net/problem/10952
 */

public class Main {
    public static void main(String[] args) {

        List<Integer[]> list = new ArrayList<>();

        int a, b;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            do {
                StringTokenizer st = new StringTokenizer(br.readLine());

                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                list.add(new Integer[]{a, b});
            } while(a != 0 || b != 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(int i = 0; i < list.size() - 1; i++) {
            System.out.println(list.get(i)[0] + list.get(i)[1]);
        }

    }
}
