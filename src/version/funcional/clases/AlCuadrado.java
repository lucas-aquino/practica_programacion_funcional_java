package version.funcional.clases;

import version.funcional.interfaces.Funcion;

public class AlCuadrado implements Funcion<Integer, Integer>{
    @Override
    public Integer transformar(Integer numero) {
        return numero * numero;
    }
}
