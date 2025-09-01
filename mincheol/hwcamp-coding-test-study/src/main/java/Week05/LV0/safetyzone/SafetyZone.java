package Week05.LV0.safetyzone;

public class SafetyZone {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0}}));

        System.out.println(Solution.solution(new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 1, 1, 0},
                        {0, 0, 0, 0, 0}}));
//
        System.out.println(Solution.solution(new int[][]{
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1}}));
    }
}
