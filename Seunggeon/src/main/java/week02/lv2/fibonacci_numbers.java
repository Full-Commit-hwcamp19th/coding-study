package week02.lv2;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 11.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12945
* */

import java.util.Scanner;

public class fibonacci_numbers {

    public static int solution(int n){

        if(n <= 1){
            return n % 1234567;
        }

        int temp1 = 0;
        int temp2 = 1;
        int number = 0;
        for(int i = 2; i <= n; i++){
            number = temp1 + temp2;
            //System.out.println(number);
            if(number >= 1234567) {
                number %= 1234567;
            }
            temp1 = temp2;
            temp2 = number;
        }

        return (int)(number % 1234567);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = solution(n);
        System.out.println(answer);
    }
}

/*
시간 초과
    public static int solution(int n){
        int fibonacci = fibonacci(n);
        return fibonacci % 1234567;
    }

    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return solution(n-1) + solution(n-2);
    }
* */
/*
실패: number를 찍어보니 오버플로 발생확인 -> 타입 변경
    public static int solution(int n){

        if(n <= 1){
            return n % 1234567;
        }

        int temp1 = 0;
        int temp2 = 1;
        int number = 0;
        for(int i = 2; i <= n; i++){
            number = temp1 + temp2;
            temp1 = temp2;
            temp2 = number;
            System.out.println(number);
        }

        return number % 1234567;
    }
* */
/*
실패: 동일하게 오버플로 발생 -> 먼저 나눈다음 더하면? 근데 이러면 다음 수를 구하기가 어려운데?
    public static int solution(int n){

        if(n <= 1){
            return n % 1234567;
        }

        long temp1 = 0;
        long temp2 = 1;
        long number = 0;
        for(int i = 2; i <= n; i++){
            number = temp1 + temp2;
            temp1 = temp2;
            temp2 = number;
            System.out.println(number);
        }

        return (int)(number % 1234567);
    }
* */
/*
실패: double로 변경해도 안되네... -> 나누는 숫자의 자릿수만 유지하고 있으면 되지 않을까?
    public static int solution(int n){

        if(n <= 1){
            return n % 1234567;
        }

        double temp1 = 0.0;
        double temp2 = 1.0;
        double number = 0.0;
        for(int i = 2; i <= n; i++){
            number = temp1 + temp2;
            temp1 = temp2;
            temp2 = number;
        }

        return (int)(number % 1234567);
    }
* */