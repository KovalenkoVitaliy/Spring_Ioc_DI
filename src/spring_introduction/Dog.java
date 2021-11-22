package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myDog")
@Scope("prototype")
public class Dog implements Pet{

    public Dog(){
        System.out.println("Dog is created   " + this);
    }

    @Override
    public void say() {
        System.out.println("Gow-Gow");
    }

    @PostConstruct
    public void init(){
        System.out.println("This is init method of Dog");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("This is destroy method of Dog");
    }
}
