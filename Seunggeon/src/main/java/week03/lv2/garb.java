package week03.lv2;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 18.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42578
* */

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class garb {

    private static int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        int answer = 1;
        for(String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String str;
        String[][] clothes;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //의상의 개수 입력
            str = br.readLine();
            int n = Integer.parseInt(str);
            clothes = new String[n][2];

            for (int i = 0; i < n; i++) {
                str = br.readLine();
                StringTokenizer st = new StringTokenizer(str);
                clothes[i][0] = st.nextToken();
                clothes[i][1] = st.nextToken();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(clothes);

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write(answer);
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
