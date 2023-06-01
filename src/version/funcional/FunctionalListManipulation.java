package version.funcional;

import version.funcional.clases.Sumador;
import version.funcional.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class FunctionalListManipulation {


    public static <T> List<T> filtrar(List<T> arrayList, Predicado<T> predicado){
        List<T> returnValue = new ArrayList<T>();

        for (T value : arrayList) {
            if(predicado.test(value)){
                returnValue.add(value);
            }
        }

        return returnValue;
    }

    public static <T> List<T> proveer(Integer size, Proveedor<T> proveedor){
        List<T> returnValue = new ArrayList<T>();

        for (int i = 0; i < size; i++) {
            returnValue.add(proveedor.obtener());
        }

        return returnValue;
    }

    public static <T, R> List<R> transformar(List<T> arrayList, Funcion<T, R> transformador){
        List<R> returnValue = new ArrayList<>();

        for (T value : arrayList) {
            returnValue.add(transformador.transformar(value));
        }

        return returnValue;
    }

    public static <T> List<T> actuar(List<T> arrayList, Consumidor<T> consumidor) {
        for (T value : arrayList) {
            consumidor.aceptar(value);
        }
        return arrayList;
    }

    public static <T> void consumir(List<T> arrayList, Consumidor<T> consumidor) {
        for (T value : arrayList) {
            consumidor.aceptar(value);
        }
    }

    public static <T> T reducir(List<T> arrayList, T identidad, OperadorBinario<T> funcionBinaria) {
        T returnValue = identidad;
        for (T value : arrayList) {
            returnValue = funcionBinaria.aplicar(returnValue, value);
        }
        return returnValue;
    }

}
