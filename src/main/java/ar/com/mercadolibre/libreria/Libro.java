package ar.com.mercadolibre.libreria;

public abstract class Libro {

    private String editorial;
    private String titulo;

    public Libro (String titulo, String editorial){
        this.editorial = editorial;
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }
}
