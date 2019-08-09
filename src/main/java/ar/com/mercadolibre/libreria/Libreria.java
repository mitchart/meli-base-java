package ar.com.mercadolibre.libreria;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Libreria {
    //Singleton
    private static Libreria unico;

    public List<Alquiler> alquileres = new ArrayList<Alquiler>();

    public static Libreria getInstance(){
        if(unico == null){
            unico = new Libreria();
        }
        return unico;
    }

    public Alquiler buscarAlquiler(Alquilable libro){
        Predicate<Alquiler> criterio = alquiler -> alquiler.getLibro().getTitulo().equals(libro.getTitulo());
        return this.alquileres.stream().filter(alquiler -> (criterio.test(alquiler))).findFirst().get();
    }

    public void alquilar(Alquilable libro){
        LocalDateTime fechaDevolucion = LocalDateTime.now().plusDays(3);
        Alquiler alquiler = new Alquiler (libro, LocalDateTime.now(), fechaDevolucion);
        alquileres.add(alquiler);
    }

    public void devolver(Alquilable libro){
        Alquiler alquiler = buscarAlquiler(libro);
        alquiler.setFechaDevuelto(LocalDateTime.now());
        pasarLibroAdevuelto(alquiler.getLibro());
    }

    private void pasarLibroAdevuelto(Alquilable libro){
        libro.devolver();
    }
}
