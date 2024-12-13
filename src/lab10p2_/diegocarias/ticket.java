/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10p2_.diegocarias;

/**
 *
 * @author djcar
 */
public class ticket {
    
    public String numero;
    public String asunto;
    public int estado;
    public int prioridad;
    public String description;

    public ticket(String numero, String asunto, int estado, int prioridad, String description) {
        this.numero = numero;
        this.asunto = asunto;
        this.estado = estado;
        this.prioridad = prioridad;
        this.description = description;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" + "numero: " + numero + "\nasunto: " + asunto + "\nestado: " + estado + "\nprioridad: " + prioridad + "\ndescription: " + description + '}';
    }
    
    
}
