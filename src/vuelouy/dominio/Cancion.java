package vuelouy.dominio;

import javax.sound.sampled.Clip;

/**
 *
 * @author emiga
 */
public class Cancion {
    
    private String nombre;
    private Clip musica;

    public Cancion() {
    }

    public Cancion(String nombre, Clip musica) {
        this.nombre = nombre;
        this.musica = musica;
    }

    public Clip getMusica() {
        return musica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMusica(Clip musica) {
        this.musica = musica;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
