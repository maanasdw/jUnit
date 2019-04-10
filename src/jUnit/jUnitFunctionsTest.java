package jUnit;

import static org.junit.Assert.*;

public class jUnitFunctionsTest {

    @org.junit.Test
    public void addNum() {
        jUnitFunctions junit=new jUnitFunctions();
        int result=junit.addNum(100,200);
        assertEquals(300,result);
    }

    @org.junit.Test
    public void addStr() {
        jUnitFunctions junit=new jUnitFunctions();
        String result=junit.addStr("h","k");
        assertEquals("hk",result);
    }
}