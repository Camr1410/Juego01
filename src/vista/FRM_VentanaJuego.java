/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.applet.AudioClip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.HiloJuego;
import sun.applet.AppletAudioClip;

/**
 *
 * @author Carlos
 */
public class FRM_VentanaJuego extends javax.swing.JFrame {

    HiloJuego hilo;
    public String estado="Bajando";
    int segundos=0;
    private boolean iniciado=false;
    FRM_JuegoTerminado frm_JuegoTerminado;
    FRM_VentanaPrincipal frm_VentanaPrincipal;
    Icon explosion= new ImageIcon(getClass().getResource("/img/explosion.gif"));
    Icon pezMuerto= new ImageIcon(getClass().getResource("/img/pezMuerto.png"));
    AudioClip sonidoExplosion= new AppletAudioClip(getClass().getResource("/audio/explosion.wav"));
    
    public FRM_VentanaJuego(FRM_VentanaPrincipal frm_VentanaPrincipal,FRM_JuegoTerminado frm_JuegoTerminado) {
        super("Bomber Fish");
        initComponents();
        setLocationRelativeTo(this);
        hilo= new HiloJuego(this);
        this.frm_VentanaPrincipal=frm_VentanaPrincipal;
        this.frm_JuegoTerminado=frm_JuegoTerminado;
    }
    
