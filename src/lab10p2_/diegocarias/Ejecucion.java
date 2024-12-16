/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10p2_.diegocarias;

import java.awt.Color;
import javax.swing.JProgressBar;

public class Ejecucion {
    //No la use
    public JProgressBar barra;
    public Color color;
    public int tiempo;

    public Ejecucion(JProgressBar barra, Color color, int tiempo) {
        this.barra = barra;
        this.color = color;
        this.tiempo = tiempo;
    }    
    public JProgressBar getBarra() {
        return barra;
    }
    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
