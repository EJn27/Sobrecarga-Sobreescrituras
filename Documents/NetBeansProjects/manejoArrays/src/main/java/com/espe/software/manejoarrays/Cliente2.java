/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.manejoarrays;

/**
 *
 * @author labesp
 */
public class Cliente2 {
    
    private String nombre; 
    
    public Cliente2 (String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString()
    {
        return this.nombre;
    }
}
