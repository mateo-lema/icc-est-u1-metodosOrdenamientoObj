package models;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class Person {
    private String name;
    private int age;
    private int[] notas;

    public Person(String name, int age, int[] notas) {
        this.name = name;
        this.age = age;
        this.notas = notas;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int getPromedio() {
        // calcular Promedio
        // sumar todas las notas y dividir para tamño arreglo
        int sum = 0;
        for (int i : notas) {
            sum = sum + i;
        }
        int promedio = sum / notas.length;

        return promedio;
    }

    public int getNameValue() {
        int value = 0;
        for (int i = 0; i < name.length(); i++) {
            char letra = name.toLowerCase().charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                value += 5;
            }else{
                value+=age;
            }
        }
        return value; 
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age +  ", Promedio="
                + getPromedio() + ", Valor=" + getNameValue() + "]";
    }

   
}
