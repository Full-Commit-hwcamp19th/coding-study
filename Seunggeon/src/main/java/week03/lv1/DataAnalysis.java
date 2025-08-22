package week03.lv1;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 18.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/250121
* */

import java.io.*;
import java.util.*;

import static java.lang.System.exit;

class Data  {
    private int code;
    private int date;
    private int maximum;
    private int remain;

    public Data(int code, int date, int maximum, int remain) {
        this.code = code;
        this.date = date;
        this.maximum = maximum;
        this.remain = remain;
    }

    public int getCode() {
        return code;
    }

    public int getDate() {
        return date;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getRemain() {
        return remain;
    }
}
abstract class SortData implements Comparator<Data> {
    @Override
    abstract public int compare(Data o1, Data o2);
}

class SortCode extends SortData {
    @Override
    public int compare(Data o1, Data o2) {
        return o1.getCode() - o2.getCode();
    }
}
class SortDate extends SortData {
    @Override
    public int compare(Data o1, Data o2) {
        return o1.getDate() - o2.getDate();
    }
}
class SortMaximum extends SortData {
    @Override
    public int compare(Data o1, Data o2) {
        return o1.getMaximum() - o2.getMaximum();
    }
}
class SortRemain extends SortData {
    @Override
    public int compare(Data o1, Data o2) {
        return o1.getRemain() - o2.getRemain();
    }
}

public class DataAnalysis {
    private static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Data> list = new ArrayList<>();
        HashMap<String, Integer> dataMap = new HashMap<String, Integer>();
        dataMap.put("code", 0);
        dataMap.put("date", 1);
        dataMap.put("maximum", 2);
        dataMap.put("remain", 3);

        int extIndex = dataMap.get(ext);
        int sortByIndex = dataMap.get(sort_by);

        for (int i = 0; i < data.length; i++) {
            if(data[i][extIndex] < val_ext){
                list.add(new Data(data[i][0], data[i][1], data[i][2], data[i][3]));
            }
        }

        SortData sortData = null;
        switch (sortByIndex) {
            case 0: sortData = new SortCode(); break;
            case 1: sortData = new SortDate(); break;
            case 2: sortData = new SortMaximum(); break;
            case 3: sortData = new SortRemain(); break;
        }

        list.sort(sortData);
        Data[] answer2 =  new Data[list.size()];
        answer2 = list.toArray(answer2);
        int[][] answer = new int[list.size()][4];
        int count = 0;
        for(Data d : answer2){
            answer[count][0] = d.getCode();
            answer[count][1] = d.getDate();
            answer[count][2] = d.getMaximum();
            answer[count][3] = d.getRemain();
            count++;
        }

        return answer;
    }


    public static void main(String[] args) {
        String str;
        int[][] data;
        String ext, sort_by;
        int val_ext;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n =  Integer.parseInt(br.readLine());   // 데이터 개수
            data = new int[n][4];
            for(int i = 0; i < n; i++) {
                str = br.readLine();
                StringTokenizer st = new StringTokenizer(str);
                int count = st.countTokens();
                for (int j = 0; j < count; j++) {
                    data[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            ext = st.nextToken();
            val_ext = Integer.parseInt(st.nextToken());
            sort_by = st.nextToken();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int[][] answer = solution(data, ext, val_ext, sort_by);

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write(Arrays.deepToString(answer));
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
