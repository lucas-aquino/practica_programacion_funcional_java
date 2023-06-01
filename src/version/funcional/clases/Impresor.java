package version.funcional.clases;

import version.funcional.interfaces.Consumidor;

public class Impresor implements Consumidor<Integer> {
    @Override
    public void aceptar(Integer number) {
        System.out.println(number);
    }
}
