package Week01.LV0;
/*
 * 이름: 이승건
 * 날짜: 25. 8. 5.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120822
* */

import java.util.Scanner;

public class flippedString {
    public static String solution(String my_string) {String answer = "";
        for(int i = my_string.length()-1; i >= 0; i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        String answer = solution(my_string);
        System.out.println(answer);
    }
}
