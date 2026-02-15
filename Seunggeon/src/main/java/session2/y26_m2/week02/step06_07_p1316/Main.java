package session2.y26_m2.week02.step06_07_p1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 문제: 그룹 단어 체커
 * 작성자: 이승건
 * 작성일: 26. 2. 12.
 * 문제 주소: https://www.acmicpc.net/problem/1316
 */

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int count = 0;

            String str;
            for (int i = 0; i< n; i++) {
                str = br.readLine();

                HashMap<Character, Boolean> map = new HashMap<>();

                char c = '\u0000';
                for (int j = 0; j < str.length(); j++) {

                    if (c == str.charAt(j)) {
                        continue;
                    }

                    c = str.charAt(j);

                    if(map.containsKey(c)) {
                        map.put(c, false);
                        break;
                    } else {
                        map.put(c, true);
                    }
                }
                if(!map.containsValue(false)) {
                    count++;
                }

            }

            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
