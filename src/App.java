import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas={
            new Person("Juan", 25,new int[]{10,15,20}),
            new Person("Ana", 19,new int[]{15,15,20}),
            new Person("Carlos", 30,new int[]{10,10,10}),
            new Person("Maria", 22,new int[]{20,15,20}),
            new Person("Diego", 15,new int[]{20,10,20}),
        };
        //Imprimir
        //Ordenar
        //Imprimir    
        for(Person person:personas){
            System.out.println(person);
        }
        PersonController pController= new PersonController();
        pController.sortPersonByAge(personas);
        System.out.println("=====OrdenadoEdad=====");
        for(Person person:personas){
            System.out.println(person);
        }
        System.out.println("=====OrdenadoNombre=====");
        pController.sortPersonByname(personas);
        for(Person person:personas){
            System.out.println(person);
        }
        System.out.println("=====OrdenadoPromedio=====");
        pController.sortPersonByAvrNota(personas);
        for(Person person:personas){
            System.out.println(person);
        }

        System.out.println("=====OrdenadoValorNombre=====");
        pController.sortPersonByNameValue(personas);
        for(Person person:personas){
            System.out.println(person);
        }

    }
}
