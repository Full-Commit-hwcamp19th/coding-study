package session3.y26_m05.week01.swea_0011_d1_p2056;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 2056. 연월일 달력
 * 난이도: D1
 * 작성자: 이승건
 * 작성일: 26. 5. 10.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QLkdKAz4DFAUq&categoryId=AV5QLkdKAz4DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week01\\swea_0011_d1_p2056\\res\\input.txt"));

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
            String date = sc.next();

            String year = date.substring(0, 4);
            String month = date.substring(4, 6);
            String day = date.substring(6);

            StringBuilder sb = new StringBuilder();

            if (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
                sb.append(-1);
            } else {
                switch (Integer.parseInt(month)) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31) {
                            sb.append(-1);
                        } else {
                            sb.append(year).append("/").append(month).append("/").append(day);
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 30) {
                            sb.append(-1);
                        } else {
                            sb.append(year).append("/").append(month).append("/").append(day);
                        }
                        break;
                    case 2:
                        if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 28) {
                            sb.append(-1);
                        } else {
                            sb.append(year).append("/").append(month).append("/").append(day);
                        }
                        break;
                }
            }
            sb.insert(0, "#" + test_case + " ");
            System.out.println(sb.toString());
        }
    }
}
