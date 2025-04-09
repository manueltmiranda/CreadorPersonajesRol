package com.mtm.PersonajeRol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduzca los apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Introduzca su raza (Humano, Elfo, Orco): ");
        String raza = sc.nextLine();

        Heroe heroe = new Heroe(nombre, apellidos, raza);
        heroe.mostrarInfo();

        sc.close();
    }
}