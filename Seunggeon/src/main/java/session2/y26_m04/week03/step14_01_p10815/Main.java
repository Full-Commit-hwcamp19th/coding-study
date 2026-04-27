package session2.y26_m04.week03.step14_01_p10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 문제: 숫자 카드
 * 작성자: 이승건
 * 작성일: 26. 4. 14.
 * 문제 주소: https://www.acmicpc.net/problem/10815
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, m, temp;
        Map<Integer, Boolean> map = new HashMap<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            map.put(Integer.parseInt(st.nextToken()), true);
        }

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            temp = Integer.parseInt(st.nextToken());
            if(map.containsKey(temp)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
