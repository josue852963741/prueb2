/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.semana2.tarea2;

import java.util.Scanner;

/**
 *
 * @author Josue Garcia
 */
public class ejercicio7 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int n1, n2, n3, media;
        System.out.print("Ingrese la nota del curso de Matematica: "); n1 = s.nextInt();
        System.out.print("Ingrese la nota del curso de Programacion: "); n2 = s.nextInt();
        System.out.print("Ingrese la nota del curso de Fisica: "); n3 = s.nextInt();
        media = (n1 + n2 + n3)/3;
        System.out.println("La media es: " + media);
    }
    
}
