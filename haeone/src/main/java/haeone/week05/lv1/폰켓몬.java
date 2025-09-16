package main.java.week05.lv1;
import java.util.HashSet;
import java.util.Set;
public class 폰켓몬 {
    public int solution(int[] nums) {
        /*
         * 이름: 최혜원
         * 날짜: 2025.09.03
         * 문제: https://www.notion.so/lv1-269f79a9c53d81e282fbf5c97ba4f8b3
         * */
        // 조건: num의 길이는 항상 짝수
        // num.length/2
        // 가장많은 종류의 포켓몬을 가져가보자

        Set<Integer> result = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            result.add(nums[i]);
        }//for
        if(result.size() > nums.length / 2){
            return nums.length / 2;
        }

        return result.size();
    }
}
