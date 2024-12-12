/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author marvi
 */
package BatallaEpica;

import java.util.Scanner;
import java.util.ArrayList;

public class Juego {
    private final ArrayList<Personaje> equipo1;
    private final ArrayList<Personaje> equipo2;

    public Juego() {
        equipo1 = new ArrayList<>();
        equipo2 = new ArrayList<>();
    }

    public void iniciar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Jugador 1, selecciona tu personaje:");
            equipo1.add(seleccionarPersonaje(scanner));
            
            System.out.println("Jugador 2, selecciona tu personaje:");
            equipo2.add(seleccionarPersonaje(scanner));
            
            boolean jugando = true;
            while (jugando) {
                System.out.println("Turno del Jugador 1");
                realizarTurno(scanner, equipo1.get(0), equipo2.get(0));
                
                if (!equipo2.get(0).estaVivo()) {
                    System.out.println("¡Jugador 1 gana!");
                    break;
                }
                
                System.out.println("Turno del Jugador 2");
                realizarTurno(scanner, equipo2.get(0), equipo1.get(0));
                
                if (!equipo1.get(0).estaVivo()) {
                    System.out.println("¡Jugador 2 gana!");
                    break;
                }
            }
        }
    }

    private Personaje seleccionarPersonaje(Scanner scanner) {
        System.out.println("1. Guerrero\n2. Mago\n3. Arquero");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1 -> {
                return new Guerrero("Guerrero");
            }
            case 2 -> {
                return new Mago("Mago");
            }
            case 3 -> {
                return new Arquero("Arquero");
            }
            default -> {
                System.out.println("Opción inválida, seleccionando Guerrero por defecto.");
                return new Guerrero("Guerrero");
            }
        }
    }

    private void realizarTurno(Scanner scanner, Personaje atacante, Personaje defensor) {
        System.out.println("1. Atacar\n2. Usar habilidad especial");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                atacante.atacar(defensor);
                break;
            case 2:
                atacante.habilidadEspecial(defensor);
                break;
            default:
                System.out.println("Opción inválida, perdiendo turno.");
                break;
        }
    }
}