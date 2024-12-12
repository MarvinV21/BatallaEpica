/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marvi
 */
package BatallaEpica;

public class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre, 120, 30, 15);
    }

    @Override
    public void habilidadEspecial(Personaje objetivo) {
        System.out.println(this.getNombre() + " usa Ataque Doble!");
        this.atacar(objetivo);
        this.atacar(objetivo);
    }
}