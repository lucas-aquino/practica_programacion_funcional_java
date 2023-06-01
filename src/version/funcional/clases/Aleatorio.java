package version.funcional.clases;

import version.funcional.interfaces.Proveedor;

import java.util.Random;

public class Aleatorio implements Proveedor<Integer> {

    Random randomNumber = new Random();

    @Override
    public Integer obtener() {
        return randomNumber.nextInt(1000);
    }
}
