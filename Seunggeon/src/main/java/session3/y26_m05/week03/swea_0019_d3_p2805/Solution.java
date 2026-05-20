package session3.y26_m05.week03.swea_0019_d3_p2805;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 2805. 농작물 수확하기
 * 난이도: D3
 * 작성자: 이승건
 * 작성일: 26. 5. 18.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV7GLXqKAWYDFAXB&categoryId=AV7GLXqKAWYDFAXB&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week03\\swea_0019_d3_p2805\\res\\input.txt"));

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

            int sum = 0;

            for (int i = 0; i < n / 2; i++) {
                String str = sc.next();

                int temp = 2 * i + 1;
                int left = (n - temp) / 2;
                int right = left + temp;

                for (int j = 0; j < n; j++) {

                    if (j < left || j >= right) {
                        continue;
                    } else {
                        sum += Integer.parseInt(String.valueOf(str.charAt(j)));
                    }

                }
            }

            for (int i = n / 2; i >= 0; i--) {
                String str = sc.next();

                int temp = 2 * i + 1;
                int left = (n - temp) / 2;
                int right = left + temp;

                for (int j = 0; j < n; j++) {
                    if (j < left || j >= right) {
                        continue;
                    } else {
                        sum += Integer.parseInt(String.valueOf(str.charAt(j)));
                    }
                }
            }

            System.out.println("#" + test_case + " " + sum);

        }
    }
}
