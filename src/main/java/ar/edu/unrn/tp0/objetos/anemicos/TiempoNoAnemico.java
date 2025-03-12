package ar.edu.unrn.tp0.objetos.anemicos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TiempoNoAnemico {

    private LocalDateTime tiempo;

    public TiempoNoAnemico() {
        this.tiempo = LocalDateTime.now();
    }

    public void imprimirFormatoLargo() {
        System.out.println(this.tiempo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    }

    public void imprimirFormatoCorto() {
        System.out.println(this.tiempo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
