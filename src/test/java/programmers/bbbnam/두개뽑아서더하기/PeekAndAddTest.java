package programmers.bbbnam.두개뽑아서더하기;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PeekAndAddTest {

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    public void solutionTest(int [] numbers, int [] result){
        PeekAndAdd pa = new PeekAndAdd();
        assertArrayEquals(pa.solution(numbers), result);
    }

    private static Stream<Arguments> provideTestArguments(){
        return Stream.of(
                Arguments.of(new int [] {2,1,3,4,1}, new int [] {2,3,4,5,6,7}),
                Arguments.of(new int [] {5,0,2,7}, new int [] {2,5,7,9,12})
        );
    }
}