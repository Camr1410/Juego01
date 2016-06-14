/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import vista.FRM_JuegoTerminado;

/**
 *
 * @author Carlos
 */
public class MetodosJugador {
    
    private ArrayList<Jugador> arrayJugadores;
    ArchivoJugadores archivoJugadores;
    FRM_JuegoTerminado frm_JuegoTerminado;

    public MetodosJugador(FRM_JuegoTerminado frm_JuegoTerminado) {
        
        arrayJugadores= new ArrayList<Jugador>();
        archivoJugadores= new ArchivoJugadores();
        actualizarArray();
        this.frm_JuegoTerminado=frm_JuegoTerminado;
    }
    public void agregarJugador(String informacion[]) {
        
        Jugador temporal=new Jugador(informacion[0], informacion[1]);
        arrayJugadores.add(temporal);
    }
    public void cargarTabla() {
        
        String arreglo[]= new String[2];
        
        for(int contador=0;contador<arrayJugadores.size();contador++) {
            
            arreglo[0]=arrayJugadores.get(contador).getNombre();
            arreglo[1]=arrayJugadores.get(contador).getTiempo();
            frm_JuegoTerminado.agregarInformacionTabla(arreglo);
        }
    }
    public void escribirInformacionEnElArchivo() {
        
        archivoJugadores.crearArchivo();
      
        for(int contador=0;contador<arrayJugadores.size();contador++) {
            
            archivoJugadores.escribirInformacionEnElArchivo(arrayJugadores.get(contador));
        }
    }
    public void actualizarArray() {
        arrayJugadores=archivoJugadores.devolverInformacionCompleta();
    }
    
}
