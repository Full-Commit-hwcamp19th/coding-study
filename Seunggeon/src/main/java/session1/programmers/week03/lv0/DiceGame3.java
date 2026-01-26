package programmers.week03.lv0;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 16.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/181916
* */

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DiceGame3 {
    public static int solution(int a, int b, int c, int d) {
        int answer = 1;

        int[] arr = {a, b, c, d};
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        switch(map.size()){// size(): hashmap의 키-쌍의 개수(HashMap 내부 변수 size 리턴)
            // 모두 같은 경우: 1111 * key값
            case 1:
                for(Integer key : map.keySet()){
                   answer = 1111 * key;
                }
                break;
            // 2:2 인 경우 : (p+q)*|p-q|
            // 3:1 인 경우 : (10*p+q)^2   | p: 3개인 key, q: 1개인 key
            case 2:
                int p = 0, q = 0;
                boolean flag = false;
                for(Integer key : map.keySet()) {
                    // 3:1인 경우
                    if(map.get(key) == 1){
                        q = key;
                    }
                    else if(map.get(key) == 3){
                        p = key;
                    }
                    // 2:2 인 경우
                    else if(map.get(key) == 2) {
                        if(p == 0) p = key;
                        else q = key;
                        flag = true;    // 어던 방향으로의 계산을 할 것인가?
                    }
                }
                // 3:1인 경우
                if(!flag){
                    answer = (int)Math.pow((10 * p + q), 2);
                }
                // 2:2인 경우
                else{
                    answer = (p + q) * Math.abs(p - q);
                }

                break;
            // 2:1:1 인 경우: 1개인 key의 곱
            case 3:
                for(Integer key : map.keySet()){
                    if(map.get(key) == 1){
                        answer *= key;
                    }
                }
                break;
            // 1:1:1:1 인 경우: 가장 작은 key
            case 4:
                int min = Integer.MAX_VALUE;
                for(Integer key : map.keySet()){
                    if(min > key){
                        min = key;
                    }
                }
                answer = min;
                break;
        }
        return answer;
    }


    public static void main(String[] args) {

        String str;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StringTokenizer st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int answer = solution(a, b, c, d);
//        System.out.println(answer);
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("정답: ");
//            bw.write(answer); // 그냥 숫자로 출력하면 문자로 변환해서 출력해서 이상하게 나옴
            bw.write(Integer.valueOf(answer).toString());
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
