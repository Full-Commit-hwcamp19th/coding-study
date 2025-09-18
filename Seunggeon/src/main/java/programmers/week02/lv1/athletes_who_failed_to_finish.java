package programmers.week02.lv1;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 10.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42576
* */

public class athletes_who_failed_to_finish {
    public static String solution(String[] participant, String[] completion) {

        String answer = " ";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        /*
         * 1. participant에서 이름을 키로 해서 개수만큼 value넣기
         * 2. completion으로 개수를 하나씩 차감
         * 3. 다 끝나고 개수가 남아있는 키가 완주를 못한 사람
        * */

        for(String p : participant){
            if(map.containsKey(p)){
                map.put(p, map.get(p)+1);
            } else {
                map.put(p, 1);
            }
        }

        for(String c : completion){
            map.put(c, map.get(c)-1);
            if(map.get(c) == 0){
                map.remove(c);
            }
        }

        for(String key : map.keySet()){
            answer = key;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String[] participant = sc.nextLine().split(" ");
        String[] completion = sc.nextLine().split(" ");
//        System.out.println(Arrays.toString(participant));
//        System.out.println(Arrays.toString(completion));

        String answer =  solution(participant, completion);
        System.out.println(answer);
    }
}

/*
중복된 이름이 들어가는 경우가 있음을 망각함
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

    public static String solution(String[] participant, String[] completion) {

        Set<String> participantSet = new HashSet<String>(Arrays.asList(participant));
        Set<String> completionSet = new HashSet<String>(Arrays.asList(completion));
//        System.out.println(participantSet);
//        System.out.println(completionSet);

        participantSet.removeAll(completionSet);
        System.out.println(participantSet);
        String answer = participantSet.iterator().next();
        return answer;
    }

* */