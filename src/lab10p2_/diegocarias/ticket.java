/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10p2_.diegocarias;

public class ticket {
   
    public int numero;
    public String asunto;
    public String estado;
    public String prioridad;
    public String description;
    public ticket(int numero, String asunto, String estado, String prioridad, String description) {
        this.numero = numero;
        this.asunto = asunto;
        this.estado = estado;
        this.prioridad = prioridad;
        this.description = description;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAsunto() {
        return asunto;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
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
