package spring_introduction;

public class PersonConstDI {
    Pet pet;

    public PersonConstDI(Pet pet){
        System.out.println("Person start create");
        this.pet = pet;
        System.out.println("Person finish create");
    }

    public void sayPet(){
        System.out.println("--------------------------");
        System.out.println("Hello my Pet");
        pet.say();
    }
}
