import java.util.*;  
import java.lang.*;  
import java.io.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();

        //Empleando terniario
        String mensaje = (edad > 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(mensaje);
        //Con if else
        String mensaje2 = "";
        if (edad > 18) {
        mensaje2 = "Eres mayor de edad";
        } else {
        mensaje2 = "Eres menor de edad";
        }
        System.out.println(mensaje2);
        //Con if else if
        String mensaje3 = "";
        if (edad > 18) {
        mensaje3 = "Eres mayor de edad";
        } else if (edad < 18) {
        mensaje3 = "Eres menor de edad";
        }
        System.out.println(mensaje3);

    }
}