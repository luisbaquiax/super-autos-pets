/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peleasanimales;

import com.peleasanimales.manejadores.ManejadorMascota;
import com.peleasanimales.manejadores.ManejadorTier;
import com.peleasanimales.util.Constantes;

/**
 *
 * @author luis
 */
public class Tienda {

    private ManejadorTier manejadorTier;
    private ManejadorMascota manejadorMascota;
    private Mascota[] mascotasMostrar;

    public Tienda(ManejadorMascota manejadorMascota) {
        this.manejadorTier = new ManejadorTier();
        this.manejadorMascota = manejadorMascota;
    }

    /**
     *
     * @param numeroRonda
     */
    private void llenarMascotasAmostrar(int numeroRonda) {
        this.mascotasMostrar = new Mascota[obtenerNumeroDeAnimalesAMostrar(numeroRonda)];

        for (int i = 0; i < mascotasMostrar.length; i++) {
            Mascota mascota = mascotasMostrar[i];
        }
    }

    private Mascota[] getMascotasAmostrar() {
        return this.mascotasMostrar;
    }

    private Mascota[] getMascotarPorTier(int tier) {
        this.manejadorMascota.agregarMascotaPorTier(tier);
        return this.manejadorMascota.getMascotaPorTier();
    }

    /**
     *
     * @param numeroRonda
     * @return
     */
    public int obtenerNumeroDeAnimalesAMostrar(int numeroRonda) {
        int ronda = 0;
        switch (numeroRonda) {
            case 1:
            case 2:
            case 3:
                ronda = Constantes.ANIMALES_3;
                break;
            case 4:
            case 5:
            case 6:
                ronda = Constantes.ANIMALES_4;
                break;
            default:
                ronda = Constantes.ANIMALES_5;
        }
        return ronda;
    }
}
