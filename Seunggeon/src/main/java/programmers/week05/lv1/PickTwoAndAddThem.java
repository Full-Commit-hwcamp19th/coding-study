package programmers.week05.lv1;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 27.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/68644
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class PickTwoAndAddThem {
    public static int[] solution(int[] numbers) {
        // numbers의 조합을 통해 만들 수 있는 수를 오름차순으로 정렬

        // 만들어진 조합을 Set에 저장해서 중복을 제거
        // 이 때 TreeSet을 이용해 정렬이 되도록 만듬
        TreeSet<Integer> set = new TreeSet<Integer>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] addNumbers = new int[set.size()];
        Iterator<Integer> iter = set.iterator();
        int count = 0;
        
        // TreeSet의 내용을 순서대로 꺼내서 배열에 저장(이미 TreeSet을 이용해 정렬이 되도록 했기 때문에 따로 정렬X)
        while (iter.hasNext()) {
            addNumbers[count] = iter.next();
            count++;
        }

        return addNumbers;
    }

    public static void main(String[] args) {
        int[] numbers;
        
        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("숫자들을 입력하세요(공백을 통해 구분): ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            numbers = new int[st.countTokens()];
            for(int i =0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        int[] answer = solution(numbers);
        System.out.println("정답: " + Arrays.toString(answer));
        
    }
}

