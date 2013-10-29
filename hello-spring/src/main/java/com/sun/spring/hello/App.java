package com.sun.spring.hello;

/**
 * Hello world!
 *
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App {
  public static void main(String[] args) throws Exception {
    BeanFactory factory = 
        new XmlBeanFactory(new ClassPathResource("hello.xml"));

    GreetingService greetingService = 
        (GreetingService) factory.getBean("greetingService");

    greetingService.sayGreeting();
  }
}