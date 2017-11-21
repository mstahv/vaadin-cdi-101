package org.vaadin.vaadin.cdi.example;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
    public String sayHi(String name) {
        return "Hi " + name + "!";
    }
}
