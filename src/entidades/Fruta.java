/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author sergio
 */
public class Fruta {
    public long id;
    public String nombre;

    public Fruta() {
        
    }

    public Fruta(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
}
