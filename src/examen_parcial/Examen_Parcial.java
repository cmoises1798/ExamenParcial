/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_parcial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Examen_Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando un objeto Scanner
        Scanner input=new Scanner(System.in);
       
        System.out.println("EXAMEN PARCIAL");
        System.out.println("Moises Cabello");
        System.out.println("");
        System.out.println("Telefonos Moviles Disponibles: ");
        System.out.println(" 1  Samsung S7.");
        System.out.println(" 2  HTC A9.");
        System.out.println(" 3  Huawei P8.");
        System.out.println("");
        System.out.print("Seleccione un modelo de telefono: ");
        
        int opcion = input.nextInt();
        
        if (opcion == 1){
            
            System.out.println("Pantalla     : 4.7'   ");
            System.out.println("Camara       : 8 Mp ");
            System.out.println("Procesador   : 1.4 Ghz QuadCore ");
            System.out.println("");
        }
        if (opcion == 2){
            
            System.out.println("Pantalla     : 6.7' ");
            System.out.println("Camara       : 16 Mp ");
            System.out.println("Procesador   : 3.6 Ghz ARX  ");
            System.out.println("");
        }
        if (opcion == 3){
            
            System.out.println("Pantalla     : 5'   ");
            System.out.println("Camara       : 13 Mp ");
            System.out.println("Procesador   : 2.4 Ghz Snapdragon ");
            System.out.println("");
        }
       
       System.out.println("Operadoras Disponibles");
       System.out.println(" 1 Claro");
       System.out.println(" 2 Movistar");
       System.out.println(" 3 Entel");
       System.out.println("");
       
      System.out.print("Selecciona Operadora para vizualizar los planes: ");
      int opcion2 = input.nextInt();
        
        if (opcion2 == 1){
            
            System.out.println("PLAN CLARO MAX 99 ");
            System.out.println("Precio    : 99 $ ");
            System.out.println("Minutos   : Ilimitado ");
            System.out.println("Internet  : 6 Gb ");
            System.out.println("SMS       : Ilimitado");
            System.out.println("RPC Ilimitado");
        }
        if (opcion2 == 2){
            
            System.out.println("PLAN MOVISTAR MAX 101 ");
            System.out.println("Precio    : 101 $ ");
            System.out.println("Minutos   : Ilimitado ");
            System.out.println("Internet  : 7 Gb (4g Ilimitado)");
            System.out.println("SMS       : Ilimitado");
            System.out.println("RPM Ilimitado");
        }
        if (opcion2 == 3){
            
            System.out.println("PLAN ENTEL PLUS 89 ");
            System.out.println("Precio    : 89 $ ");
            System.out.println("Minutos   : Ilimitado");
            System.out.println("Internet  : 10 Gb ");
            System.out.println("SMS       : Ilimitado");
            System.out.println("Redes Sociles Ilimitadas");
        }
    
        //System.out.println("Su crompra es: ");
    
    
        
            
            

        

       
        
    
    

