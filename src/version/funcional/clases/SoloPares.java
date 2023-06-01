package version.funcional.clases;

import version.funcional.interfaces.Predicado;

public class SoloPares implements Predicado<Integer> {
    @Override
    public Boolean test(Integer valor) {
        return valor % 2 == 0;
    }
}
