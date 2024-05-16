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
public class Mascota {

    private String nombre;
    private double unidadesAtaque;
    private double unidadesVida;
    private int nivel;
    private String[] tipos;
    private int tierPerteneciente;

    /**
     * Create a new Mascota
     *
     * @param nombre
     * @param unidadesAtaque
     * @param unidadesVida
     * @param nivel
     * @param tipos
     * @param tierPerteneciente
     */
    public Mascota(String nombre, double unidadesAtaque, double unidadesVida, int nivel, String[] tipos, int tierPerteneciente) {
        this.nombre = nombre;
        this.unidadesAtaque = unidadesAtaque;
        this.unidadesVida = unidadesVida;
        this.nivel = nivel;
        this.tipos = tipos;
        this.tierPerteneciente = tierPerteneciente;
    }

    @Override
    public String toString() {
        return "Mascota["
                + "nombre:" + nombre
                + ", unidadesAtaque:" + unidadesAtaque
                + ", unidadesVida:" + unidadesVida
                + ", nivel:" + nivel
                + ", tipos:" + tiposString()
                + ", TIERS:"
                + tierPerteneciente + '}';
    }

    public String tiposString() {
        String tip = "";
        for (int i = 0; i < tipos.length; i++) {
            tip += tipos[i] + "/";
        }
        return tip;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the unidadesAtaque
     */
    public double getUnidadesAtaque() {
        return unidadesAtaque;
    }

    /**
     * @param unidadesAtaque the unidadesAtaque to set
     */
    public void setUnidadesAtaque(double unidadesAtaque) {
        this.unidadesAtaque = unidadesAtaque;
    }

    /**
     * @return the unidadesVida
     */
    public double getUnidadesVida() {
        return unidadesVida;
    }

    /**
     * @param unidadesVida the unidadesVida to set
     */
    public void setUnidadesVida(double unidadesVida) {
        this.unidadesVida = unidadesVida;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the tipos
     */
    public String[] getTipos() {
        return tipos;
    }

    /**
     * @param tipos the tipos to set
     */
    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    /**
     * @return the tierPerteneciente
     */
    public int getTierPerteneciente() {
        return tierPerteneciente;
    }

    /**
     * @param tierPerteneciente the tierPerteneciente to set
     */
    public void setTierPerteneciente(int tierPerteneciente) {
        this.tierPerteneciente = tierPerteneciente;
    }

}
