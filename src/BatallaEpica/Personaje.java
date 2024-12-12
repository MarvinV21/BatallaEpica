/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marvi
 */
package BatallaEpica;

public abstract class Personaje {
    private final String nombre;
    private int vida;
    private final int fuerza;
    private final int defensa;

    public Personaje(String nombre, int vida, int fuerza, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    public void atacar(Personaje objetivo) {
        int daño = this.fuerza - objetivo.defensa;
        objetivo.recibirDaño(Math.max(daño, 0));
    }

    public void recibirDaño(int daño) {
        this.vida -= daño;
        System.out.println(this.nombre + " recibió " + daño + " de daño. Vida restante: " + this.vida);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public abstract void habilidadEspecial(Personaje objetivo);

    public String getNombre() { return nombre; }
}
