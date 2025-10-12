package Week08.LV1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class 체육복Test {

    public static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(5, new int[]{2, 4}, new int[]{1, 3, 5}, 5),
                Arguments.of(5, new int[]{2, 4}, new int[]{3}, 4),
                Arguments.of(3, new int[]{3}, new int[]{1}, 2)
        );
    }

    @ParameterizedTest(name = "테스트 {index} → n = {0}, lost = {1}, reserve = {2} → 예상 결과 = {3}")
    @MethodSource("provideTestCases")
    public void testSolution(int n, int[] lost, int[] reserve, int expected) {
        int result = 체육복.solution(n, lost, reserve);
        System.out.println("결과:" + result);
        assertEquals(expected, result);
    }
}