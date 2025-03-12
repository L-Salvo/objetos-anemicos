package ar.edu.unrn.tp0.objetos.anemicos;

import java.time.LocalDateTime;

public class TiempoAnemico {

    private LocalDateTime tiempo;

    public TiempoAnemico() {
        this.tiempo = LocalDateTime.now();
    }

    public LocalDateTime getTiempo() {
        return tiempo;
    }
}
