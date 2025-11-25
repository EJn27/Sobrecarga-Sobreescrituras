
package com.espe.edu.sobrecarga;

public class Sobrecarga {

    public static void main(String[] args) {
        
        Calculadora resultado = new Calculadora();
        
        System.out.println(resultado.sumar(5, 10));
        System.out.println(resultado.sumar(3.5, 2.5));
        System.out.println(resultado.sumar(2, 4, 6));
        
    }
}
