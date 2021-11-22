package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class PersonSetterDI {
//    @Autowired
//    @Qualifier("myDog")
    Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public PersonSetterDI(){
        System.out.println("PersonSetterDI is created");
    }

    @Autowired
    public PersonSetterDI(@Qualifier("myDog") Pet pet){
        System.out.println("PersonSetterDI is created with Pet");
        this.pet = pet;
    }

//    @Autowired
//    @Qualifier("myDog")
    public void setPet(Pet pet){
        System.out.println("Setter of PersonSetterDI");
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        System.out.println("Class PersonSetterDI set Name");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Class PersonSetterDI set Age");
        this.age = age;
    }

    public void sayPet(){
        System.out.println("--------------------------");
        System.out.println("Hello my Pet");
        pet.say();
    }
}
