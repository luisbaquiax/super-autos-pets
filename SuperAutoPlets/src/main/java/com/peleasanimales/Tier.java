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
public class Tier {

    private int numeroTier;
    private Mascota[] mascotasLiberadas;
    private Comida[] comidasLiberadas;
    private boolean bloqueado;

    public Tier(int numeroTier, Mascota[] mascotasLiberadas, Comida[] comidasLiberadas, boolean bloqueado) {
        this.numeroTier = numeroTier;
        this.mascotasLiberadas = mascotasLiberadas;
        this.comidasLiberadas = comidasLiberadas;
        this.bloqueado = bloqueado;
    }

    /**
     * @return the numeroTier
     */
    public int getNumeroTier() {
        return numeroTier;
    }

    /**
     * @param numeroTier the numeroTier to set
     */
    public void setNumeroTier(int numeroTier) {
        this.numeroTier = numeroTier;
    }

    /**
     * @return the mascotasLiberadas
     */
    public Mascota[] getMascotasLiberadas() {
        return mascotasLiberadas;
    }

    /**
     * @param mascotasLiberadas the mascotasLiberadas to set
     */
    public void setMascotasLiberadas(Mascota[] mascotasLiberadas) {
        this.mascotasLiberadas = mascotasLiberadas;
    }

    /**
     * @return the comidasLiberadas
     */
    public Comida[] getComidasLiberadas() {
        return comidasLiberadas;
    }

    /**
     * @param comidasLiberadas the comidasLiberadas to set
     */
    public void setComidasLiberadas(Comida[] comidasLiberadas) {
        this.comidasLiberadas = comidasLiberadas;
    }

    /**
     * @return the bloqueado
     */
    public boolean isBloqueado() {
        return bloqueado;
    }

    /**
     * @param bloqueado the bloqueado to set
     */
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

}
