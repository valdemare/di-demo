package com.valdemare.didemo.controllers;

import com.valdemare.didemo.services.GreetingService;
import com.valdemare.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructedControllerInjectionTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp()throws Exception{
        this.constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testController(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,constructorInjectedController.sayHello());
    }
}
