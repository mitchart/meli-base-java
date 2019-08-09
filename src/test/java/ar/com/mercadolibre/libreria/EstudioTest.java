package ar.com.mercadolibre.libreria;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class EstudioTest {

    @Test
    public void crearLibroEstudioNoAlquilado(){
        Estudio libroEstudio = new Estudio("libro", "sarasa");
        Assertions.assertThat(libroEstudio.isAlquilado());
    }
}
