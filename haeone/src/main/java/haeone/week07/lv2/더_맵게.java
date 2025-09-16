package haeone.week07.lv2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 더_맵게 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        System.out.println(pq);
        pq.add(9);
        pq.add(2);
        System.out.println(pq);

        System.out.println(pq.peek()); // 1 (최솟값)
        System.out.println(pq.poll()); // 1 꺼내짐
        System.out.println(pq.peek()); // 2 (그 다음 최솟값)
    }

    class Solution {
        public int solution(int[] scoville, int K) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i = 0 ; i < scoville.length ; i++){
                pq.add(scoville[i]);
            }
            int mixCount = 0;
            while(pq.size()>1 && pq.peek()<K){
                int first = pq.poll();
                int second = pq.poll();
                int mix = first + second*2;
                pq.add(mix);
                mixCount++;
            }
            // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
            if (pq.peek() < K)
                return -1;

            return mixCount;
        }
    }
    /*
    class Solution {
        public int solution(int[] scoville, int K) {
            Arrays.sort(scoville);
            int mixCount = 0;
            for(int i=0, mix= 0 ; i< scoville.length; i++){
                if(scoville[i] < K){
                    if(scoville[i]>scoville[i+1]){
                        int temp = scoville[i+1];
                        scoville[i] = scoville[i];
                        scoville[i] = temp;
                    }
                    mix =scoville[i] + scoville[i+1] * 2;
                    scoville[i]=0;
                    scoville[i+1]=mix;
                    mixCount++;

                }
                else if(scoville[i] >= K){
                    break;
                }
            }
            return mixCount;
        }
    }
    */
}
