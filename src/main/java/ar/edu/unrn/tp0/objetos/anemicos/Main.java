package ar.edu.unrn.tp0.objetos.anemicos;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        TiempoAnemico tiempoAnemico = new TiempoAnemico();
        TiempoNoAnemico tiempoNoAnemico = new TiempoNoAnemico();

        //Imprimir TiempoAnemico
        System.out.println(tiempoAnemico.getTiempo().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(tiempoAnemico.getTiempo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        /*
           La clase TiempoAnemico es anemica debido a que no cuenta con comportamiento propio,
           su funcion es solo almacenar un tiempo determinado y unicamente cuenta con un metodo
           que sirven para obtener dicho tiempo.
           En este caso se deseaba imprimir en consola el tiempo en formato largo y formato corto, y debido a que
           TiempoAnemico no cuenta con dicho comportamiento, la logica fue implementada fuera de la clase.
        */


        //Imprimir TiempoNoAnemico
        tiempoNoAnemico.imprimirFormatoLargo();
        tiempoNoAnemico.imprimirFormatoCorto();
        /*
           La clase TiempoNoAnemico no es anemica debido a que cuenta con comportamiento propio, es decir,
           cuenta con metodos capaces de realizar la tarea que planteamos anteriormente.
           Gracias a esto la logica esta encapsulada en la clase y podemos delegarle la tarea al objeto
           simplemente utilizando la firma del metodo. Esto a su vez genera un desacoplamiento entre clases
        */

    }
}
