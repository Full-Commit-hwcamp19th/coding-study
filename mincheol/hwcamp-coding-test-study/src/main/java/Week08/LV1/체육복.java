package Week08.LV1;

import java.util.Set;
import java.util.HashSet;

/*
 * 이름: 변민철
 * 날짜: 25. 10. 12.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42862?language=java
 * */
//  (5, new int[]{2, 4}, new int[]{1, 3, 5}, 5)
//  (5, new int[]{2, 4}, new int[]{3}, 4)
//  (3, new int[]{3}, new int[]{1}, 2)
public class 체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        for(int l : lost) lostSet.add(l);
        for(int r : reserve) reserveSet.add(r);

        // 여벌있는 사람이 도난당한 경우는 제외하기
        Set<Integer> selfReserveSet = new HashSet<>(lostSet);
        selfReserveSet.retainAll(reserveSet);
        lostSet.removeAll(selfReserveSet);
        reserveSet.removeAll(selfReserveSet);

        // 하나씩 앞 뒤 순서에 있는지 검증
        for (int r : reserveSet) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }
        answer = n - lostSet.size();
        return answer;
    }
}
