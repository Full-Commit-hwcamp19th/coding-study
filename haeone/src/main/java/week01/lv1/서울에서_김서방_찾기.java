package haeone.week01.lv1;

public class 서울에서_김서방_찾기 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.08.07
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12919
     * */

        public String solution(String[] seoul) {
            String answer = "";


            for(int i =0; i < seoul.length ; i++)
            {
                if(seoul[i].equals("Kim"))
                {
                    answer = "김서방은 " + i +"에 있다";
                    break;
                }
            }


            return answer;
        }
}
