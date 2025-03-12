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

        //Imprimir TiempoNoAnemico
        tiempoNoAnemico.imprimirFormatoLargo();
        tiempoNoAnemico.imprimirFormatoCorto();


    }
}
