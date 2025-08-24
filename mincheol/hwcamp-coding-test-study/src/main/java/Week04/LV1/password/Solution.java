package Week04.LV1.password;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 24.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/155652
 * */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static String solution(String s, String skip, int index) {
//        String answer = "";
//        char[] sArr = s.toCharArray();
//        char[] skipArr = skip.toCharArray();
//        for (int i = 0; i < sArr.length; i++) {
//            for (int j = 0; j < index; j++) {
//                sArr[i] = (char) (sArr[i] + 1);
//                for (int k = 0; k < skipArr.length; k++) {
//                    if (sArr[i] == skipArr[k]) {
//                        sArr[i] = (char) (sArr[i] + 1);
//                    }
//                    if (sArr[i] > 'z') {
//                        sArr[i] = (char) (sArr[i] - 'z' + 'a' - 1);
//                    }
//                }
//            }
//        }
//        answer = String.valueOf(sArr);
//        return answer;

        String answer = "";
        char[] sArr = s.toCharArray();
        char[] skipArr = skip.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            int moved = 0; //글자순서이동횟수
            while (moved < index) {
                sArr[i]++; //글자앞으로1씩이동
                if (sArr[i] > 'z') { // 'z'보다 크면 다시 'a'부터 순환
                    sArr[i] = 'a';
                }
                boolean isSkip = false; //skip에 있는지 확인여부
                for (char sk : skipArr) {
                    if (sArr[i] == sk) {
                        isSkip = true; //skip에 있으면 true
                        break;
                    }
                }
                if (!isSkip) moved++;   //skip에 있으면 다시 while문 반복(moved++ 없이: 이동한걸로 치면 안됨)
                                        //없으면 이동 횟수 증가(이동한 걸로 침)
            }
        }
        answer = String.valueOf(sArr);
        return answer;


    }
}
