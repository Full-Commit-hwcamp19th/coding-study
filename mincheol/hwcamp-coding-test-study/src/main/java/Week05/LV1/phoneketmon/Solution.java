package Week05.LV1.phoneketmon;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 27.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/1845
 * */
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>(); //중복제거(종류만)
        for(int a : nums){
            set.add(a);
        }

        if(set.size() > nums.length/ 2){
            answer = nums.length / 2;       //종류가 가져갈 N/2 보다 많으면 가져갈 수 만큼이 최대 종류 수
        } else {
            answer = set.size();            //종류가 가져갈 N/2 보다 적으면 기존 종류 수가 최대 종류 수
        }

        return answer;
    }
}
