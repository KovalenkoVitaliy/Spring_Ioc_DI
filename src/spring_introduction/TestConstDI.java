package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonConstDI personConstDI = context.getBean("personConstDI", PersonConstDI.class);
        personConstDI.sayPet();

        context.close();

    }
}
