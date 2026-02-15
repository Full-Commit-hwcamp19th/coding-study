package session2.y26_m2.week02.step06_08_p25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 문제: 너의 평점은
 * 작성자: 이승건
 * 작성일: 26. 2. 12.
 * 문제 주소: https://www.acmicpc.net/problem/25206
 */

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            double sum = 0;
            double temp = 0;
            StringTokenizer st;
            for (int i = 0; i < 20; i++) {
                st = new StringTokenizer(br.readLine());

                String subject = st.nextToken();
                String point = st.nextToken();
                String credit = st.nextToken();

                if(credit.equals("P")) {
                    continue;
                }

                sum += Double.parseDouble(point) * map.get(credit);
                temp += Double.parseDouble(point);
            }

            System.out.println(sum / temp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
