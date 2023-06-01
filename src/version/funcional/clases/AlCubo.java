package version.funcional.clases;

import version.funcional.interfaces.Funcion;

public class AlCubo implements Funcion<Integer, Integer> {
    @Override
    public Integer transformar(Integer numero) {
        return numero * numero * numero;
    }
}
