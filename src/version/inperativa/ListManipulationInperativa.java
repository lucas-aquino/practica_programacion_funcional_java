package version.inperativa;

import java.util.ArrayList;
import java.util.List;

public class ListManipulationInperativa {

    private List<Integer> arrayList;

    public ListManipulationInperativa(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public List<Integer> filtrarPares(){
        List<Integer> resultado = new ArrayList<Integer>();

        for (Integer number : arrayList) {
            if (number % 2 == 0) {
                resultado.add(number);
            }
        }

        return resultado;
    }

    public List<Integer> elevarCuadrado(){
        List<Integer> resultado = new ArrayList<Integer>();

        for (Integer number : arrayList) {
            resultado.add(number * number);
        }

        return resultado;
    }

    public Integer sumarLista(){
        Integer resultado = 0;

        for (Integer number : arrayList) {
            resultado += number;
        }

        return resultado;
    }
}
