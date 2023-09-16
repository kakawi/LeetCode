package com.hlebon.testgorilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestGorillaTest {

    private final TestGorilla solution = new TestGorilla();

    @Test
    void decryption0() {
        // given
        String input = "t1e1s2t, Hell1o, 1th1e, fir2st1";
        // expected
        String expected = "Hello the first test";
        // when
        String result = solution.decryption(input);
        // then
        assertEquals(expected, result);
    }

    @Test
    void decryption1() {
        // given
        String input = "1yo1ur; ro2ckst2ar;i2nn1er.us6, Come unl1eash 2wi2th1";
        // expected
        String expected = "Come unleash your inner rockstar with us";
        // when
        String result = solution.decryption(input);
        // then
        assertEquals(expected, result);
    }

    @Test
    void decryption2() {
        // given
        String input = "a3t f1or p2a2r1t1y y1o1u p4o1ol o1u3r cinema Waiting";
        // expected
        String expected = "Waiting for you at our pool party";
        // when
        String result = solution.decryption(input);
        // then
        assertEquals(expected, result);
    }

    @Test
    void decryption3() {
        // given
        String input = "In2vita1tion 1Night1 Cine1ma Po1ol Mo1vie";
        // expected
        String expected = "Movie Night Invitation";
        // when
        String result = solution.decryption(input);
        // then
        assertEquals(expected, result);
    }
}