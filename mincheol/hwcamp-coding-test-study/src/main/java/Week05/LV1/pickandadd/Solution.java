package Week05.LV1.pickandadd;
/*
 * 이름: 변민철
 * 날짜: 25. 08. 27.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/68644
 * */

import java.util.*;

public class Solution {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        int n = numbers.length;
        List<Integer> sumArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sumArr.add(numbers[i] + numbers[j]);
            }
        }
        answer = sumArr.stream().mapToInt(Integer::intValue).distinct().sorted().toArray();
        return answer;
    }

//    public static int[] solution(int[] numbers) {
//        Set<Integer> sumArr = new TreeSet<>();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                sumArr.add(numbers[i] + numbers[j]);
//            }
//        }
//        return sumArr.stream().mapToInt(Integer::intValue).toArray();
//    }
}

// 1. 두 수의 합 모든 경우의 수 nC2 -> nestedfor문
// 2. 두 수의 합을 리스트 컬렉션에 삽입
// 3. stream으로 중복제거, 정렬, 배열로 만들기
// + 두 수의 합을 저장할 때 중복 허용이 안되고 정렬해주는 TreeSet사용.
// + distinct()와 sorted() 사용할 필요 없음.