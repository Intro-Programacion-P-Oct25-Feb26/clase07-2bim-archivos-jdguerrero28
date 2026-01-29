/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

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
            System.out.println("Ingrese su cedula:");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su correo:");
            String correo = entrada.nextLine();
            System.out.println("¿Quiere agregar más pacientes (Si/No)?");
            String valor = entrada.nextLine();
            cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                    cedula,
                    nombre, correo);
            if (valor.equals("No")) {
                System.out.println("\n\nYa no se ingresaran más pacientes");
                bandera = false;
            } else {
                bandera = true;
            }
            Datos.agregarRegistros(cadenaFinal, cedula);
        }
    }
}
