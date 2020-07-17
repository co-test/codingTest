package bbbnam;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NewStackTest {

    @Test
    void newStackTest() {
        NewStack<Integer> newStack = new NewStack<Integer>();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        assertThat(newStack.pop()).isEqualTo(5);
        assertThat(newStack.pop()).isEqualTo(4);
        assertThat(newStack.pop()).isEqualTo(3);
        assertThat(newStack.peek()).isEqualTo(2);
        assertThat(newStack.pop()).isEqualTo(2);
        assertThat(newStack.pop()).isEqualTo(1);
        assertThat(newStack.isEmpty()).isTrue();
    }
}