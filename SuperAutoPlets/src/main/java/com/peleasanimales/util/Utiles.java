/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peleasanimales.util;

/**
 *
 * @author luis
 */
public class Utiles {



    /**
     * Genera números aleatorios entre los límites máximo y mínimo, estos dos
     * están incluidos
     *
     * @param minimo
     * @param maximo
     * @return
     */
    public static int generarNumroAleatorio(int minimo, int maximo) {

        return (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
    }
    
}
