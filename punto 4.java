import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        // Escribe un programa que determine si aprobo o desaprobo
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nota");
        int calificacion = leer.nextInt();
       
        //Empleando terniario
        String calificacion = (calificacion >=60) ? "aprobado" : "reprobado";
        System.out.println(calificacion);
                //Con if else
        String calificacion = "";
        if (calificacion >=60) {
        calificacion = "aprobado";
        } else {
        calificacion = "reprobado";
        }
        System.out.println(calificacion);
        //Con if else if
        String calificacion = "";
        if (calificacion >= 60) {
        calificacion = "aprobado";
        } else if (calificacion <= 60) {
        calificacion = "reprobado";
        }
        System.out.println(calificacion);
