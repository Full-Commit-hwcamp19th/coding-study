package session3.y26_m05.week01.swea_0010_d1_p2071;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 2071. 평균값 구하기
 * 난이도: D1
 * 작성자: 이승건
 * 작성일: 26. 5. 9.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QRnJqA5cDFAUq&categoryId=AV5QRnJqA5cDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week01\\swea_0010_d1_p2071\\res\\input.txt"));

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
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += sc.nextInt();
            }
            System.out.println("#" + test_case + " " + Math.round(sum / 10.0));
        }
    }
}
