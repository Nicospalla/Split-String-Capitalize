package practica;


import java.io.*;

import java.util.*;

public class Solution {
    static String nombre = "";
    static String apellido = "";
    static String apellido2 = "";

    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String nombreCompleto = reader.readLine();
        String[] nombreSplit = nombreCompleto.split("\\s+");
        if(nombreSplit.length == 1) {
            nombre = nombreSplit[0];
        }else if(nombreSplit.length == 2) {
            nombre = nombreSplit[0];
            apellido = nombreSplit[1];
        }else {
            nombre = nombreSplit[0];
            apellido = nombreSplit[1];
            apellido2 = nombreSplit[2];
        }
        imprimir(nombreSplit);
    }

    public static String capitalize(String palabra) {
        String primerLetra = palabra.substring(0, 1);
        String restoPalabra = palabra.substring(1);

        primerLetra = primerLetra.toUpperCase(Locale.ROOT);
        return primerLetra+restoPalabra;
    }

    public static void imprimir(String[] nombreSplit){
        if(nombreSplit.length == 1){
            System.out.println("El nombre ingresado es: "+capitalize(nombre));
        }else if(nombreSplit.length ==2) {
            System.out.println("El nombre ingresado es: "+capitalize(nombre));
            System.out.println("El primer apellido ingresado es: " + capitalize(apellido));
        }else {
            System.out.println("El nombre ingresado es: "+capitalize(nombre));
            System.out.println("El primer apellido ingresado es: " + capitalize(apellido));
            System.out.println("El segundo apellido ingresado es: " + capitalize(apellido2));
        }
    }

}


