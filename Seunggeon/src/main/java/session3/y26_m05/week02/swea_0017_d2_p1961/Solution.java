package session3.y26_m05.week02.swea_0017_d2_p1961;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 1961. 숫자 배열 회전
 * 난이도: D2
 * 작성자: 이승건
 * 작성일: 26. 5. 16.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5Pq-OKAVYDFAUq&categoryId=AV5Pq-OKAVYDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week02\\swea_0017_d2_p1961\\res\\input.txt"));

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
            System.out.println("#" + test_case);

            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int[][] side90 = rotate90(arr);
            int[][] side180 = rotate90(side90);
            int[][] side270 = rotate90(side180);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(side90[i][j]);
                }
                sb.append(" ");

                for (int j = 0; j < n; j++) {
                    sb.append(side180[i][j]);
                }
                sb.append(" ");
                for (int j = 0; j < n; j++) {
                    sb.append(side270[i][j]);
                }
                sb.append("\n");
            }

            System.out.print(sb.toString());
        }
    }

    private static int[][] rotate90(int[][] arr) {
        int n = arr.length;

        int[][] temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][n - i - 1] = arr[i][j];
            }

        }
        return temp;
    }
}
