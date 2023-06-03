package com.in28minutes.springboot.tutorial.basics.springboottutorialbasics.aop;

import com.in28minutes.springboot.tutorial.basics.annotation.Business3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BusinessAnnotationAopSpringBootTest {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Business3 business3;


    @Test
    public void invokeAOPStuff() {
        LOGGER.info(business3.calculateSomething());


    }
}