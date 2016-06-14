/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.FRM_VentanaJuego;

/**
 *
 * @author Carlos
 */
public class HiloJuego extends Thread {
    
    FRM_VentanaJuego ventanaJuego;

    public HiloJuego(FRM_VentanaJuego ventanaJuego) {
        
        this.ventanaJuego = ventanaJuego;
    }
    
    public void run() {
        
        while(true) 
        {
            try 
            {
                sleep(100);
                ventanaJuego.moverFondo();
                comprobarPersonaje();
                ventanaJuego.comprobarColision();
                ventanaJuego.tiempo();
            }
            catch(Exception e) 
            {
                System.err.println("Hubo un error en el hilo de ejecucion"+e);
            }
        }
    }
    
    public void comprobarPersonaje() { 
        
        if(ventanaJuego.estado.equals("Subiendo")) {
            ventanaJuego.subirPersonaje();
        }
        if(ventanaJuego.estado.equals("Bajando")) {
            ventanaJuego.bajarPersonaje();
        }
        if(ventanaJuego.jl_Personaje.getY()<0) {
            ventanaJuego.estado="Bajando";
        }
    }
}
