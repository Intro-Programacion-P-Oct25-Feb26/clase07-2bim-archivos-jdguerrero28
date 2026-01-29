/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author jdieg
 */
public class Datos {

        public static void agregarRegistros(String cadena, String placa) {
            try {
                String inicial = placa.substring(0, 1).toUpperCase();
                String rutaArchivo;
                String contenido;

                switch (inicial) {
                    case "L":
                        rutaArchivo = "data/Loja_Placa.txt";
                        contenido = cadena;
                        break;
                    case "G":
                        rutaArchivo = "data/Guayas_Placa.txt";
                        contenido = cadena;
                        break;
                    case "P":
                        rutaArchivo = "data/Pichincha_Placa.txt";
                        contenido = cadena;
                        break;
                    default:
                        rutaArchivo = "data/Otras.txt";
                        contenido = cadena;
                        break;
                }

                FileOutputStream fos = new FileOutputStream(rutaArchivo, true);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s\n", cadena);
                salida.close();

            } catch (Exception e) {
                System.err.println("Error al procesar el archivo: " + e.getMessage());
            }
        }
    }

