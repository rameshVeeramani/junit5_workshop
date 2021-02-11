package com.ramesh;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LifeCycleTest {
    private int x;
    public LifeCycleTest(){
        System.out.println("constructor been called");
    }
    @BeforeAll
    static  void initialize(){
        System.out.println("before any tests are run");
    }
    @BeforeEach
    public void setup(){
        System.out.println("Initializing..");
        x = 42;
    }
    @Test
    public void firstTest() {
        System.out.println("x = " +x );
        assertTrue(x > 0);
    }
    @Test
    public void secondTest(){
        System.out.println("checking for negative numbers");
        x = -1;
        assertFalse(x > 0);
    }


}
