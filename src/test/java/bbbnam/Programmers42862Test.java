package bbbnam;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class Programmers42862Test {

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    public void 체육복문제_테스트(int n, int[] lost, int[] reserse) {
        Programmers42862 programmers42862 = new Programmers42862();
        /*int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};*/
        assertThat(programmers42862.Programmers42862(n, lost, reserse));
    }

    private static Stream<Arguments> provideTestArguments(){
        return Stream.of(
            Arguments.of(5, new int[]{2, 4}, new int[]{1, 3, 5}),
            Arguments.of(5, new int[]{2, 4}, new int[]{3}),
            Arguments.of(3, new int[]{3}, new int[]{1})
        );
    }
}
