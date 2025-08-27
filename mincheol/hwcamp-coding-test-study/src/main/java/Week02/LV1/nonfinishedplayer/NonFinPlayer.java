package Week02.LV1.nonfinishedplayer;

public class NonFinPlayer {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[]{"leo", "kiki", "eden"},
                                             new String[]{"eden", "kiki"}));
        System.out.println(Solution.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                                             new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(Solution.solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                                             new String[]{"stanko", "ana", "mislav"}));

    }
}
