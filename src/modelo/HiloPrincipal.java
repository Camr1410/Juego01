/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.FRM_VentanaPrincipal;

/**
 *
 * @author Carlos
 */
public class HiloPrincipal extends Thread {
    
    FRM_VentanaPrincipal ventanaPrincipal;

    public HiloPrincipal(FRM_VentanaPrincipal ventanaPrincipal) {
        
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    public void run() {
        
        while(true) 
        {
            try 
            {
                sleep(75);
                ventanaPrincipal.moverFondo();
            }
            catch(Exception e) 
            {
                System.err.println("Hubo un error en el hilo de ejecucion"+e);
            }
        }
    }
    
}
