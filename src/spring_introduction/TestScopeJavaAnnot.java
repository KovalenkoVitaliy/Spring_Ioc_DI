package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScopeJavaAnnot {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog dog1 = context.getBean("myDog", Dog.class);
        Dog dog2 = context.getBean("myDog", Dog.class);
        System.out.println("----------------------------");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println("Ssylka " + dog1.equals(dog2));
        dog2.say();
        dog1.say();

        context.close();
    }
}
