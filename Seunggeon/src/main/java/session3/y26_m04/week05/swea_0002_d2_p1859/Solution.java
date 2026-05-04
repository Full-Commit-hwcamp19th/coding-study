package session3.y26_m04.week05.swea_0002_d2_p1859;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 문제: 1859. 백만 장자 프로젝트
 * 난이도: D2
 * 작성자: 이승건
 * 작성일: 26. 4. 30.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LrsUaDxcDFAXc&categoryId=AV5LrsUaDxcDFAXc&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/main/java/session3/y26_m04/week05/swea_0002_d2_p1859/res/input.txt"));

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
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // 최대 이익은 int 범위를 넘을 수 있으므로 long 타입 사용
            long sum = 0;
            // 배열의 뒤에서부터 앞으로 탐색
            int maxPrice = arr[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                // 현재 가격이 지금까지의 최대 가격보다 높거나 같다면 최대 가격 갱신
                if (arr[i] >= maxPrice) {
                    maxPrice = arr[i];
                } else {
                    // 현재 가격이 최대 가격보다 낮다면, 그 차이만큼 이익에 더함 (물건을 사서 최대 가격일 때 파는 것과 동일)
                    sum += maxPrice - arr[i];
                }
            }

            System.out.println("#" + test_case + " " + sum);
        }
    }
}
