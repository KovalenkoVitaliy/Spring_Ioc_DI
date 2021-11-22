package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog1 = context.getBean("myPet", Dog.class);
        Dog dog2 = context.getBean("myPet", Dog.class);
        System.out.println("----------------------------");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println("Ssylka " + dog1.equals(dog2));
        dog2.say();
        dog1.say();

        context.close();
    }
}
