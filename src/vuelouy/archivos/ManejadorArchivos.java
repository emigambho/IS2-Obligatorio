package vuelouy.archivos;

import static java.applet.Applet.newAudioClip;
import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import vuelouy.dominio.*;

/**
 *
 * @author emiga
 */
public class ManejadorArchivos {

    public ManejadorArchivos() {
    }
    
    public List<Libro> obetenerLibros(String idioma){
        List<Libro> libros = new ArrayList<>();
        final File folder = new File("C:\\Users\\emiga\\Desktop\\IS2\\Material\\VueloUY\\src\\vuelouy\\libros\\"+idioma);
        if(folder.listFiles() != null){
            for (final File fileEntry : folder.listFiles()) {
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
        
        return libros;
    }
    
    public List<Cancion> obetenerCanciones() throws IOException, UnsupportedAudioFileException, LineUnavailableException{
        List<Cancion> canciones = new ArrayList<>();
        final File folder = new File("C:\\Users\\emiga\\Desktop\\IS2\\Material\\VueloUY\\src\\vuelouy\\sonidos");
        for (final File fileEntry : folder.listFiles()) {
             AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(fileEntry);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            String titulo = "";
                if(fileEntry.getName() != null){
                    titulo = fileEntry.getName().replace(".wav","");
                }
            Cancion cancion = new Cancion(titulo, clip);
            canciones.add(cancion);
        }
        return canciones;
    }
}
