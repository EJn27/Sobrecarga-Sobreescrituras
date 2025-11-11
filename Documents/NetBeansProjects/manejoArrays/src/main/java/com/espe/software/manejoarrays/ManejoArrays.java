/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.manejoarrays;


import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author labesp
 */
import java.util.Arrays;
public class ManejoArrays {

    public static void main(String[] args) {
        double[] myArrayDouble = new double[3];
        myArrayDouble[0]=5.0;
        myArrayDouble[1]=4.1;
        myArrayDouble[2]=3.9;
        
        //Acceso a los elementos a través del indice
        
        
        for (int i=0;i<1;i++)
        {
            System.out.println(myArrayDouble[0]);
            System.out.println(myArrayDouble[1]);
            System.out.println(myArrayDouble[2]);
        }
        
        for (double arry: myArrayDouble)
        {
            System.out.println(arry);
        }
        System.out.println("");
        
        //Inicialización en una sola línea
        
        int[] primos = {2,3,5,7,11,13,17,19};
        for(int i=0;i<primos.length;i++)
        {
            System.out.println(primos[i]);
        }
        
        for (int pri : primos )
        {
            System.out.println(pri);
        }
        //Arreglo de cadenas
        
        String[] lenguajes = {"Java","C++","Phyton"};
        for (String len : lenguajes)
        {
            System.out.println(len);
        }
        
        
        Cliente2[] clientes = {new Cliente2("Brandon"), new Cliente2("Betsy")};
        for (int i=0; i<clientes.length;i++)
        {
            System.out.println(clientes[i].getNombre());
        }
        
        for(Cliente2 cli : clientes)
        {
            System.out.println("Nombre del cliente: "+cli.getNombre());
        }
        
        int[] notas = new int[5];
        for(int n : notas)
        {
            System.out.println(n);
        }
        
        //Copia
        int [] c ={1,2,3};
        int [] d = new int [c.length];
        
        d=c;
        d[0]=9;
        c[2]=5;
        
        System.out.println(c[0]);
        System.out.println(d[2]);
        
        //Clonacion
        
        int[] a = {1,8,3};
        
        int[] b = a.clone();
        
        System.out.println(a==b);
        
        System.out.println(Arrays.equals(a,b));
        
        
        
        //Arrays de Arrays
        
        int[][] tabla = new int[3][2];
        int cont =1;
        
        for(int i=0;i<tabla.length;i++)
        {
            for (int j=0;j<tabla[i].length;j++)
            {
                tabla[i][j]=cont++;
            }
        }
        for(int i=0;i<tabla.length;i++)
        {
            for (int j=0;j<tabla[i].length;j++)
            {
               System.out.println(tabla[i][j]);
            }
        }
        
        int[][] tabla2 = {
            {1,2},
            {3,4},
            {5,6}
        };
        
        System.out.println(Arrays.deepEquals(tabla, tabla2));
        
         //Ejercicio ArrayList
        System.out.println("Ejercicio ArrayList");
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(23);
        scores.add(15);
        scores.add(0);
        System.out.println("El tamano del array es de : "+scores.size());
        for(int e :scores)
        {
            System.out.println(e);
        }
        scores.remove((Integer)15);
        System.out.println("El tamano del array es de : "+scores.size());
        for(int e:scores)
        {
            System.out.println(e);
        }
        
        //Ejemplo 2 arrayList
        
        ArrayList<Cliente2> clientes1 = new ArrayList<>();
        clientes1.add(new Cliente2 ("Carlos"));
        clientes1.add(new Cliente2 ("Mary"));
        clientes1.add(new Cliente2 ("Juan"));
        for (Cliente2 cli: clientes1)
        {
            System.out.println(cli);
        }
    }
    
}
