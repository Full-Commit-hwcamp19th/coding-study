package session2.y26_m04.week03.step14_03_p7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 문제: 회사에 있는 사람
 * 작성자: 이승건
 * 작성일: 26. 4. 16.
 * 문제 주소: https://www.acmicpc.net/problem/7785
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Boolean> map = new HashMap<>();
        StringTokenizer st;

        String emp;
        boolean flag;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            emp = st.nextToken();
            flag = "enter".equals(st.nextToken());

            map.put(emp, flag);
        }

        List<String> list = new ArrayList<>();
        for (String key: map.keySet()) {
            if (map.get(key)) {
                list.add(key);
            }
        }
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }
}
