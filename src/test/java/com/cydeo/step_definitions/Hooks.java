package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    //@Before // that works before each scenario
    public void setup(){
        System.out.println("before scenario is running");
    }


    @After // that runs after each scenario
    public void tearDown(){
        System.out.println("after scenario is running");
        Driver.closeDriver();
    }


    /**
     * You can type more than one method having before, after,beforestep, afterstep annotations by assigning different
     * values and order as  in following example
     * //    @Before (value = "@db", order = 0)
     */


    //@BeforeStep
    public void setupStep(){
        System.out.println("before step is running");
    }

    //@AfterStep
    public void afterStep(){
        System.out.println("after step is running");
    }


}
