package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet dog = context.getBean("myPet", Pet.class);

        Pet kissa = context.getBean("kissa", Pet.class);

        dog.say();
        kissa.say();

        context.close();
    }
}
