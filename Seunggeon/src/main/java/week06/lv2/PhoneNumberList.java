package week06.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PhoneNumberList {
    private static boolean solution(String[] phone_book) {

        /* 설명. 1. 단순 반복 -> 효율성 실패 */
        //
//        for(int i = 0; i < phone_book.length - 1; i++) {
//            for(int j = i + 1; j < phone_book.length; j++) {
//                if(phone_book[i].length() >= phone_book[j].length()) {
//                    if(phone_book[i].startsWith(phone_book[j])) {
//                        return false;
//                    }
//                } else {
//                    if(phone_book[j].startsWith(phone_book[i])) {
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;

        /* 설명. 2. 가장 앞자리를 이용한 간단한 해싱 -> 효율성 실패(시간 초과) */
        // 해싱을 저장할 공간 만들기
//        List<List<String>> hashPhoneBook = new ArrayList<>();
//        for(int i = 0; i < 10; i++) {
//            hashPhoneBook.add(new ArrayList<>());
//        }
//
//        // phone_book 해싱
//        int temp;
//        for(String s : phone_book) {
//            temp = Integer.parseInt(s.charAt(0) + "");
//            hashPhoneBook.get(temp).add(s);
//        }
//
//        // 정렬 -> 사전식 정렬로 자릿수가 많으면 뒤로 감
//        for(int i = 0; i < 10; i++) {
//            hashPhoneBook.get(i).sort(String::compareTo);
//        }
//
//        // 비교
//        for(int i = 0; i < 10; i++) {
//            if(isPrefix2(hashPhoneBook.get(i))) {
//                return false;
//            }
//        }
//
//        return true;

        /* 설명. 3. 가장 앞자리로 해싱 + 자리수로 매핑  -> 효율성 실패(시간 초과)*/
        // 앞자리 해싱하기 위한 List + 자리수를 매핑하기 위한 Map
//        List<Map<Integer, List<String>>> hashList = new ArrayList<>();
//        // 앞자리는 0 ~ 9 까지 가능하므로 10까지 add
//        for (int i = 0 ; i < 10; i++) {
//            hashList.add(new HashMap<>());
//        }
//
//        // phone_book을 하나씩 체크해서 해싱
//
//        int c;
//        int length;
//        Map<Integer, List<String>> map;
//        List<String> sList;
//        for(String s : phone_book) {
//            c = Integer.parseInt(s.charAt(0) + "");
//            length = s.length();
//            map = hashList.get(c);
//            // 자리수에 맞춰서 List 불러오기, 해당 자리수로 값이 들어간적 없으면 새롭게 List 만들기
//            sList = map.getOrDefault(length, new ArrayList<>());
//            // 값 추가
//            sList.add(s);
//            map.put(length, sList);
//        }
//
//        // 접두사로 사용되는게 있으면 false 반환
//        if(isPrefix3(hashList)) return false;
//        // 접두사로 사용되는게 아예 없으면
//        else return true;

        return true;
    }

    private static boolean isPrefix2(List<String> PhoneBook) {
        String prefix;
        String str;
        for(int i = 0; i < PhoneBook.size() - 1; i++) {
            prefix = PhoneBook.get(i);
//            for(int j = i + 1; j <  PhoneBook.size(); j++) {
//                str = PhoneBook.get(j);
//                // 동일 번호는 없으므로 같은 자리수는 비교X
//                if(prefix.length() != str.length()) {
//                    if(str.startsWith(prefix)) {
//                        return true;
//                    }
//                }
//            }

            for(int j = PhoneBook.size() - 1; j > i; j--) {
                str = PhoneBook.get(j);
                // 동일 번호는 없으므로 같은 자리수는 비교X
                if(prefix.length() != str.length()) {
                    if(str.startsWith(prefix)) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    private static boolean isPrefix3(List<Map<Integer, List<String>>> hashList) {

        Map<Integer, List<String>> map;
        List<String> sList1;
        List<String> sList2;

        for (int i = 0; i < hashList.size(); i++) {
            // 앞자리 가 동일한 친구들 하나를 꺼냄
            map = hashList.get(i);

            // 자리수별로 비교하기
            for(int key : map.keySet()) {
                sList1 = map.get(key);

                for(int key2 : map.keySet()) {
                    if(key >= key2) continue;
                    sList2 = map.get(key2);

                    for(String prefix : sList1) {
                        for(String str : sList2) {
                            if(str.startsWith(prefix)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* 설명. 정렬을 이용한 풀이
     *  String 배열 정렬 시 사전 식 정렬로 인해
     *  접두어가 되는 문자와 접두어를 가지는 문자가 붙어서 나옴
     *  따라서 정렬 진행후 순차적으로 확인
    *  */
    private static boolean solution2(String[] phone_book) {
        Arrays.sort(phone_book);
        String prefix;
        String str;
        for(int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i].length() != phone_book[i + 1].length()) {
                if(phone_book[i].length() < phone_book[i + 1].length()) {
                    prefix = phone_book[i];
                    str = phone_book[i + 1];
                } else {
                    prefix = phone_book[i + 1];
                    str = phone_book[i];
                }

                if(str.startsWith(prefix)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* 설명. 전화번호 목륵을 Map의 key로 사용
     *  Map은 조회 성능이 평균 O(1), 최악 O(n) 으로 좋은 성능을 가지고 있음
     *  이를 이용해 Map.containsKey를 이용해 key 값이 존재하는지 확인
    *  */
    private static boolean solution3(String[] phone_book) {
        Map<String, Boolean> phoneBook = new HashMap<>();
        
        // 전화번호를 Map에 key로 저장
        for(String s : phone_book) {
            phoneBook.put(s, true);
        }

        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 1; j < phone_book[i].length(); j++) {
                // 현재 들고 있는 전화번호를 앞에서 부터 끝부분 바로 앞까지 하나씩 잘라보면서 key값으로 존재하는지 확인
                if(phoneBook.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] phoneBook;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("번호의 개수를 입력하시오: ");
            int n = Integer.parseInt(br.readLine());

            phoneBook = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.print("번호를 입력하시오: ");
                phoneBook[i] = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        boolean answer = solution3(phoneBook);
        System.out.print("정답: " + answer);
    }
}
