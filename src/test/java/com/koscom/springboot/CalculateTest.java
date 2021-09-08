package com.koscom.springboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    @Test
    public void add() {
        long sum = 1 + 2;
        assertThat(sum).isEqualTo(3);
    }
}
