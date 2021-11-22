package spring_introduction;

import org.springframework.stereotype.Component;

@Component("myCat")
public class Cat implements Pet {

    public Cat(){
        System.out.println("cat is created");
    }

    @Override
    public void say() {
        System.out.println("Mow-mow");
    }
}