    public void moverFondo() {
        if(jl_Fondo.getX()>-4520)
        {
            this.jl_Fondo.setLocation(jl_Fondo.getX()-10, jl_Fondo.getY());
            this.jl_Bomba001.setLocation(jl_Bomba001.getX()-10, jl_Bomba001.getY());
            this.jl_Cadena001.setLocation(jl_Cadena001.getX()-10, jl_Cadena001.getY());
            this.jl_Bomba002.setLocation(jl_Bomba002.getX()-10, jl_Bomba002.getY());
            this.jl_Cadena002.setLocation(jl_Cadena002.getX()-10, jl_Cadena002.getY());
            this.jl_Bomba003.setLocation(jl_Bomba003.getX()-10, jl_Bomba003.getY());
            this.jl_Cadena003.setLocation(jl_Cadena003.getX()-10, jl_Cadena003.getY());
            this.jl_Bomba004.setLocation(jl_Bomba004.getX()-10, jl_Bomba004.getY());
            this.jl_Cadena004.setLocation(jl_Cadena004.getX()-10, jl_Cadena004.getY());
            this.jl_Bomba005.setLocation(jl_Bomba005.getX()-10, jl_Bomba005.getY());
            this.jl_Cadena005.setLocation(jl_Cadena005.getX()-10, jl_Cadena005.getY());
            this.jl_Bomba006.setLocation(jl_Bomba006.getX()-10, jl_Bomba006.getY());
            this.jl_Cadena006.setLocation(jl_Cadena006.getX()-10, jl_Cadena006.getY());
            this.jl_Bomba007.setLocation(jl_Bomba007.getX()-10, jl_Bomba007.getY());
            this.jl_Cadena007.setLocation(jl_Cadena007.getX()-10, jl_Cadena007.getY());
            this.jl_Bomba008.setLocation(jl_Bomba008.getX()-10, jl_Bomba008.getY());
            this.jl_Cadena008.setLocation(jl_Cadena008.getX()-10, jl_Cadena008.getY());
            this.jl_Bomba009.setLocation(jl_Bomba009.getX()-10, jl_Bomba009.getY());
            this.jl_Cadena009.setLocation(jl_Cadena009.getX()-10, jl_Cadena009.getY());
            this.jl_Bomba010.setLocation(jl_Bomba010.getX()-10, jl_Bomba010.getY());
            this.jl_Cadena010.setLocation(jl_Cadena010.getX()-10, jl_Cadena010.getY());
            this.jl_Bomba011.setLocation(jl_Bomba011.getX()-10, jl_Bomba011.getY());
            this.jl_Cadena011.setLocation(jl_Cadena011.getX()-10, jl_Cadena011.getY());
            this.jl_Bomba012.setLocation(jl_Bomba012.getX()-10, jl_Bomba012.getY());
            this.jl_Cadena012.setLocation(jl_Cadena012.getX()-10, jl_Cadena012.getY());
            this.jl_Bomba013.setLocation(jl_Bomba013.getX()-10, jl_Bomba013.getY());
            this.jl_Cadena013.setLocation(jl_Cadena013.getX()-10, jl_Cadena013.getY());
            this.jl_Bomba014.setLocation(jl_Bomba014.getX()-10, jl_Bomba014.getY());
            this.jl_Cadena014.setLocation(jl_Cadena014.getX()-10, jl_Cadena014.getY());
            this.jl_Bomba015.setLocation(jl_Bomba015.getX()-10, jl_Bomba015.getY());
            this.jl_Cadena015.setLocation(jl_Cadena015.getX()-10, jl_Cadena015.getY());
            this.jl_Bomba016.setLocation(jl_Bomba016.getX()-10, jl_Bomba016.getY());
            this.jl_Cadena016.setLocation(jl_Cadena016.getX()-10, jl_Cadena016.getY());
            this.jl_Bomba017.setLocation(jl_Bomba017.getX()-10, jl_Bomba017.getY());
            this.jl_Cadena017.setLocation(jl_Cadena017.getX()-10, jl_Cadena017.getY());
            this.jl_Bomba018.setLocation(jl_Bomba018.getX()-10, jl_Bomba018.getY());
            this.jl_Cadena018.setLocation(jl_Cadena018.getX()-10, jl_Cadena018.getY());
            this.jl_Bomba019.setLocation(jl_Bomba019.getX()-10, jl_Bomba019.getY());
            this.jl_Cadena019.setLocation(jl_Cadena019.getX()-10, jl_Cadena019.getY());
            this.jl_Bomba020.setLocation(jl_Bomba020.getX()-10, jl_Bomba020.getY());
            this.jl_Cadena020.setLocation(jl_Cadena020.getX()-10, jl_Cadena020.getY());
            this.jl_Bomba021.setLocation(jl_Bomba021.getX()-10, jl_Bomba021.getY());
            this.jl_Cadena021.setLocation(jl_Cadena021.getX()-10, jl_Cadena021.getY());
            this.jl_Bomba022.setLocation(jl_Bomba022.getX()-10, jl_Bomba022.getY());
            this.jl_Cadena022.setLocation(jl_Cadena022.getX()-10, jl_Cadena022.getY());
            this.jl_Bomba023.setLocation(jl_Bomba023.getX()-10, jl_Bomba023.getY());
            this.jl_Cadena023.setLocation(jl_Cadena023.getX()-10, jl_Cadena023.getY());
            this.jl_Bomba024.setLocation(jl_Bomba024.getX()-10, jl_Bomba024.getY());
            this.jl_Cadena024.setLocation(jl_Cadena024.getX()-10, jl_Cadena024.getY());
            this.jl_Bomba025.setLocation(jl_Bomba025.getX()-10, jl_Bomba025.getY());
            this.jl_Cadena025.setLocation(jl_Cadena025.getX()-10, jl_Cadena025.getY());
            this.jl_Bomba026.setLocation(jl_Bomba026.getX()-10, jl_Bomba026.getY());
            this.jl_Cadena026.setLocation(jl_Cadena026.getX()-10, jl_Cadena026.getY());
            this.jl_Bomba027.setLocation(jl_Bomba027.getX()-10, jl_Bomba027.getY());
            this.jl_Cadena027.setLocation(jl_Cadena027.getX()-10, jl_Cadena027.getY());
            this.jl_Bomba028.setLocation(jl_Bomba028.getX()-10, jl_Bomba028.getY());
            this.jl_Cadena028.setLocation(jl_Cadena028.getX()-10, jl_Cadena028.getY());
            this.jl_Bomba029.setLocation(jl_Bomba029.getX()-10, jl_Bomba029.getY());
            this.jl_Cadena029.setLocation(jl_Cadena029.getX()-10, jl_Cadena029.getY());
            this.jl_Bomba030.setLocation(jl_Bomba030.getX()-10, jl_Bomba030.getY());
            this.jl_Cadena030.setLocation(jl_Cadena030.getX()-10, jl_Cadena030.getY());
            this.jl_Bomba031.setLocation(jl_Bomba031.getX()-10, jl_Bomba031.getY());
            this.jl_Cadena031.setLocation(jl_Cadena031.getX()-10, jl_Cadena031.getY());
            this.jl_Bomba032.setLocation(jl_Bomba032.getX()-10, jl_Bomba032.getY());
            this.jl_Cadena032.setLocation(jl_Cadena032.getX()-10, jl_Cadena032.getY());
        }
        else
        {
            this.jl_Fondo.setLocation(0, jl_Fondo.getY());
            this.jl_Bomba001.setLocation(283, jl_Bomba001.getY());
            this.jl_Cadena001.setLocation(320, jl_Cadena001.getY());
            this.jl_Bomba002.setLocation(283, jl_Bomba002.getY());
            this.jl_Cadena002.setLocation(320, jl_Cadena002.getY());
            this.jl_Bomba003.setLocation(403, jl_Bomba003.getY());
            this.jl_Cadena003.setLocation(440, jl_Cadena003.getY());
            this.jl_Bomba004.setLocation(403, jl_Bomba004.getY());
            this.jl_Cadena004.setLocation(440, jl_Cadena004.getY());
            this.jl_Bomba005.setLocation(523, jl_Bomba005.getY());
            this.jl_Cadena005.setLocation(560, jl_Cadena005.getY());
            this.jl_Bomba006.setLocation(523, jl_Bomba006.getY());
            this.jl_Cadena006.setLocation(560, jl_Cadena006.getY());
            this.jl_Bomba007.setLocation(643, jl_Bomba007.getY());
            this.jl_Cadena007.setLocation(680, jl_Cadena007.getY());
            this.jl_Bomba008.setLocation(643, jl_Bomba008.getY());
            this.jl_Cadena008.setLocation(680, jl_Cadena008.getY());
            this.jl_Bomba009.setLocation(893, jl_Bomba009.getY());
            this.jl_Cadena009.setLocation(930, jl_Cadena009.getY());
            this.jl_Bomba010.setLocation(1296, jl_Bomba010.getY());
            this.jl_Cadena010.setLocation(1330, jl_Cadena010.getY());
            this.jl_Bomba011.setLocation(1692, jl_Bomba011.getY());
            this.jl_Cadena011.setLocation(1730, jl_Cadena011.getY());
            this.jl_Bomba012.setLocation(2096, jl_Bomba012.getY());
            this.jl_Cadena012.setLocation(2130, jl_Cadena012.getY());
            this.jl_Bomba013.setLocation(2493, jl_Bomba013.getY());
            this.jl_Cadena013.setLocation(2530, jl_Cadena013.getY());
            this.jl_Bomba014.setLocation(2895, jl_Bomba014.getY());
            this.jl_Cadena014.setLocation(2930, jl_Cadena014.getY());
            this.jl_Bomba015.setLocation(3293, jl_Bomba015.getY());
            this.jl_Cadena015.setLocation(3330, jl_Cadena015.getY());
            this.jl_Bomba016.setLocation(3696, jl_Bomba016.getY());
            this.jl_Cadena016.setLocation(3730, jl_Cadena016.getY());
            this.jl_Bomba017.setLocation(3992, jl_Bomba017.getY());
            this.jl_Cadena017.setLocation(4030, jl_Cadena017.getY());
            this.jl_Bomba018.setLocation(3992, jl_Bomba018.getY());
            this.jl_Cadena018.setLocation(4030, jl_Cadena018.getY());
            this.jl_Bomba019.setLocation(4193, jl_Bomba019.getY());
            this.jl_Cadena019.setLocation(4230, jl_Cadena019.getY());
            this.jl_Bomba020.setLocation(4195, jl_Bomba020.getY());
            this.jl_Cadena020.setLocation(4230, jl_Cadena020.getY());
            this.jl_Bomba021.setLocation(4393, jl_Bomba021.getY());
            this.jl_Cadena021.setLocation(4430, jl_Cadena021.getY());
            this.jl_Bomba022.setLocation(4393, jl_Bomba022.getY());
            this.jl_Cadena022.setLocation(4430, jl_Cadena022.getY());
            this.jl_Bomba023.setLocation(4593, jl_Bomba023.getY());
            this.jl_Cadena023.setLocation(4630, jl_Cadena023.getY());
            this.jl_Bomba024.setLocation(4594, jl_Bomba024.getY());
            this.jl_Cadena024.setLocation(4630, jl_Cadena024.getY());
            this.jl_Bomba025.setLocation(4743, jl_Bomba025.getY());
            this.jl_Cadena025.setLocation(4780, jl_Cadena025.getY());
            this.jl_Bomba026.setLocation(4743, jl_Bomba026.getY());
            this.jl_Cadena026.setLocation(4780, jl_Cadena026.getY());
            this.jl_Bomba027.setLocation(4893, jl_Bomba027.getY());
            this.jl_Cadena027.setLocation(4930, jl_Cadena027.getY());
            this.jl_Bomba028.setLocation(4895, jl_Bomba028.getY());
            this.jl_Cadena028.setLocation(4930, jl_Cadena028.getY());
            this.jl_Bomba029.setLocation(5043, jl_Bomba029.getY());
            this.jl_Cadena029.setLocation(5080, jl_Cadena029.getY());
            this.jl_Bomba030.setLocation(5043, jl_Bomba030.getY());
            this.jl_Cadena030.setLocation(5080, jl_Cadena030.getY());
            this.jl_Bomba031.setLocation(5193, jl_Bomba031.getY());
            this.jl_Cadena031.setLocation(5230, jl_Cadena031.getY());
            this.jl_Bomba032.setLocation(5194, jl_Bomba032.getY());
            this.jl_Cadena032.setLocation(5230, jl_Cadena032.getY());
        }
    }
    public void subirPersonaje() {
        jl_Personaje.setLocation(jl_Personaje.getX(), jl_Personaje.getY()-14);
        if(jl_Fondo.getX()<-3750) {
            jl_Personaje.setLocation(jl_Personaje.getX(), jl_Personaje.getY()-16);
        }
    }
    public void bajarPersonaje() {
        jl_Personaje.setLocation(jl_Personaje.getX(), jl_Personaje.getY()+14);
        if(jl_Fondo.getX()<-3750) {
            jl_Personaje.setLocation(jl_Personaje.getX(), jl_Personaje.getY()+16);
        }
    }
    public void comprobarColision() {
        
        if(jl_Personaje.getY()+130>=680) {
            juegoTerminado();
            hilo.stop();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba001.getX() && jl_Bomba001.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba001.getY() && jl_Bomba001.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena001.getX() && jl_Cadena001.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena001.getY() && jl_Cadena001.getY()+90 > jl_Personaje.getY()) {

            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba002.getX() && jl_Bomba002.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba002.getY() && jl_Bomba002.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena002.getX() && jl_Cadena002.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena002.getY() && jl_Cadena002.getY()+90 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba003.getX() && jl_Bomba003.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba003.getY() && jl_Bomba003.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena003.getX() && jl_Cadena003.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena003.getY() && jl_Cadena003.getY()+145 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba004.getX() && jl_Bomba004.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba004.getY() && jl_Bomba004.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena004.getX() && jl_Cadena004.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena004.getY() && jl_Cadena004.getY()+145 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba005.getX() && jl_Bomba005.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba005.getY() && jl_Bomba005.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena005.getX() && jl_Cadena005.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena005.getY() && jl_Cadena005.getY()+117 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba006.getX() && jl_Bomba006.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba006.getY() && jl_Bomba006.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena006.getX() && jl_Cadena006.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena006.getY() && jl_Cadena006.getY()+117 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba007.getX() && jl_Bomba007.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba007.getY() && jl_Bomba007.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena007.getX() && jl_Cadena007.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena007.getY() && jl_Cadena007.getY()+170 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba008.getX() && jl_Bomba008.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba008.getY() && jl_Bomba008.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena008.getX() && jl_Cadena008.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena008.getY() && jl_Cadena008.getY()+170 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba009.getX() && jl_Bomba009.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba009.getY() && jl_Bomba009.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena009.getX() && jl_Cadena009.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena009.getY() && jl_Cadena009.getY()+292 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba010.getX() && jl_Bomba010.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba010.getY() && jl_Bomba010.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena010.getX() && jl_Cadena010.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena010.getY() && jl_Cadena010.getY()+348 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba011.getX() && jl_Bomba011.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba011.getY() && jl_Bomba011.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena011.getX() && jl_Cadena011.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena011.getY() && jl_Cadena011.getY()+235 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba012.getX() && jl_Bomba012.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba012.getY() && jl_Bomba012.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena012.getX() && jl_Cadena012.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena012.getY() && jl_Cadena012.getY()+320 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba013.getX() && jl_Bomba013.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba013.getY() && jl_Bomba013.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena013.getX() && jl_Cadena013.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena013.getY() && jl_Cadena013.getY()+263 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba014.getX() && jl_Bomba014.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba014.getY() && jl_Bomba014.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena014.getX() && jl_Cadena014.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena014.getY() && jl_Cadena014.getY()+292 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba015.getX() && jl_Bomba015.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba015.getY() && jl_Bomba015.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena015.getX() && jl_Cadena015.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena015.getY() && jl_Cadena015.getY()+377 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba016.getX() && jl_Bomba016.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba016.getY() && jl_Bomba016.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena016.getX() && jl_Cadena016.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena016.getY() && jl_Cadena016.getY()+348 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba017.getX() && jl_Bomba017.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba017.getY() && jl_Bomba017.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena017.getX() && jl_Cadena017.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena017.getY() && jl_Cadena017.getY()+206 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba018.getX() && jl_Bomba018.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba018.getY() && jl_Bomba018.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena018.getX() && jl_Cadena018.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena018.getY() && jl_Cadena018.getY()+95 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba019.getX() && jl_Bomba019.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba019.getY() && jl_Bomba019.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena019.getX() && jl_Cadena019.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena019.getY() && jl_Cadena019.getY()+66 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba020.getX() && jl_Bomba020.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba020.getY() && jl_Bomba020.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena020.getX() && jl_Cadena020.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena020.getY() && jl_Cadena020.getY()+235 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba021.getX() && jl_Bomba021.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba021.getY() && jl_Bomba021.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena021.getX() && jl_Cadena021.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena021.getY() && jl_Cadena021.getY()+263 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba022.getX() && jl_Bomba022.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba022.getY() && jl_Bomba022.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena022.getX() && jl_Cadena022.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena022.getY() && jl_Cadena022.getY()+38 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba023.getX() && jl_Bomba023.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba023.getY() && jl_Bomba023.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena023.getX() && jl_Cadena023.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena023.getY() && jl_Cadena023.getY()+150 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba024.getX() && jl_Bomba024.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba024.getY() && jl_Bomba024.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena024.getX() && jl_Cadena024.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena024.getY() && jl_Cadena024.getY()+150 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba025.getX() && jl_Bomba025.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba025.getY() && jl_Bomba025.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena025.getX() && jl_Cadena025.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena025.getY() && jl_Cadena025.getY()+206 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba026.getX() && jl_Bomba026.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba026.getY() && jl_Bomba026.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena026.getX() && jl_Cadena026.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena026.getY() && jl_Cadena026.getY()+95 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba027.getX() && jl_Bomba027.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba027.getY() && jl_Bomba027.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena027.getX() && jl_Cadena027.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena027.getY() && jl_Cadena027.getY()+66 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba028.getX() && jl_Bomba028.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba028.getY() && jl_Bomba028.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena028.getX() && jl_Cadena028.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena028.getY() && jl_Cadena028.getY()+235 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba029.getX() && jl_Bomba029.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba029.getY() && jl_Bomba029.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena029.getX() && jl_Cadena029.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena029.getY() && jl_Cadena029.getY()+263 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba030.getX() && jl_Bomba030.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba030.getY() && jl_Bomba030.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena030.getX() && jl_Cadena030.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena030.getY() && jl_Cadena030.getY()+38 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba031.getX() && jl_Bomba031.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba031.getY() && jl_Bomba031.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena031.getX() && jl_Cadena031.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena031.getY() && jl_Cadena031.getY()+150 > jl_Personaje.getY()) {
            
            finalizar();
        }
        if(jl_Personaje.getX()+68 > jl_Bomba032.getX() && jl_Bomba032.getX()+77 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Bomba032.getY() && jl_Bomba032.getY()+77 > jl_Personaje.getY() ||
           jl_Personaje.getX()+68 > jl_Cadena032.getX() && jl_Cadena032.getX()+13 > jl_Personaje.getX() && jl_Personaje.getY()+67 > jl_Cadena032.getY() && jl_Cadena032.getY()+150 > jl_Personaje.getY()) {
            
            finalizar();
        }
    }
    public void explosion() {
        
        jl_Bomba001.setIcon(explosion);
        jl_Cadena001.setIcon(explosion);
        jl_Bomba002.setIcon(explosion);
        jl_Cadena002.setIcon(explosion);
        jl_Bomba003.setIcon(explosion);
        jl_Cadena003.setIcon(explosion);
        jl_Bomba004.setIcon(explosion);
        jl_Cadena004.setIcon(explosion);
        jl_Bomba005.setIcon(explosion);
        jl_Cadena005.setIcon(explosion);
        jl_Bomba006.setIcon(explosion);
        jl_Cadena006.setIcon(explosion);
        jl_Bomba007.setIcon(explosion);
        jl_Cadena007.setIcon(explosion);
        jl_Bomba008.setIcon(explosion);
        jl_Cadena008.setIcon(explosion);
        jl_Bomba009.setIcon(explosion);
        jl_Cadena009.setIcon(explosion);
        jl_Bomba010.setIcon(explosion);
        jl_Cadena010.setIcon(explosion);
        jl_Bomba011.setIcon(explosion);
        jl_Cadena011.setIcon(explosion);
        jl_Bomba012.setIcon(explosion);
        jl_Cadena012.setIcon(explosion);
        jl_Bomba013.setIcon(explosion);
        jl_Cadena013.setIcon(explosion);
        jl_Bomba014.setIcon(explosion);
        jl_Cadena014.setIcon(explosion);
        jl_Bomba015.setIcon(explosion);
        jl_Cadena015.setIcon(explosion);
        jl_Bomba016.setIcon(explosion);
        jl_Cadena016.setIcon(explosion);
        jl_Bomba017.setIcon(explosion);
        jl_Cadena017.setIcon(explosion);
        jl_Bomba018.setIcon(explosion);
        jl_Cadena018.setIcon(explosion);
        jl_Bomba019.setIcon(explosion);
        jl_Cadena019.setIcon(explosion);
        jl_Bomba020.setIcon(explosion);
        jl_Cadena020.setIcon(explosion);
        jl_Bomba021.setIcon(explosion);
        jl_Cadena021.setIcon(explosion);
        jl_Bomba022.setIcon(explosion);
        jl_Cadena022.setIcon(explosion);
        jl_Bomba023.setIcon(explosion);
        jl_Cadena023.setIcon(explosion);
        jl_Bomba024.setIcon(explosion);
        jl_Cadena024.setIcon(explosion);
        jl_Bomba025.setIcon(explosion);
        jl_Cadena025.setIcon(explosion);
        jl_Bomba026.setIcon(explosion);
        jl_Cadena026.setIcon(explosion);
        jl_Bomba027.setIcon(explosion);
        jl_Cadena027.setIcon(explosion);
        jl_Bomba028.setIcon(explosion);
        jl_Cadena028.setIcon(explosion);
        jl_Bomba029.setIcon(explosion);
        jl_Cadena029.setIcon(explosion);
        jl_Bomba030.setIcon(explosion);
        jl_Cadena030.setIcon(explosion);
        jl_Bomba031.setIcon(explosion);
        jl_Cadena031.setIcon(explosion);
        jl_Bomba032.setIcon(explosion);
        jl_Cadena032.setIcon(explosion);
        sonidoExplosion.play();
    }
    public void tiempo() {
        
        segundos++;
        if(segundos==10) {
            
            this.jl_Tiempo.setText((Integer.parseInt(jl_Tiempo.getText())+1)+"");
            segundos=0;
        }
    }
    public void juegoTerminado() {
        frm_JuegoTerminado.setTitle("Game Over");
        frm_JuegoTerminado.jl_Titulo.setVisible(true);
        frm_JuegoTerminado.habililitar();
        frm_JuegoTerminado.colocarTiempo(this.jl_Tiempo.getText());
        frm_JuegoTerminado.setVisible(true);
    }
    public void finalizar() {
        explosion();
        jl_Personaje.setIcon(pezMuerto);
        juegoTerminado();
        hilo.stop();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jl_Tiempo = new javax.swing.JLabel();
        jl_EtiquetaTiempo = new javax.swing.JLabel();
        jl_Personaje = new javax.swing.JLabel();
        jl_Bomba001 = new javax.swing.JLabel();
        jl_Cadena001 = new javax.swing.JLabel();
        jl_Bomba002 = new javax.swing.JLabel();
        jl_Cadena002 = new javax.swing.JLabel();
        jl_Bomba003 = new javax.swing.JLabel();
        jl_Cadena003 = new javax.swing.JLabel();
        jl_Bomba004 = new javax.swing.JLabel();
        jl_Cadena004 = new javax.swing.JLabel();
        jl_Bomba005 = new javax.swing.JLabel();
        jl_Cadena005 = new javax.swing.JLabel();
        jl_Bomba006 = new javax.swing.JLabel();
        jl_Cadena006 = new javax.swing.JLabel();
        jl_Bomba007 = new javax.swing.JLabel();
        jl_Cadena007 = new javax.swing.JLabel();
        jl_Bomba008 = new javax.swing.JLabel();
        jl_Cadena008 = new javax.swing.JLabel();
        jl_Bomba009 = new javax.swing.JLabel();
        jl_Cadena009 = new javax.swing.JLabel();
        jl_Bomba010 = new javax.swing.JLabel();
        jl_Cadena010 = new javax.swing.JLabel();
        jl_Bomba011 = new javax.swing.JLabel();
        jl_Cadena011 = new javax.swing.JLabel();
        jl_Bomba012 = new javax.swing.JLabel();
        jl_Cadena012 = new javax.swing.JLabel();
        jl_Bomba013 = new javax.swing.JLabel();
        jl_Cadena013 = new javax.swing.JLabel();
        jl_Bomba014 = new javax.swing.JLabel();
        jl_Cadena014 = new javax.swing.JLabel();
        jl_Bomba015 = new javax.swing.JLabel();
        jl_Cadena015 = new javax.swing.JLabel();
        jl_Bomba016 = new javax.swing.JLabel();
        jl_Cadena016 = new javax.swing.JLabel();
        jl_Bomba017 = new javax.swing.JLabel();
        jl_Cadena017 = new javax.swing.JLabel();
        jl_Bomba018 = new javax.swing.JLabel();
        jl_Cadena018 = new javax.swing.JLabel();
        jl_Bomba019 = new javax.swing.JLabel();
        jl_Cadena019 = new javax.swing.JLabel();
        jl_Bomba020 = new javax.swing.JLabel();
        jl_Cadena020 = new javax.swing.JLabel();
        jl_Bomba021 = new javax.swing.JLabel();
        jl_Cadena021 = new javax.swing.JLabel();
        jl_Bomba022 = new javax.swing.JLabel();
        jl_Cadena022 = new javax.swing.JLabel();
        jl_Bomba023 = new javax.swing.JLabel();
        jl_Cadena023 = new javax.swing.JLabel();
        jl_Bomba024 = new javax.swing.JLabel();
        jl_Cadena024 = new javax.swing.JLabel();
        jl_Bomba025 = new javax.swing.JLabel();
        jl_Cadena025 = new javax.swing.JLabel();
        jl_Bomba026 = new javax.swing.JLabel();
        jl_Cadena026 = new javax.swing.JLabel();
        jl_Bomba027 = new javax.swing.JLabel();
        jl_Cadena027 = new javax.swing.JLabel();
        jl_Bomba028 = new javax.swing.JLabel();
        jl_Cadena028 = new javax.swing.JLabel();
        jl_Bomba029 = new javax.swing.JLabel();
        jl_Cadena029 = new javax.swing.JLabel();
        jl_Bomba030 = new javax.swing.JLabel();
        jl_Cadena030 = new javax.swing.JLabel();
        jl_Bomba031 = new javax.swing.JLabel();
        jl_Cadena031 = new javax.swing.JLabel();
        jl_Bomba032 = new javax.swing.JLabel();
        jl_Cadena032 = new javax.swing.JLabel();
        jl_Instruccion = new javax.swing.JLabel();
        jl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 635));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        jl_Tiempo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jl_Tiempo.setForeground(new java.awt.Color(255, 255, 51));
        jl_Tiempo.setText("0");
        getContentPane().add(jl_Tiempo);
        jl_Tiempo.setBounds(90, 10, 80, 34);

        jl_EtiquetaTiempo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jl_EtiquetaTiempo.setForeground(new java.awt.Color(102, 102, 102));
        jl_EtiquetaTiempo.setText("Time:");
        jl_EtiquetaTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jl_EtiquetaTiempo);
        jl_EtiquetaTiempo.setBounds(10, 10, 66, 34);

        jl_Personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pez.gif"))); // NOI18N
        getContentPane().add(jl_Personaje);
        jl_Personaje.setBounds(20, 90, 90, 130);

        jl_Bomba001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba001);
        jl_Bomba001.setBounds(283, 427, 89, 88);

        jl_Cadena001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad3.png"))); // NOI18N
        getContentPane().add(jl_Cadena001);
        jl_Cadena001.setBounds(320, 507, 13, 94);

        jl_Bomba002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba002);
        jl_Bomba002.setBounds(283, 85, 89, 88);

        jl_Cadena002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad3i.png"))); // NOI18N
        getContentPane().add(jl_Cadena002);
        jl_Cadena002.setBounds(320, -2, 13, 95);

        jl_Bomba003.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba003);
        jl_Bomba003.setBounds(403, 372, 89, 88);

        jl_Cadena003.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad5.png"))); // NOI18N
        getContentPane().add(jl_Cadena003);
        jl_Cadena003.setBounds(440, 452, 14, 150);

        jl_Bomba004.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba004);
        jl_Bomba004.setBounds(403, 142, 89, 88);

        jl_Cadena004.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad5i.png"))); // NOI18N
        getContentPane().add(jl_Cadena004);
        jl_Cadena004.setBounds(440, -2, 14, 151);

        jl_Bomba005.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba005);
        jl_Bomba005.setBounds(523, 399, 89, 88);

        jl_Cadena005.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad4.png"))); // NOI18N
        getContentPane().add(jl_Cadena005);
        jl_Cadena005.setBounds(560, 479, 14, 122);

        jl_Bomba006.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba006);
        jl_Bomba006.setBounds(523, 114, 89, 88);

        jl_Cadena006.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad4i.png"))); // NOI18N
        getContentPane().add(jl_Cadena006);
        jl_Cadena006.setBounds(560, -2, 14, 123);

        jl_Bomba007.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba007);
        jl_Bomba007.setBounds(643, 359, 89, 88);

        jl_Cadena007.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad6.png"))); // NOI18N
        getContentPane().add(jl_Cadena007);
        jl_Cadena007.setBounds(680, 423, 14, 178);

        jl_Bomba008.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba008);
        jl_Bomba008.setBounds(643, 151, 89, 88);

        jl_Cadena008.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad6i.png"))); // NOI18N
        getContentPane().add(jl_Cadena008);
        jl_Cadena008.setBounds(680, -2, 14, 179);

        jl_Bomba009.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba009);
        jl_Bomba009.setBounds(893, 228, 89, 88);

        jl_Cadena009.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad10.png"))); // NOI18N
        getContentPane().add(jl_Cadena009);
        jl_Cadena009.setBounds(930, 309, 15, 292);

        jl_Bomba010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba010);
        jl_Bomba010.setBounds(1296, 339, 89, 88);

        jl_Cadena010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad12i.png"))); // NOI18N
        getContentPane().add(jl_Cadena010);
        jl_Cadena010.setBounds(1330, -2, 16, 348);

        jl_Bomba011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba011);
        jl_Bomba011.setBounds(1692, 285, 89, 88);

        jl_Cadena011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad8.png"))); // NOI18N
        getContentPane().add(jl_Cadena011);
        jl_Cadena011.setBounds(1730, 366, 15, 235);

        jl_Bomba012.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba012);
        jl_Bomba012.setBounds(2096, 311, 89, 88);

        jl_Cadena012.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad11i.png"))); // NOI18N
        getContentPane().add(jl_Cadena012);
        jl_Cadena012.setBounds(2130, -2, 16, 320);

        jl_Bomba013.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba013);
        jl_Bomba013.setBounds(2493, 257, 89, 88);

        jl_Cadena013.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad9.png"))); // NOI18N
        getContentPane().add(jl_Cadena013);
        jl_Cadena013.setBounds(2530, 338, 15, 263);

        jl_Bomba014.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba014);
        jl_Bomba014.setBounds(2895, 283, 89, 88);

        jl_Cadena014.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad10i.png"))); // NOI18N
        getContentPane().add(jl_Cadena014);
        jl_Cadena014.setBounds(2930, -2, 15, 292);

        jl_Bomba015.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba015);
        jl_Bomba015.setBounds(3293, 143, 89, 88);

        jl_Cadena015.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad13.png"))); // NOI18N
        getContentPane().add(jl_Cadena015);
        jl_Cadena015.setBounds(3330, 224, 16, 377);

        jl_Bomba016.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        jl_Bomba016.setAutoscrolls(true);
        getContentPane().add(jl_Bomba016);
        jl_Bomba016.setBounds(3696, 339, 89, 88);

        jl_Cadena016.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad12i.png"))); // NOI18N
        getContentPane().add(jl_Cadena016);
        jl_Cadena016.setBounds(3730, -2, 16, 348);

        jl_Bomba017.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba017);
        jl_Bomba017.setBounds(3992, 314, 89, 88);

        jl_Cadena017.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad7.png"))); // NOI18N
        getContentPane().add(jl_Cadena017);
        jl_Cadena017.setBounds(4030, 395, 14, 206);

        jl_Bomba018.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba018);
        jl_Bomba018.setBounds(3992, 86, 89, 88);

        jl_Cadena018.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad3i.png"))); // NOI18N
        getContentPane().add(jl_Cadena018);
        jl_Cadena018.setBounds(4030, -2, 13, 95);

        jl_Bomba019.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba019);
        jl_Bomba019.setBounds(4193, 454, 89, 88);

        jl_Cadena019.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad2.png"))); // NOI18N
        getContentPane().add(jl_Cadena019);
        jl_Cadena019.setBounds(4230, 535, 13, 66);

        jl_Bomba020.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba020);
        jl_Bomba020.setBounds(4195, 227, 89, 88);

        jl_Cadena020.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad8i.png"))); // NOI18N
        getContentPane().add(jl_Cadena020);
        jl_Cadena020.setBounds(4230, -2, 15, 235);

        jl_Bomba021.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba021);
        jl_Bomba021.setBounds(4393, 257, 89, 88);

        jl_Cadena021.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad9.png"))); // NOI18N
        getContentPane().add(jl_Cadena021);
        jl_Cadena021.setBounds(4430, 338, 15, 263);

        jl_Bomba022.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba022);
        jl_Bomba022.setBounds(4393, 29, 89, 88);

        jl_Cadena022.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad1i.png"))); // NOI18N
        getContentPane().add(jl_Cadena022);
        jl_Cadena022.setBounds(4430, -2, 13, 38);

        jl_Bomba023.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba023);
        jl_Bomba023.setBounds(4593, 370, 89, 88);

        jl_Cadena023.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad5.png"))); // NOI18N
        getContentPane().add(jl_Cadena023);
        jl_Cadena023.setBounds(4630, 451, 14, 150);

        jl_Bomba024.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba024);
        jl_Bomba024.setBounds(4594, 142, 89, 88);

        jl_Cadena024.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad5i.png"))); // NOI18N
        getContentPane().add(jl_Cadena024);
        jl_Cadena024.setBounds(4630, -2, 14, 151);

        jl_Bomba025.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba025);
        jl_Bomba025.setBounds(4743, 314, 89, 88);

        jl_Cadena025.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad7.png"))); // NOI18N
        getContentPane().add(jl_Cadena025);
        jl_Cadena025.setBounds(4780, 395, 14, 206);

        jl_Bomba026.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba026);
        jl_Bomba026.setBounds(4743, 86, 89, 88);

        jl_Cadena026.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad3i.png"))); // NOI18N
        getContentPane().add(jl_Cadena026);
        jl_Cadena026.setBounds(4780, -2, 13, 95);

        jl_Bomba027.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba027);
        jl_Bomba027.setBounds(4893, 454, 89, 88);

        jl_Cadena027.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad2.png"))); // NOI18N
        getContentPane().add(jl_Cadena027);
        jl_Cadena027.setBounds(4930, 535, 13, 66);

        jl_Bomba028.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba028);
        jl_Bomba028.setBounds(4895, 227, 89, 88);

        jl_Cadena028.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad8i.png"))); // NOI18N
        getContentPane().add(jl_Cadena028);
        jl_Cadena028.setBounds(4930, -2, 15, 235);

        jl_Bomba029.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba029);
        jl_Bomba029.setBounds(5043, 257, 89, 88);

        jl_Cadena029.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad9.png"))); // NOI18N
        getContentPane().add(jl_Cadena029);
        jl_Cadena029.setBounds(5080, 338, 15, 263);

        jl_Bomba030.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba030);
        jl_Bomba030.setBounds(5043, 29, 89, 88);

        jl_Cadena030.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad1i.png"))); // NOI18N
        getContentPane().add(jl_Cadena030);
        jl_Cadena030.setBounds(5080, -2, 13, 38);

        jl_Bomba031.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba031);
        jl_Bomba031.setBounds(5193, 370, 89, 88);

        jl_Cadena031.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad5.png"))); // NOI18N
        getContentPane().add(jl_Cadena031);
        jl_Cadena031.setBounds(5230, 451, 14, 150);

        jl_Bomba032.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.png"))); // NOI18N
        getContentPane().add(jl_Bomba032);
        jl_Bomba032.setBounds(5194, 142, 89, 88);

        jl_Cadena032.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cad5i.png"))); // NOI18N
        getContentPane().add(jl_Cadena032);
        jl_Cadena032.setBounds(5230, -2, 14, 151);

        jl_Instruccion.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jl_Instruccion.setForeground(new java.awt.Color(255, 255, 51));
        jl_Instruccion.setText("Press the spacebar to start");
        getContentPane().add(jl_Instruccion);
        jl_Instruccion.setBounds(220, 280, 325, 34);

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        getContentPane().add(jl_Fondo);
        jl_Fondo.setBounds(0, 0, 5295, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        if(iniciado) {
            if(evt.getKeyCode()==32) {
                estado="Subiendo";
            }
        }
        else {
            if(evt.getKeyCode()==32) {
                this.jl_Instruccion.setVisible(false);
                hilo.start();
            }
            iniciado=true;
        }
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        
        if(evt.getKeyCode()==32) {
            estado="Bajando";
        }
    }//GEN-LAST:event_formKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frm_VentanaPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FRM_VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FRM_VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FRM_VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FRM_VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FRM_VentanaJuego().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jl_Bomba001;
    private javax.swing.JLabel jl_Bomba002;
    private javax.swing.JLabel jl_Bomba003;
    private javax.swing.JLabel jl_Bomba004;
    private javax.swing.JLabel jl_Bomba005;
    private javax.swing.JLabel jl_Bomba006;
    private javax.swing.JLabel jl_Bomba007;
    private javax.swing.JLabel jl_Bomba008;
    private javax.swing.JLabel jl_Bomba009;
    private javax.swing.JLabel jl_Bomba010;
    private javax.swing.JLabel jl_Bomba011;
    private javax.swing.JLabel jl_Bomba012;
    private javax.swing.JLabel jl_Bomba013;
    private javax.swing.JLabel jl_Bomba014;
    private javax.swing.JLabel jl_Bomba015;
    private javax.swing.JLabel jl_Bomba016;
    private javax.swing.JLabel jl_Bomba017;
    private javax.swing.JLabel jl_Bomba018;
    private javax.swing.JLabel jl_Bomba019;
    private javax.swing.JLabel jl_Bomba020;
    private javax.swing.JLabel jl_Bomba021;
    private javax.swing.JLabel jl_Bomba022;
    private javax.swing.JLabel jl_Bomba023;
    private javax.swing.JLabel jl_Bomba024;
    private javax.swing.JLabel jl_Bomba025;
    private javax.swing.JLabel jl_Bomba026;
    private javax.swing.JLabel jl_Bomba027;
    private javax.swing.JLabel jl_Bomba028;
    private javax.swing.JLabel jl_Bomba029;
    private javax.swing.JLabel jl_Bomba030;
    private javax.swing.JLabel jl_Bomba031;
    private javax.swing.JLabel jl_Bomba032;
    private javax.swing.JLabel jl_Cadena001;
    private javax.swing.JLabel jl_Cadena002;
    private javax.swing.JLabel jl_Cadena003;
    private javax.swing.JLabel jl_Cadena004;
    private javax.swing.JLabel jl_Cadena005;
    private javax.swing.JLabel jl_Cadena006;
    private javax.swing.JLabel jl_Cadena007;
    private javax.swing.JLabel jl_Cadena008;
    private javax.swing.JLabel jl_Cadena009;
    private javax.swing.JLabel jl_Cadena010;
    private javax.swing.JLabel jl_Cadena011;
    private javax.swing.JLabel jl_Cadena012;
    private javax.swing.JLabel jl_Cadena013;
    private javax.swing.JLabel jl_Cadena014;
    private javax.swing.JLabel jl_Cadena015;
    private javax.swing.JLabel jl_Cadena016;
    private javax.swing.JLabel jl_Cadena017;
    private javax.swing.JLabel jl_Cadena018;
    private javax.swing.JLabel jl_Cadena019;
    private javax.swing.JLabel jl_Cadena020;
    private javax.swing.JLabel jl_Cadena021;
    private javax.swing.JLabel jl_Cadena022;
    private javax.swing.JLabel jl_Cadena023;
    private javax.swing.JLabel jl_Cadena024;
    private javax.swing.JLabel jl_Cadena025;
    private javax.swing.JLabel jl_Cadena026;
    private javax.swing.JLabel jl_Cadena027;
    private javax.swing.JLabel jl_Cadena028;
    private javax.swing.JLabel jl_Cadena029;
    private javax.swing.JLabel jl_Cadena030;
    private javax.swing.JLabel jl_Cadena031;
    private javax.swing.JLabel jl_Cadena032;
    private javax.swing.JLabel jl_EtiquetaTiempo;
    private javax.swing.JLabel jl_Fondo;
    private javax.swing.JLabel jl_Instruccion;
    public javax.swing.JLabel jl_Personaje;
    private javax.swing.JLabel jl_Tiempo;
    // End of variables declaration//GEN-END:variables
}
