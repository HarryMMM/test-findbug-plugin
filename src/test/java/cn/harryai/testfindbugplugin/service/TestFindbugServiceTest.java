package cn.harryai.testfindbugplugin.service;

import org.junit.Test;

public class TestFindbugServiceTest {


    @Test
    public void print() {
        new TestFindbugService().print("baa");
    }

    @Test
    public void test1() {
        System.out.println(123);
    }
}
