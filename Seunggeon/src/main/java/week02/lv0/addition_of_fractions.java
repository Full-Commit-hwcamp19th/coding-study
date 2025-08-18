package week02.lv0;
/*
 * 이름: 이승건
 * 날짜: 25. 8. 10.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120808
* */

import java.util.Arrays;
import java.util.Scanner;

public class addition_of_fractions {
    public static int[] solution(int number1, int denom1, int number2, int denom2){
        int[] answer = {0,0};
        int number = number1 * denom2 + number2 * denom1;
        int denom = denom1 * denom2;
        int minimum = Math.min(number,denom);
        int o = 0;
        //최대 공약수 찾기
        for(int i = 1; i <= minimum; i++){
            if(denom % i == 0 && number % i == 0){
                o = i;
            }
        }
        answer[0] = number / o;
        answer[1] = denom / o;
        return answer;
    }

    public static int[] solution2(int number1, int denom1, int number2, int denom2){
        int number = number1 * denom2 + number2 * denom1;
        int denom = denom1 * denom2;
        int o = 0;
        // 최대 공약수 찾기 - 굳이 작은값을 찾을 필요가 없다.   
        // 어차피 더 큰값에서 시작을 해도 반대쪽 보다 작아지기 전에는 나머지가 0이 안나옴
        for(int i = denom; i > 0; i--){
            if(denom % i == 0 && number % i == 0){
                o = i;
                break;
            }
        }
        int[] answer = {number/o, denom/o};
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int denom1 = sc.nextInt();
        int number2 = sc.nextInt();
        int denom2 = sc.nextInt();
        int[] answer = solution(number1, denom1, number2, denom2);
        System.out.println(Arrays.toString(answer));
    }
}
