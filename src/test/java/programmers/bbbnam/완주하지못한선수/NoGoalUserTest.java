package programmers.bbbnam.완주하지못한선수;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NoGoalUserTest {

    @ParameterizedTest
    @MethodSource("provideNames")
    void solution(String [] participant, String [] completion, String result) {
        NoGoalUser noGoal = new NoGoalUser();
        assertThat(noGoal.solution(participant, completion)).isEqualTo(result);
    }

    private static Stream<Arguments> provideNames() {
        return Stream.of(
            Arguments.of(new String [] {"leo", "kiki", "eden"},
                        new String [] {"eden", "kiki"}, "leo"),
            Arguments.of(new String [] {"marina", "josipa", "nikola", "vinko", "filipa"},
                        new String [] {"josipa", "filipa", "marina", "nikola"}, "vinko"),
            Arguments.of(new String [] {"mislav", "stanko", "mislav", "ana"},
                        new String [] {"stanko", "ana", "mislav"}, "mislav")
        );
    }
}