package session3.y26_m05.week01.swea_0009_d2_p1926;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 1926. 간단한 369게임
 * 난이도: D2
 * 작성자: 이승건
 * 작성일: 26. 5. 8.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PTeo6AHUDFAUq&categoryId=AV5PTeo6AHUDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week01\\swea_0009_de_p1926\\res\\input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for (int i = 1; i <= n; i++) {
            String temp = String.valueOf(i);

            temp = temp.replaceAll("[369]", "-");

            if (temp.contains("-")) {
                temp = temp.replaceAll("[0-9]", "");
            }

            System.out.print(temp + " ");
        }
    }
}
