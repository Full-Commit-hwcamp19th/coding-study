package session3.y26_m05.week01.swea_0008_d3_p5215;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 5215. 햄버거 다이어트
 * 난이도: D3
 * 작성자: 이승건
 * 작성일: 26. 5. 7.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWT-lPB6dHUDFAVT&categoryId=AWT-lPB6dHUDFAVT&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week01\\swea_0008_d3_p5215\\res\\sample_input.txt"));

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
            int n = sc.nextInt(); // 재료의 수
            int l = sc.nextInt(); // 제한 칼로리

            int[] score = new int[n + 1]; // 맛에 대한 점수 (1번 인덱스부터 사용)
            int[] cal = new int[n + 1];   // 칼로리 (1번 인덱스부터 사용)

            for (int i = 1; i <= n; i++) {
                score[i] = sc.nextInt();
                cal[i] = sc.nextInt();
            }

            // dp[i][j]: 1~i번째 재료까지 고려했을 때, j 칼로리 이하로 얻을 수 있는 최대 점수
            int[][] dp = new int[n + 1][l + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= l; j++) {
                    // 현재 제한 칼로리 j보다 i번째 재료의 칼로리가 더 클 경우 (못 넣음)
                    if (cal[i] > j) {
                        dp[i][j] = dp[i - 1][j];
                    } 
                    // 넣을 수 있는 경우: (안 넣는 경우) vs (넣고 남은 칼로리의 최대 점수 + 현재 점수) 중 큰 값
                    else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - cal[i]] + score[i]);
                    }
                }
            }

            // 모든 재료를 고려하고 제한 칼로리가 l일 때의 최대 점수 출력
            System.out.println("#" + test_case + " " + dp[n][l]);
        }
    }
}
