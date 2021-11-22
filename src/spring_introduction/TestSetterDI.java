package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PersonSetterDI personSetterDI = context.getBean("personSetterDI", PersonSetterDI.class);

        personSetterDI.sayPet();

        System.out.println(personSetterDI.getAge());
        System.out.println(personSetterDI.getName());

        context.close();
    }
}
