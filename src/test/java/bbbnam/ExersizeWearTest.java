package bbbnam;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ExersizeWearTest {

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    public void 체육복문제_테스트(int n, int[] lost, int[] reserse, int result) {
        ExersizeWear exersizeWear = new ExersizeWear();

        assertThat(exersizeWear.solution(n, lost, reserse)).isEqualTo(result);
    }

    private static Stream<Arguments> provideTestArguments(){
        return Stream.of(
                Arguments.of(5, new int[]{2, 4}, new int[]{1, 3, 5}, 5),
                Arguments.of(5, new int[]{2, 4}, new int[]{3}, 4),
                Arguments.of(3, new int[]{3}, new int[]{1}, 2)
        );
    }
}
