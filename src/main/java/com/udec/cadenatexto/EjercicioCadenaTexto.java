/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cadenatexto;
import java.util.Scanner;
/**
 * En esta clase se encuentran los metodos para manipular la cadena de texto.
 * @author Cristian Perez
 */
public class EjercicioCadenaTexto {
    /**
     * Atributo que recibe la cadena de texto*/
    private String texto;
    /**
     * Vector que almacena los caracteres de la cadena de texto */
    private char[] cadenaTexto;
    /**
     * constructor de la clase.
     */
    public EjercicioCadenaTexto(){
        System.out.println("Bienvenido");
        System.out.println("Ingrese una cadena de texto:");
        recibirTexto();
        buscarLetra();
    }//cierre del constructor.
    
    /**
     * metodo para recibir la cadena de texto por teclado.
     */
    public void recibirTexto(){
        Scanner teclado=new Scanner(System.in);
        texto=teclado.nextLine();
        texto=texto.replace(" ","");
        cadenaTexto=texto.toCharArray();
    }//Cierre del metodo.
    
    /**
     * metodo para buscar la primera letra que no se repite en una cadena de texto.
     */
    public void buscarLetra(){
        char comparador;
        char letra=' ';
        int repetido=0,pos=0;
        do{ 
        comparador=cadenaTexto[pos];
        System.out.println("Analizando :"+comparador);      
        for (int i = 0; i < cadenaTexto.length; i++) {
            if (cadenaTexto[i]==comparador) {
                repetido=repetido+1;    
            }
        }
        if(repetido<2){ 
            if (letra==' ') {
                  letra=comparador;
                  System.out.println("La primer letra que no se repite es: "+letra);
            }else System.out.println("La primer letra que no se repite es: "+letra);   
        }else{
            if (letra!=' ') {
                  System.out.println("La primer letra que no se repite es: "+letra);
            }else System.out.println("La primer letra que no se repite es: ninguna");
        }   
        pos=pos+1;
        repetido=0;
      }while(pos!=cadenaTexto.length);
    }//Cierre del metodo.
}//Cierre de la clase.
