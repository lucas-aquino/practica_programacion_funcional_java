package version.funcional.clases;

import version.funcional.interfaces.Proveedor;

import java.util.Random;

public class Naturales implements Proveedor<Integer> {

    private static int next = 0;

    @Override
    public Integer obtener() {
        return next++;
    }
}
