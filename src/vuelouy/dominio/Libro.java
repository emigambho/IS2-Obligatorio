/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelouy.dominio;

/**
 *
 * @author emiga
 */
public class Libro {
    
    private String titulo;
    private String contenido;

    public Libro() {
    }

    public Libro(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
