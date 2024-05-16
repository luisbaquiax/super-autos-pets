/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peleasanimales;

/**
 *
 * @author luis
 */
public class Player {

    private String nikName;
    private int vidas;
    private int oro;
    private Mascota[] mascotas;

    public Player() {
    }

    /**
     *
     * @param nidkName
     * @param vidas
     * @param oro
     * @param mascotas
     */
    public Player(String nidkName, int vidas, int oro, Mascota[] mascotas) {
        this.nikName = nidkName;
        this.vidas = vidas;
        this.oro = oro;
        this.mascotas = mascotas;
    }

    /**
     * @return the nidkName
     */
    public String getNikName() {
        return nikName;
    }

    /**
     * @param nidkName the nidkName to set
     */
    public void setNikName
        (String nidkName) {
        this.nikName = nidkName;
    }

    /**
     * @return the vidas
     */
    public int getVidas() {
        return vidas;
    }

    /**
     * @param vidas the vidas to set
     */
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    /**
     * @return the oro
     */
    public int getOro() {
        return oro;
    }

    /**
     * @param oro the oro to set
     */
    public void setOro(int oro) {
        this.oro = oro;
    }

    /**
     * @return the mascotas
     */
    public Mascota[] getMascotas() {
        return mascotas;
    }

    /**
     * @param mascotas the mascotas to set
     */
    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }

}
