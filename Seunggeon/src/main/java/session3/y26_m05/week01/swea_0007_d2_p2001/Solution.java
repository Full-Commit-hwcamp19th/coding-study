package session3.y26_m05.week01.swea_0007_d2_p2001;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 2001. 파리 퇴치
 * 난이도: D2
 * 작성자: 이승건
 * 작성일: 26. 5. 6.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PzOCKAigDFAUq&categoryId=AV5PzOCKAigDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week01\\swea_0007_d2_p2001\\res\\input.txt"));

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
            int m = sc.nextInt();

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int max = 0;

            for (int i = 0; i < n - m + 1; i++) {
                for (int j = 0; j < n - m + 1; j++) {
                    int temp = 0;
                    for (int k = i; k < i + m; k++) {
                        for (int l = j; l < j + m; l++) {
                            temp += arr[k][l];
                        }
                    }

                    if (max < temp) {
                        max = temp;
                    }
                }
            }

            System.out.println("#" + test_case + " " + max);
        }
    }
}
