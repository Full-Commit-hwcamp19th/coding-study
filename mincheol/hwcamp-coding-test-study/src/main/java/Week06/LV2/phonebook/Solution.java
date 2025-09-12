package Week06.LV2.phonebook;

import java.util.Arrays;

/*
 * 이름: 변민철
 * 날짜: 25. 09. 08.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42577
 * */
public class Solution {
    public static boolean solution(String[] phone_book) {
        // 전화번호 목록을 정렬합니다.
        Arrays.sort(phone_book);

        // 정렬된 목록에서 인접한 번호들을 비교합니다.
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 번호(phone_book[i+1])가 이전 번호(phone_book[i])로 시작하는지 확인합니다.
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false; // 접두어 관계가 있으면 false 반환
            }
        }

        return true;
    }
}
