/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_JuegoTerminado;

/**
 *
 * @author Carlos
 */
public class Controlador_FRM_JuegoTerminado implements ActionListener {
    
    FRM_JuegoTerminado frm_JuegoTerminado;
    
    public Controlador_FRM_JuegoTerminado(FRM_JuegoTerminado frm_JuegoTerminado) {
        
        this.frm_JuegoTerminado=frm_JuegoTerminado;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Guardar")) {
            frm_JuegoTerminado.agregarInformacion();
            frm_JuegoTerminado.resetearGUI();
            frm_JuegoTerminado.deshabililitar();
        }
    }
}
