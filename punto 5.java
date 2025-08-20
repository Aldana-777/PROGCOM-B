import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        // Escribe un programa que determine si un número es par o impar.
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = leer.nextInt();

       
        // empleando terniario
        String mensaje= (numero %2 == 0)?"Este numero es par ":"El numero es inpar ";
        System.out.print(mensaje);
        //con if else
       
        String mensaje2="";
        if (numero %2 == 0){
            mensaje2="Este numero es par ";}
        else{
            mensaje2 = "Este numero es inpar ";}
        System.out.print(mensaje2);
        // Con if else if
       
        String mensaje3="";
        if (numero %2 == 0){
            mensaje3="Este numero es par ";}
        else if (numero %2 == 1){
            mensaje3="Este numero es inpar ";}
        System.out.print(mensaje3);
 }
}