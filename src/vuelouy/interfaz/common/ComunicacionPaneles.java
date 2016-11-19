/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vuelouy.interfaz.common;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Observable;
import java.util.ResourceBundle;
import javax.swing.Timer;


public class ComunicacionPaneles extends Observable implements ActionListener{

    /**Variable de la ventana de inicio del pasajero.**/
    private vuelouy.interfaz.common.InicioPasajero ventanaInicioP;
    /**Variable de la ventana de inicio del tripulante.**/
    private vuelouy.interfaz.common.InicioTripulante ventanaInicioT;
    
    /**Nombre del panel a ver.**/
    private String panel;
    /**Idioma en la que se encuentra el sistema.**/
    private Locale idioma;
    /**Mensaje que se debe mostrar.**/
    private String mensaje;
    /**Bandera que indica si hubo un cambio de idioma.**/
    private boolean bIdioma;
    /**Bandera que indica si se debe mostrar un mensaje.**/
    private boolean bMensaje;
    /**Bandera que idica si se debe cambiar un panel**/
    private boolean bPanel;
    
    /**Timer para la duración de la visibilidad de la VentanaAlerta**/
    private Timer tiempo;
    
    private boolean silencio;

    private static final ComunicacionPaneles INSTANCIA = new ComunicacionPaneles();
    
    /**
     * Constructor sin paramentros, con valores por defecto.
     */
    private ComunicacionPaneles() {
        this.panel = "";
        this.bIdioma = false;
        this.bPanel = false;
        this.bMensaje = false;
        this.silencio = false;
    }
    
    public static ComunicacionPaneles getInstance() {
        return INSTANCIA;
    }

    /**
     *
     * @return
     */
    public boolean getBPanel() {
        return bPanel;
    }

    /**
     *
     * @return
     */
    public String getMensaje() {
        return mensaje;
    }

    public boolean getSilencio() {
        return silencio;
    }
    
    /**
     *
     * @return
     */
    public boolean getBIdioma() {
        return bIdioma;
    }
    
    /**
     *
     * @return
     */
    public boolean getBMensaje() {
        return bMensaje;
    }
    
    /**
     *
     * @return
     */
    public Locale getIdioma() {
        return idioma;
    }
    
    /**
     *
     * @return
     */
    public String getPanel() {
        return panel;
    }
    
     /**
     *
     * @param unBPanel
     */
    public void setBPanel(boolean unBPanel){
        this.bPanel = unBPanel;
        
    }  

    /**
     *
     * @param unPanel
     */
    public void setPanel(String unPanel) {
        panel = unPanel;
    }  

    /**
     *
     * @param unBIdioma
     */
    public void setBIdioma(boolean unBIdioma) {
        bIdioma = unBIdioma;
    }

    public void setSilencio(boolean unSilencio) {
        silencio = unSilencio;
    }
    
    /**
     *
     * @param unBMensaje
     */
    public void setbMensaje(boolean unBMensaje) {
        bMensaje = unBMensaje;
    }

    /**
     *
     * @param unMensaje
     */
    public void setMensaje(String unMensaje) {
        mensaje = unMensaje;
    }

    /**
     *
     * @param unIdioma
     */
    public void setIdioma(Locale unIdioma) {
        idioma = unIdioma;
    }

    

    /**
     *
     * @param unaVentanaInicioP
     */
    public void setVentanaInicioP(InicioPasajero unaVentanaInicioP) {
        ventanaInicioP = unaVentanaInicioP;
    }

    /**
     *
     * @param unaVentanaInicioT
     */
    public void setVentanaInicioT(InicioTripulante unaVentanaInicioT){
        ventanaInicioT = unaVentanaInicioT;
    }

    /**
     *
     * @return
     */
    public vuelouy.interfaz.common.InicioPasajero getVentanaInicioP(){
        return ventanaInicioP;
    }
    
    /**
     *
     * @return
     */
    public vuelouy.interfaz.common.InicioTripulante getVentanaInicioT() {
        return ventanaInicioT;
    }
    
    public void cambio() {
//        if(this.getBIdioma()){
//            this.setIdioma((Locale)unCambio);
//        }else if (this.getBMensaje()) {
//            this.setMensaje((String)unCambio);
//            iniciarTimer();
//        }else if (this.getBPanel()) {
//            this.setPanel(unCambio);
//        }
        this.setChanged();
        notifyObservers();
    }
    
     public String obtenerValorTraducido(String fieldKey) {
        return ResourceBundle.getBundle("vuelouy/interfaz/common/Bundle",
                this.getIdioma()).getString(fieldKey);
     }
    
    
    
    /**
     * Método que inica un el <code>tiempo</code>.
     * @param duracion tiempo de duracion del mensaje.
     */
    public void iniciarTimer(int duracion){
        if(tiempo != null){
            tiempo.stop();
        }
        tiempo = new Timer(duracion, this); // 5 segundos, deberia de pender del tipo de mensaje
        tiempo.start();
    }   
    @Override
    public void actionPerformed(ActionEvent e) {
        this.setMensaje("Desaparecer");
        tiempo.stop();
        this.setChanged();
        notifyObservers();
    }
    
   
}