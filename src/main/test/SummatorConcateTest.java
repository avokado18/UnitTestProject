package main.test;


import main.java.Summator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummatorConcateTest {
    @Test
    public void testConcate(){
        Summator summator = new Summator();

        String result = summator.concate("one", "two");

        assertEquals("onetwo", result);
    }
}
