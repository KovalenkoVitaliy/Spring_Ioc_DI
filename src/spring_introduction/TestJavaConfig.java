package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        PersonSetterDI person = context.getBean("personBean", PersonSetterDI.class);
        System.out.println(person.getName());
        person.sayPet();

        context.close();
    }
}
