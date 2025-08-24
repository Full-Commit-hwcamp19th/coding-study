package Week03.LV1.dataanalysis;

import java.util.Arrays;

public class DataAnalysis {

    public static void main(String[] args) {

        System.out.println(
                Arrays.deepToString(Solution.solution(
                                new int[][]
                                        {
                                        {1, 20300104, 100, 80},
                                        {2, 20300804, 847, 37},
                                        {3, 20300401, 10, 8}
                                        },
                                "date", 20300501, "remain")));
    }
}
