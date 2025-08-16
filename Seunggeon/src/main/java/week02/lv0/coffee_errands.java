package week02.lv0;
/*
 * 이름: 이승건
 * 날짜: 25. 8. 8.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/181837
* */

import java.util.Scanner;

public class coffee_errands {
    // 일단 만들기
    public static int solution(String[] order){
        int answer = 0;
        for(String s: order){
            switch (s){
                case "anything":
                case "americano":
                case "iceamericano":
                case "americanoice":
                    answer += 4500;
                    break;
                case "hotamericano":
                case "americanohot":
                    answer += 4500;
                    break;
                case "cafelatte":
                case "icecafelatte":
                case "cafelatteice":
                    answer += 5000;
                    break;
                case "hotcafelatte":
                case "cafelattehot":
                    answer += 5000;
                    break;
            }
        }
        return answer;
    }

    // solution 수정: 뜨거운 것과 차거운 것의 가격이 동일
    public static int solution2(String[] order){
        int answer = 0;
        for(String s: order){
            switch (s){
                case "anything":
                case "americano":
                case "iceamericano":
                case "americanoice":
                case "hotamericano":
                case "americanohot":
                    answer += 4500;
                    break;
                case "cafelatte":
                case "icecafelatte":
                case "cafelatteice":
                case "hotcafelatte":
                case "cafelattehot":
                    answer += 5000;
                    break;
            }
        }
        return answer;
    }

    // solution2 수정: switch문을 사용해야 될까?
    // 단어에 americano, cafelatte, anything 중 무엇이 들어가기만 알면 된다.
    // 근데 anything은 어차피 americano로 취급하므로 cafelatte 인지 아닌지만 구분 가능하면 된다.
    public static int solution3(String[] order) {
        int answer = 0;
        for(String s: order){
            if(s.contains("cafelatte")){
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] order = sc.nextLine().split(" ");
        int answer = solution(order);
        int answer2 = solution2(order);
        System.out.println(answer);
        System.out.println(answer2);
    }
}
