package ar.com.mercadolibre.libreria;

public abstract class Alquilable extends Libro {

    private Boolean alquilado = false;

    public Alquilable(String titulo, String editorial) {
        super(titulo, editorial);
    }

    public Boolean isAlquilado(){
        return this.alquilado;
    }

    public void alquilar() {
        if (!alquilado)
            this.alquilado = true;
        else
            throw new RuntimeException("El libro ya está alquilado");
    }

    public void devolver() {
        if (alquilado)
            this.alquilado = false;
        else
            throw new RuntimeException("El libro ya fue devuelto");
    }
}
