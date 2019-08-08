package com.example.demo.utils;

import lombok.extern.slf4j.Slf4j;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

@Slf4j
public class Util {
    public static void fireRule(Object object){
        KieServices kieServices=KieServices.Factory.get();
        KieContainer kieContainer=kieServices.getKieClasspathContainer();
        KieSession kieSession=kieContainer.newKieSession("UserRule");

        kieSession.insert(object);
        int count=kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("执行了"+count+"条规则");
    }
}
