/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_Instrucciones;
import vista.FRM_JuegoTerminado;
import vista.FRM_VentanaJuego;
import vista.FRM_VentanaPrincipal;

/**
 *
 * @author Carlos
 */
public class Controlador_FRM_VentanaPrincipal implements ActionListener {
    
    FRM_VentanaPrincipal frm_VentanaPrincipal;
    FRM_VentanaJuego frm_VentanaJuego;
    FRM_Instrucciones frm_Instrucciones;
    FRM_JuegoTerminado frm_JuegoTerminado;
    
    public Controlador_FRM_VentanaPrincipal(FRM_VentanaPrincipal frm_VentanaPrincipal) {
        this.frm_VentanaPrincipal=frm_VentanaPrincipal;
        this.frm_Instrucciones= new FRM_Instrucciones();
        this.frm_JuegoTerminado= new FRM_JuegoTerminado();
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Jugar")) {
            frm_VentanaPrincipal.setVisible(false);
            frm_VentanaJuego= new FRM_VentanaJuego(frm_VentanaPrincipal,frm_JuegoTerminado);
            frm_VentanaJuego.setVisible(true);
        }
        if(e.getActionCommand().equalsIgnoreCase("Instrucciones")) {
            frm_Instrucciones.setVisible(true);
        }
        if(e.getActionCommand().equalsIgnoreCase("Puntuacion")) {
            frm_JuegoTerminado.setTitle("Scores");
            frm_JuegoTerminado.jl_Titulo.setVisible(false);
            frm_JuegoTerminado.resetearGUI();
            frm_JuegoTerminado.deshabililitar();
            frm_JuegoTerminado.setVisible(true);
        }
    }
    
}
