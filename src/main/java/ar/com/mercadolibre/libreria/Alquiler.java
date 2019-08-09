package ar.com.mercadolibre.libreria;

import java.time.LocalDateTime;

public class Alquiler {

    private Alquilable libro;
    private LocalDateTime fechaAlquiler;
    private LocalDateTime fechaDevolucion;
    private LocalDateTime fechaDevuelto = null;

    public Alquiler(Alquilable libro, LocalDateTime fechaAlquiler, LocalDateTime fechaDevolucion){
        this.libro = libro;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Alquilable getLibro(){
        return this.getLibro();
    }

    public void setFechaDevuelto(LocalDateTime fechaDevuelto){
        this.fechaDevuelto = fechaDevuelto;
    }
}
