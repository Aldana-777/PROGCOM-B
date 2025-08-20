import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        // Escribe un programa que reciba un número e indique si es positivo.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int num = leer.nextInt();
       
        // empleando terniario
        String mensaje= (num > 0)?"Este numero es positivo ":"El numero es negativo ";
        System.out.print(mensaje);
        //con if else

        // con if else
        String mensaje2="";
        if (num>0){
            mensaje2="Este numero es positivo ";}
        else{
            mensaje2 = "Este numero es negativo ";}
        System.out.print(mensaje2);
        // Con if else if
       
        String mensaje3="";
        if (num>0){
            mensaje3="Este numero es positivo ";}
        else if (num<0){
            mensaje3="Este numero es negativo ";}
        System.out.print(mensaje3);
 }
}