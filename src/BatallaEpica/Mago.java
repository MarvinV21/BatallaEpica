/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marvi
 */
package BatallaEpica;

public class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre, 100, 25, 10);
    }

    @Override
    public void habilidadEspecial(Personaje objetivo) {
        System.out.println(this.getNombre() + " lanza un Hechizo!");
        int daño = 40;
        objetivo.recibirDaño(daño);
    }
}