package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Cat cat = context.getBean("myCat", Cat.class);
//        cat.say();

        PersonSetterDI person = context.getBean("personBean", PersonSetterDI.class);
        person.sayPet();
        System.out.println(person.getName());

        context.close();
    }
}
