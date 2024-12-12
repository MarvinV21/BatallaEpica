/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author marvi
 */
package BatallaEpica;

public class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre, 90, 20, 12);
    }

    @Override
    public void habilidadEspecial(Personaje objetivo) {
        System.out.println(this.getNombre() + " lanza Flecha Precisa!");
        int daño = this.getFuerza() * 2;
        objetivo.recibirDaño(daño);
    }

    private int getFuerza() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}