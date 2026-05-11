package controllers;

import models.Person;

public class PersonController {
    // Metodo que ordena un arreglo de persona
    // por su EDAD(age),con metodo insercion
    public void sortPersonByAge(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getAge() > aux.getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    public void sortPersonByname(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    // metodo ordenar personas segun el
    // promedio de sus notas con seleccion
    public void sortPersonByAvrNota(Person[] personas) {

        for (int i = 0; i < personas.length; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < personas.length; j++) {
                // comparacion
                if (personas[j].getPromedio() < personas[indiceMenor].getPromedio())
                    indiceMenor = j;
            }
            // pregunto si el indice menor!= de i
            // entonces cambio posiciones
            if (i != indiceMenor) {
                Person aux = personas[i];
                personas[i] = personas[indiceMenor];
                personas[indiceMenor] = aux;
            }
        }

    }

    // ordenar el arreglo de personas por un valor de su nombre
    // el valor del nombre sera la cantidad de letras
    // donde las vocales valen 5
    // consontantes valen el valor de la edad
    // ejemplo:Juan 20 años ana 80 años
    // 20+5+5+20=50 5+80+5=90
    public void sortPersonByNameValue(Person[] personas) {

        for (int i = 0; i < personas.length; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[j].getNameValue() < personas[indiceMenor].getNameValue())
                    indiceMenor = j;

            }
            if (i != indiceMenor) {
                Person aux = personas[i];
                personas[i] = personas[indiceMenor];
                personas[indiceMenor] = aux;
            }

        }

    }
}
