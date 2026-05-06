import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas={
            new Person("Juan", 25),
            new Person("Ana", 19),
            new Person("Carlos", 30),
            new Person("Maria", 22),
            new Person("Diego", 15),
        };
        //Imprimir
        //Ordenar
        //Imprimir    
        for(Person person:personas){
            System.out.println(person);
        }
        PersonController pController= new PersonController();
        pController.sortPersonByAge(personas);
        pController.sortPersonByname(personas);
        System.out.println("=====Ordenado=====");
        for(Person person:personas){
            System.out.println(person);
        }
    }
}
