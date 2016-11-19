/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vuelosUY.dominio;

import vuelouy.dominio.Musica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class MusicaTest {
    
    public MusicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    private Musica mus;
    private String rutaMusica;
    @Before
    public void setUp() {
        
        mus = new Musica();
        rutaMusica = "/vuelosUY/sonidos/wavv.wav";
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAccesorMusica() {
        assertEquals(rutaMusica, mus.getCancion());
    }
}
