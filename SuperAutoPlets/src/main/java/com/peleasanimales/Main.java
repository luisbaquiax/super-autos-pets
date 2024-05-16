/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peleasanimales;

import com.peleasanimales.manejadores.*;

/**
 *
 * @author luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManejadorMascota n = new ManejadorMascota();
        Tienda t = new Tienda(n);
        System.out.println(t.obtenerNumeroDeAnimalesAMostrar(8));
    }

}
