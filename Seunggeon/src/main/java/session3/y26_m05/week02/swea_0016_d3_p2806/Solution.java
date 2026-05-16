package session3.y26_m05.week02.swea_0016_d3_p2806;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 2806. N-Queen
 * 난이도: D3
 * 작성자: 이승건
 * 작성일: 26. 5. 15.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV7GKs06AU0DFAXB&categoryId=AV7GKs06AU0DFAXB&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week02\\swea_0016_d3_p2806\\res\\sample_input.txt"));

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
            int[][] arr = new int[n][n];

            int count = 0;

            count = findNQueen(arr, 0, count, n);

            System.out.println("#" + test_case + " " + count);
        }
    }

    private static int findNQueen(int[][] arr, int num, int count, int n) {
        if (num == n) {;
            return count + 1;
        }

        for (int i = 0; i < n; i++) {
            if(arr[num][i] != 0) {
                continue;
            } else {
                // 퀸이 놓이는 공간 + 공격 가능한 공간
                updateAttackZone(arr, num, i, 1, n);

                // 다음 칸 진행
                count = findNQueen(arr, num + 1, count, n);

                // 퀸이 놓인 공간이랑 공격 가능한 공간 빈칸으로 만들기
                updateAttackZone(arr, num, i, -1, n);
            }
        }

        return count;

    }

    private static void updateAttackZone(int[][] arr, int num, int i, int mode, int n) {
        int[] dx = {-1, 1, -1, 1};
        int[] dy = {-1, -1, 1, 1};


        for (int j = 0; j < n; j++) {
            arr[num][j] += mode;
        }

        for (int j = 0; j < n; j++) {
            arr[j][i] += mode;
        }

        for (int j = 0; j < 4; j++) {
            int x = i;
            int y = num;

            while (true) {
                x += dx[j];
                y += dy[j];

                if (x < 0 || x >= n || y < 0 || y >= n) {
                    break;
                }

                arr[y][x] += mode;
            }
        }
    }
}
