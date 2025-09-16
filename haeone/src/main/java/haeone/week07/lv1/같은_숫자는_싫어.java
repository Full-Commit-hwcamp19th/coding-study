package haeone.week07.lv1;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {

    public class Solution {
        public int[] solution(int []arr) {
            List<Integer> result = new ArrayList<>();
            result.add(arr[0]);
            for(int i = 1; i <arr.length ; i++){
                if(arr[i-1]==arr[i]){
                    continue;
                }else if(arr[i-1] != arr[i]){
                    result.add(arr[i]);
                }
            }

            int[] resultArray = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                resultArray[i] = result.get(i);
            }
            return resultArray;
        }
    }
    /*
    // 효율성 테스트 실패 -> check 때문
    public class Solution {
        public int[] solution(int []arr) {
            List<Integer> result = new ArrayList<>();
            int check = -1;
            result.add(arr[0]);
            for(int i = 1; i <arr.length ; i++){
                if(arr[i-1]==arr[i]){
                    check = arr[i];
                }else if(check != arr[i]){
                    result.add(arr[i]);
                }
            }

            int[] resultArray = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                resultArray[i] = result.get(i);
            }
            return resultArray;
        }
    }
    */
}
