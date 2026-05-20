package session3.y26_m05.week02.swea_0018_d2_p1974;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 1974. 스도쿠 검증
 * 난이도: D2
 * 작성자: 이승건
 * 작성일: 26. 5. 17.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5Psz16AYEDFAUq&categoryId=AV5Psz16AYEDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week02\\swea_0018_d2_p1974\\res\\input.txt"));

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
            int[][] arr = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int answer = 1;
            // 가로 체크
            for (int i = 0; i < 9; i++) {
                if(answer == 0) {
                    break;
                }

                boolean[] check = new boolean[9];

                for (int j = 0; j < 9; j++) {
                    check[arr[i][j] - 1] = true;
                }

                for (int j = 0; j < 9; j++) {
                    if(!check[j]) {
                        answer = 0;
                        break;
                    }
                }
            }
            // 세로 체크
            for (int i = 0; i < 9; i++) {
                if (answer == 0) {
                    break;
                }
                
                boolean[] check = new boolean[9];

                for (int j = 0; j < 9; j++) {
                    check[arr[j][i] - 1] = true;
                }

                for (int j = 0; j < 9; j++) {
                    if(!check[j]) {
                        answer = 0;
                        break;
                    }
                }
            }
            // 3x3 블럭 체크
            for (int i = 0; i < 9; i = i + 3) {
                if (answer == 0) {
                    break;
                }
                for (int j = 0; j < 9; j = j + 3) {
                    if(answer == 0) {
                        break;
                    }

                    boolean[] check = new boolean[9];

                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            check[arr[k][l] - 1] = true;
                        }
                    }

                    for (int k = 0; k < 9; k++) {
                        if(!check[k]) {
                            answer = 0;
                            break;
                        }
                    }
                }
            }
            

            System.out.println("#" + test_case + " " + answer);
            
        }
    }
}
