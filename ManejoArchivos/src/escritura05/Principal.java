/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author jdieg
 */
public class Principal {
        public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadenaFinal = "";
        while (bandera) {
            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su placa:");
            String placa = entrada.nextLine();
            System.out.println("Ingrese marca del vehiculo:");
            String marca = entrada.nextLine();
            System.out.println("Ingrese cedula:");
            String cedula = entrada.nextLine();
            System.out.println("¿Quiere agregar más pacientes (Si/No)?");
            String valor = entrada.nextLine();
            valor.toUpperCase();
            cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                    nombre,
                    placa, marca, cedula);
            if (valor.equals("NO")) {
                bandera = false;
            } else {
                bandera = true;
            }
            escritura04.Datos.agregarRegistros(cadenaFinal, placa);
        }
    }
}

