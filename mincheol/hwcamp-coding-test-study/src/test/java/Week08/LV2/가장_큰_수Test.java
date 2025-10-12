package Week08.LV2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class 가장_큰_수Test {

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{6, 10, 2}, "6210"),
                Arguments.of(new int[]{3, 30, 34, 5, 9}, "9534330")
        );
    }

    @ParameterizedTest(name = "테스트 {index} → numbers={0} → 예상 결과={1}")
    @MethodSource("provideTestCases")
    public void testSolution(int[] numbers, String expected) {
        String result = 가장_큰_수.solution(numbers);
        assertEquals(expected, result);
    }
}