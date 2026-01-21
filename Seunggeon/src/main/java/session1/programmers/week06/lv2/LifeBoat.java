package programmers.week06.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class LifeBoat {
    private static int solution(int[] people, int limit) {

        /* 설명. 1. 효율성 시간 초과 */
        //
//        int count = 0;
//        List<Integer> list = new ArrayList<>();
//        for (int p : people) {
//            list.add(p);
//        }
//
//        list.sort((a,b)-> b - a);
//
//        int[] twoPeople = new int[2];
//        while(list.isEmpty() == false) {
//            twoPeople[0] = list.get(0);
//            list.remove(0);
//            for(int i = 0; i < list.size(); i++) {
//                twoPeople[1] = list.get(i);
//                int sum = twoPeople[0] + twoPeople[1];
//                if(sum <= limit) {
//                    list.remove(i);
//                    break;
//                }
//            }
//            count++;
//        }
//
//        return count;

        /* 설명.
         *  1. 내림차순 정렬
         *  2. 남은 사람 중에 가장 무거운 사람 태우기
         *  3. limit 범위 안에서 태울 수 있는 가장 무거운 사람 태우기
         *  4. 2, 3 반복
         *  효율성 시간 초과
         * */
        //
//        List<Integer> peopleList = new ArrayList<>();
//        for (int i = 0; i < people.length; i++) {
//            peopleList.add(people[i]);
//        }
//
//        // 내림차순 정렬
//        peopleList.sort((a, b) -> b - a);
//
//        int count = 0;      // 태워 나른 횟수
//        int index = 0;      // 태울 사람 번호
//        int currW = 0;  // 현재 태운 사람
//        int peopleCount = 0;
//        // 모든 사람을 태울 때까지 반복
//
//        while(!peopleList.isEmpty()) {
//            currW = peopleList.get(0);  // 가장 앞 -> 가장 무거운 사람 먼저 태우기
//            peopleList.remove(0);
//            for(int i = 0; i < peopleList.size(); i++) {
//                if (currW + peopleList.get(i) <= limit) {
//                    peopleList.remove(i);
//                    break;
//                }
//            }
//            currW = 0;
//            count++;
//        }
//
//        return count;


        // 인터넷 찾아보고 함 -> 이전까지 한 방법들은 탐색부분이 있어 시간이 올라가는 문제가 있어 실패
        /* 설명. 가장 무거운 사람 + 가장 가벼운 사람 */
        int left = 0;                   // index
        int right = people.length - 1;  // index
        int count = 0;
        Arrays.sort(people);    // 오름차순 정렬

        int currW = 0;
        while(left <= right) {
            currW = people[left] + people[right];
            if(currW > limit) {
                right--;
            } else {
                left++;
                right--;
            }
            count++;
            currW = 0;
        }
        return count;
    }

//    private static int greedy(List<Integer> people, int currW, int limit) {
//        int temp;
//        int index = -1;
//        for (int i = 0; i < people.size(); i++) {
//            temp = currW + people.get(i);
//            if (temp <= limit) {
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }


    public static void main(String[] args) {
        int[] people;
        int limit;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("사람들의 몸무게를 입력하시오: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            people = new int[st.countTokens()];
            int i = 0;
            while (st.hasMoreTokens()) {
                people[i] = Integer.parseInt(st.nextToken());
                i++;
            }

            System.out.print("보트의 제한을 입력하시오: ");
            limit = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(people, limit);
        System.out.println("정답: " + answer);

    }
}
