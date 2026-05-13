package session3.y26_m05.week02.swea_0014_d2_p1979;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 1979. 어디에 단어가 들어갈 수 있을까
 * 난이도: D2
 * 작성자: 이승건
 * 작성일: 26. 5. 13.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PuPq6AaQDFAUq&categoryId=AV5PuPq6AaQDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week02\\swea_0014_d2_p1979\\res\\input.txt"));

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
            int k = sc.nextInt();

            int count = 0;
            int answer = 0;

            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();

                    if (arr[i][j] == 1) {
                        count++;
                    } else {
                        if (count == k) {
                           answer++;
                        }

                        count = 0;
                    }
                }
                if (count == k) {
                    answer++;
                }
                count = 0;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int temp = arr[j][i];

                    if (temp == 1) {
                        count++;
                    } else {
                        if (count == k) {
                            answer++;
                        }
                        count = 0;
                    }
                }
                if (count == k) {
                    answer++;
                }
                count = 0;
            }

            System.out.println("#" + test_case + " " + answer);
        }
    }
}
