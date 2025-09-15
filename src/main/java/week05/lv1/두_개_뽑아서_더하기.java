package main.java.week05.lv1;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Arrays;
public class 두_개_뽑아서_더하기 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.09.03
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/68644
     * */
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length ; i++){
            for(int j = i+1; j < numbers.length ; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }//for

        int[] answer = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int index = 0;
        while (it.hasNext()) {
            answer[index++] = it.next();
        }//while

        Arrays.sort(answer);

        return answer;
    }
}
