package main.test;


import main.java.Summator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummatorSumTest {
    @Test
    public void sumTest(){
        Summator summator = new Summator();

        int res = summator.sum(1,3);

        assertEquals(4, res);
    }
}
