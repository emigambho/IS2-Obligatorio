package vuelosUY.archivos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import vuelouy.dominio.Viaje;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import vuelouy.archivos.ManejadorArchivos;

/**
 *
 * @author alumnoFI
 */
public class ManejadorArchivosTest {
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    private ManejadorArchivos manejador;
    
    /**
     *
     */
    public ManejadorArchivosTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        manejador = new ManejadorArchivos();
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }


    
    /**
     * Se testea ir a buscar una carpeta que no exista
     * Resultado esperado: Se espera que no la encuentre y retorne null
     */
    @Test
    public void testCarpetaInexistente() {
        File ficherInexistente = manejador.obtenerFichero("cualquier/path");
        Assert.assertEquals(ficherInexistente, null);
    }
    
    /**
     * Se testea ir a buscar una carpeta que no exista
     * Resultado esperado: Se espera que encuentre la carpeta de sonidos.
     */
    @Test
    public void testCarpetaFicheroExistenteSonidos() {
        File ficherInexistente = manejador.obtenerFichero("vuelouy/sonidos");
        Assert.assertNotEquals(ficherInexistente, null);
    }
    
    /**
     * Se testea ir a buscar una carpeta que no exista
     * Resultado esperado: Se espera que encuentre la carpeta de libros en 
     * idioma Ingles.
     */
    @Test
    public void testCarpetaFicheroExistenteLibrosEN() {
        File ficherInexistente = manejador.obtenerFichero("vuelouy/libros/en");
        Assert.assertNotEquals(ficherInexistente, null);
    }
    
    /**
     * Se testea ir a buscar una carpeta que no exista
     * Resultado esperado: Se espera que encuentre la carpeta de sonidos.
     */
    @Test
    public void testCarpetaFicheroExistenteLibrosIT() {
        File ficherInexistente = manejador.obtenerFichero("vuelouy/libros/it");
        Assert.assertNotEquals(ficherInexistente, null);
    }
    
    /**
     * Se testea ir a buscar una carpeta que no exista
     * Resultado esperado: Se espera que encuentre la carpeta de sonidos.
     */
    @Test
    public void testCarpetaFicheroExistenteLibrosFR() {
        File ficherInexistente = manejador.obtenerFichero("vuelouy/libros/fr");
        Assert.assertNotEquals(ficherInexistente, null);
    }
    
    /**
     * Se testea ir a buscar una carpeta que no exista
     * Resultado esperado: Se espera que encuentre la carpeta de sonidos.
     */
    @Test
    public void testCarpetaFicheroExistenteLibrosDE() {
        File ficherInexistente = manejador.obtenerFichero("vuelouy/libros/de");
        Assert.assertNotEquals(ficherInexistente, null);
    }
    
    /**
     * Se testea ir a buscar una carpeta que no exista
     * Resultado esperado: Se espera que encuentre la carpeta de sonidos.
     */
    @Test
    public void testCarpetaFicheroExistenteLibrosES() {
        File ficherInexistente = manejador.obtenerFichero("vuelouy/libros/es");
        Assert.assertNotEquals(ficherInexistente, null);
    }
    
    /**
     * Se testea ir a buscar una carpeta que no exista
     * Resultado esperado: Se espera que encuentre la carpeta de sonidos.
     */
    @Test
    public void testCarpetaFicheroNoExistenteLibros() {
        File ficherInexistente = manejador.obtenerFichero("vuelouy/sonidos");
        Assert.assertNotEquals(ficherInexistente, null);
    }
    
    /**
     *
     */
    @Test
    public void testLapsoRestante(){
        
    }
    

    
}
