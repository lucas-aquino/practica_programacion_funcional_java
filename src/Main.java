import version.funcional.FunctionalListManipulation;
import version.funcional.clases.*;
import version.funcional.interfaces.*;
import version.inperativa.ListManipulationInperativa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        List<Integer> numbers = listGenerator();

        ListManipulationInperativa inperativa = new ListManipulationInperativa(numbers);


        System.out.println("Programacion Iperativa \n");
        System.out.println("Array Original = " + numbers);

        System.out.println("Array Solo Pares = " + inperativa.filtrarPares());

        System.out.println("Array Cuadrados = " + inperativa.elevarCuadrado());

        System.out.println("Suma del Array = " + inperativa.sumarLista());

        System.out.println("\nProgramacion Funcional \n");

        /*List<Integer> numeros = FunctionalListManipulation.proveer(10, new Proveedor<Integer>() {
            Random random = new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(10);
            }
        });*/

        List<Integer> numeros = FunctionalListManipulation.proveer(10, () -> {
            Random random = new Random();
            return random.nextInt(10);
        });

        System.out.println("Array de numeros aleatorios = " + numeros);

        System.out.println("Array Solo Pares = " + FunctionalListManipulation.filtrar(numeros, valor -> valor % 2 == 0));

        System.out.println("Array Solo Impares = " + FunctionalListManipulation.filtrar(numeros, valor -> valor % 2 != 0));

        System.out.println("Array Cuadrados = " + FunctionalListManipulation.transformar(numeros, num -> num * num));

        System.out.println("Array Cubos = " + FunctionalListManipulation.transformar(numeros, num -> num * num * num));

        FunctionalListManipulation.consumir(numeros, value -> System.out.println("Valor [" + value + "]" ));

        System.out.println("Suma del Array = " + FunctionalListManipulation.reducir(numeros, 0, Integer::sum));

        System.out.println("Multiplicacion del Array = " + FunctionalListManipulation.reducir(numeros, 0, (valueA, valueB) -> valueA * valueB));

    }

    public List<Integer> listGenerator(){
        return List.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
    }
}