package codoAcodo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese nombre");
        String nombre = entrada.next();
        System.out.println("ingrese apellido");
        String apellido = entrada.next();
        System.out.println("imgrese edad");
        int edad = entrada.nextInt();
        System.out.println("ingrese Hobbie");
        String hobbie = entrada.next();
        
        System.out.println("Los datos ingresados: ");
        System.out.println("nombre : "+ nombre+", apellido: "+apellido+", edad: "+edad+", hobbie: "+hobbie);
        
    }
}
