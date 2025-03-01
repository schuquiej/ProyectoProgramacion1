/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import Mensajes.Mensajes;
import clases.CuentasBancarias;

import java.util.Scanner;

/**
 * @author sergi
 */
public class Proyecto1 {


    Scanner leerLinea = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int opcion;

        Mensajes.escribir("Seleccione una opcion: ");
        Mensajes.escribir("1. Gestion de cuanta bancaria: ");
        Mensajes.escribir("2. Control de temperatura: ");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:

                CuentasBancarias cuentasBancarias = new CuentasBancarias();
                cuentasBancarias.RegistrarCuentasBancaria();


        }

    }

}
