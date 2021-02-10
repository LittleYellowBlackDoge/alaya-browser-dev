package com.alaya.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@PropertySource("classpath:spring_properties/applicationContext.xml")
public class QueryBlockTest {

    @Test
    public void queryTest01() {

    }
}
