package session3.y26_m04.week05.swea_0003_d3_p1206;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 문제: 1206. [S/W 문제해결 기본] 1일차 - View
 * 난이도: D3
 * 작성자: 이승건
 * 작성일: 26. 5. 1.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV134DPqAA8CFAYh&categoryId=AV134DPqAA8CFAYh&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/main/java/session3/y26_m04/week05/swea_0003_d3_p1206/res/sample_input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T = 10;
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        int[] dx = {-1, -2, 1, 2};

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int count = 0;

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 2; i < n - 2; i++) {
                int temp = 0;

                for (int j = 0; j < 4; j++) {
                    int nx = i + dx[j];

                    if (temp < arr[nx]) {
                        temp = arr[nx];
                    }
                }

                if (arr[i] > temp) {
                    count += arr[i] - temp;
                }
            }

            System.out.println("#" + test_case + " " + count);

        }
    }
}