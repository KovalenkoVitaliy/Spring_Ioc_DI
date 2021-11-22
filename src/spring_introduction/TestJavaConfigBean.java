package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfigBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigJava.class);
        Pet cat1 = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);
        System.out.println(cat1 == cat2);

        PersonSetterDI person = context.getBean("personBean", PersonSetterDI.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.sayPet();



        context.close();
    }
}
