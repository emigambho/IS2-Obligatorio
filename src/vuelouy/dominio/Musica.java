package vuelouy.dominio;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import vuelouy.archivos.ManejadorArchivos;

/**
 * 
 * @author 
 */
public class Musica {

    /**Variable que maneja los archivos de audio.**/
    private Clip cancion;
    /**Bandera qeu indica si se esta reproduciendo una pista**/
    private boolean reproduciendo;
    /**Lista de canciones**/
    private Cancion[] listaMusicas;
    /**Numero de pista que se sesta reproduciendo**/
    private int posActual;
    
    /**
     * Constructor de la clase
     */
    public Musica() {
        this.setReproduciendo(false);
        ManejadorArchivos ma = new ManejadorArchivos();
        try {
            List<Cancion> canciones = ma.obetenerCanciones();
            listaMusicas = new Cancion[canciones.size()];
            listaMusicas = canciones.toArray(listaMusicas);
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Musica.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setCancion(this.getListaMusicas()[0].getMusica());
        this.setPosActual(0);
    }

    /**
     *
     * @return la lista de canciones.
     */
    public Cancion[] getListaMusicas() {
        return listaMusicas;
    }

    /**
     *
     * @return el numero de pista que se esta reproduciendo. (0 = primero)
     */
    public int getPosActual() {
        return posActual;
    }
    
    /**
     * Se cambia el numero de la cancion que se reproduce
     * @param unaPosActual es la nueva cancion
     */
    public void setPosActual(int unaPosActual) {
        posActual = unaPosActual;
    }

    /**
     *
     * @return el manejador de la pista de audio
     */
    public Clip getCancion() {
        return cancion;
    }

    /**
     * Se crea una nueva cancion
     * @param cancion ya levantada en el sistema.
     */
    public void setCancion(Clip cancion) {
        this.cancion = cancion;
    }

    /**
     *
     * @return <code>true</code> si se esta reproduciendo
     */
    public boolean estaReproduciendo() {
        return reproduciendo;
    }
    
    private void setReproduciendo(boolean b){
        reproduciendo = b;
    }
    
    /**
     * Inicia la cancion
     * @param volumen volumen con el que se va a reproducir
     */
    public void reproducir(int volumen){
        FloatControl gainControl = 
            (FloatControl) cancion.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(6.0f);
        gainControl.setValue(-50.0f);
        gainControl.setValue(6.0f);
        cancion.start();
        setReproduciendo(true);
    }

    /**
     * Para la cancion
     */
    public void parar(){
        cancion.stop();
        setReproduciendo(false);
    }
    
    /**
     * Se crea una nueva cancion
     * @param posicion indice de la cancion en la lista.
     */
    public void seleccionarCancion(int posicion) {
        this.setPosActual(posicion);
        this.setCancion(this.getListaMusicas()[this.getPosActual()].getMusica());
        
    }
    
    /**
     * Pasa a la siguiente cancion
     */
    public void siguiente(){
        if (this.estaReproduciendo()) {
            parar();
        }
        int siguientePos = (this.getPosActual() + 1)%this.getListaMusicas().length;
        this.setPosActual(siguientePos);
        this.setCancion(this.getListaMusicas()[this.getPosActual()].getMusica());
    }
    
    /**
     * Retrocede a la cancion anterior
     */
    public void anterior(){
        if (this.estaReproduciendo()) {
            parar();
        }
        if ((this.getPosActual() - 1) < 0){
            this.setPosActual(this.getListaMusicas().length - 1);
            this.setCancion(this.getListaMusicas()[this.getPosActual()].getMusica());
        } else {
            this.setPosActual(this.getPosActual() - 1);
            this.setCancion(this.getListaMusicas()[this.getPosActual()].getMusica());
        }
    }
    
    private static float limit(FloatControl control,int level){
        BigDecimal maximoControl = new BigDecimal(control.getMaximum());
        BigDecimal maximo =  new BigDecimal(100);
        BigDecimal valor =  new BigDecimal(level);
        return maximoControl.multiply(valor).divide(maximo,5,RoundingMode.HALF_EVEN).floatValue();
    }
    
}
