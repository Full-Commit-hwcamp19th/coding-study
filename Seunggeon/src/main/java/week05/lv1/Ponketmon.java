package week05.lv1;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 27.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/1845
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Ponketmon {

    public static int solution(int[] nums) {
        // 폰켓몬의 종류를 번호를 통해서 구분
        // 이 중 N/2마리를 선택 가능(N: 폰켓몬의 수)
        // 이 때 다양한 폰켓몬을 데려가고자 하는 경우 몇 종류를 데겨갈 수 있는가?
        
        /* 설명.
         *  n: 폰켓몬의 수, m: 폰켓몬의 종류 수
         *  1. n/2 >= m: m 종류의 폰켓몬 선택   : 가져갈 폰켓몬의 수가 폰켓몬의 종류보다 많은 경우
         *  2. n/2 < m: n/2종류의 폰켓몬 선택   : 가져갈 폰켓몬의 수가 폰켓몬의 종류보다 적은 경우
        * */
        
        // 동일한 종류의 폰켓몬을 중복제거하기 위해서 Set 사용
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums) {
            set.add(num);
        }
        int n = nums.length;
        int m = set.size();

        if(n / 2 >= m) {
            return m;
        } else {
            return n/2;
        }
    }

    public static void main(String[] args) {
        int[] nums;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("존재하는 폰켓몬을 나열하시오(공백으로 구분): ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            nums = new int[st.countTokens()];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(nums);
        System.out.print("정답: " + answer);
    }


}
