package session3.y26_m05.week01.swea_0006_d2_p1204;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 문제: 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
 * 난이도: D2
 * 작성자: 이승건
 * 작성일: 26. 5. 5.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV13zo1KAAACFAYh&categoryId=AV13zo1KAAACFAYh&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=
 */

public class Solution {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week01\\swea_0006_D2_p1204\\res\\input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < 1000; i++) {
                int temp = sc.nextInt();

                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
            int max = 0;
            int maxCount = 0;

            for (int key: map.keySet()) {
                if (maxCount < map.get(key)) {
                    max = key;
                    maxCount = map.get(key);
                }else if (maxCount == map.get(key)) {
                    max = Math.max(max, key);
                }
            }

            System.out.println("#" + test_case + " " + max);
        }
    }
}
