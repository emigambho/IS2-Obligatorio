package vuelouy.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.misc.Launcher;
import vuelouy.dominio.*;

/**
 *
 * @author emiga
 */
public class ManejadorArchivos {
    
    private final static String  RAIZ = "C:/";

    public ManejadorArchivos() {
    }
    
    public List<Libro> obetenerLibros(String idioma){
        List<Libro> libros = new ArrayList<>();
        final File fichero = obtenerFichero("vuelouy/libros/"+idioma);
        if(fichero != null){
            if(fichero.listFiles() != null){
                for (final File fileEntry : fichero.listFiles()) {
                    FileReader f = null;
                    try {
                        String cadena;
                        StringBuilder sb = new StringBuilder();
                        f = new FileReader(fileEntry);
                        BufferedReader b = new BufferedReader(f);
                        while((cadena = b.readLine())!=null) {
                            sb.append(cadena);
                        }
                        String titulo = "";
                        if(fileEntry.getName() != null){
                            titulo = fileEntry.getName().replace(".html","");
                        }
                        Libro libro = new Libro(titulo, sb.toString());
                        libros.add(libro);
                    } catch (IOException ex) {
                            Logger.getLogger(ManejadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            f.close();
                        } catch (IOException ex) {
                            Logger.getLogger(ManejadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } 
            }
        }
        return libros;
    }
    
    public List<Cancion> obetenerCanciones() throws IOException, UnsupportedAudioFileException, LineUnavailableException{
        List<Cancion> canciones = new ArrayList<>();
        final File fichero = obtenerFichero("vuelouy/sonidos");
        if(fichero != null){
            for (final File fileEntry : fichero.listFiles()) {
               AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(fileEntry);
               Clip clip = AudioSystem.getClip();
               clip.open(audioInputStream);
               String titulo = "";
                   if(fileEntry.getName() != null){
                       //TODO: mejorar utilizando una lista de extensiones validas
                       titulo = fileEntry.getName().replace(".wav","");
                   }
               Cancion cancion = new Cancion(titulo, clip);
               canciones.add(cancion);
           }
        }
        return canciones;
    }
    
    public File obtenerFichero2(String path){
        File fichero = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());
        if(fichero.isFile()) {  
            try {
                final JarFile jar = new JarFile(fichero);
                final Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
                while(entries.hasMoreElements()) {
                    final String name = entries.nextElement().getName();
                    if (name.startsWith(path + "/")) { //filter according to the path
                        System.out.println(name);
                    }
                }
                jar.close();
            } catch (IOException ex) {
                Logger.getLogger(ManejadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else { 
            //TODO: Cambiar este metodo antes de que depreque
            final URL url = Launcher.class.getResource("/" + path);
            if (url != null) {
                try {
                    fichero = new File(url.toURI());
                    return fichero;
                } catch (URISyntaxException ex) {
                    Logger.getLogger(ManejadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
    
    public File obtenerFichero(String path){
        File fichero = new File(RAIZ+path);
        return fichero;
    }
}
