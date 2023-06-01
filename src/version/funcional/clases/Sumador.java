package version.funcional.clases;

import version.funcional.interfaces.FuncionBinaria;

public class Sumador implements FuncionBinaria<Integer, Integer, Integer> {
    @Override
    public Integer aplicar(Integer numeroa, Integer numerob) {
        return numeroa + numerob;
    }
}
