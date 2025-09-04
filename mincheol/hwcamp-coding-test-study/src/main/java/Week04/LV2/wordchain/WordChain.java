package Week04.LV2.wordchain;

import java.util.Arrays;

public class WordChain {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Solution.solution(3, new String[]{"tank", "kick", "know"
                                                                              , "wheel", "land", "dream"
                                                                              , "mother", "robot", "tank"})));
                                                                                //[3, 3]
        System.out.println(Arrays.toString(Solution.solution(5, new String[]{"hello", "observe", "effect", "take", "either"
                                                                              , "recognize", "encourage", "ensure", "establish", "hang"
                                                                              , "gather", "refer", "reference", "estimate", "executive"})));
                                                                                //[0, 0]
        System.out.println(Arrays.toString(Solution.solution(2, new String[]{"hello", "one"
                                                                              , "even", "never"
                                                                              , "now", "world"
                                                                              , "draw"})));
                                                                                //[1, 3]
    }
}
