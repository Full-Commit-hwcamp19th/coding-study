package main.java.week06.lv2;
import java.util.Arrays;
public class 전화번호_목록 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.09.09
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42577
     * */
        public boolean solution(String[] phone_book) {
            // 사전순 정렬
            Arrays.sort(phone_book);

            for (int i = 0; i < phone_book.length - 1; i++) {
                if (phone_book[i + 1].startsWith(phone_book[i])) {
                    return false;
                }
            }
            return true;
        }
    }