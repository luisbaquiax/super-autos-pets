/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peleasanimales.manejadores;

import com.peleasanimales.Comida;
import com.peleasanimales.ComidaEnum;
import com.peleasanimales.Mascota;
import com.peleasanimales.Tier;
import com.peleasanimales.util.Constantes;

/**
 *
 * @author luis
 */
public class ManejadorTier {

    private Tier[] tieres;
    private ManejadorMascota manejadorMascota;

    private Mascota[] mascotasPorTier;

    public ManejadorTier() {
        this.manejadorMascota = new ManejadorMascota();
        this.mascotasPorTier = new Mascota[1];
    }

    public void generarTier() {
        this.tieres = new Tier[]{
            new Tier(Constantes.TIER_1, getMascotasTier(0, 7), new Comida[]{
                new Comida(ComidaEnum.MANZANA.toString()),
                new Comida(ComidaEnum.NARANJA.toString()),
                new Comida(ComidaEnum.MIEL.toString())},
            false),
            /**
             * tier 2
             */
            new Tier(Constantes.TIER_2, getMascotasTier(8, 15), new Comida[]{
                new Comida(ComidaEnum.PASTELITO.toString()),
                new Comida(ComidaEnum.HUESO_DE_CARNE.toString()),
                new Comida(ComidaEnum.PASTILLA_PARA_DORMIR.toString())}, true),
            /**
             * tier 3
             */
            new Tier(Constantes.TIER_3, getMascotasTier(16, 26), new Comida[]{
                new Comida(ComidaEnum.AJO.toString()),
                new Comida(ComidaEnum.ENSALADA.toString()),
                new Comida(ComidaEnum.COMIDA_ENLATADA.toString()),
                new Comida(ComidaEnum.PERA.toString())}, true),
            /**
             * tier 4
             */
            new Tier(Constantes.TIER_4, getMascotasTier(27, 34), new Comida[]{
                new Comida(ComidaEnum.CHILE.toString()),
                new Comida(ComidaEnum.CHOCOLATE.toString()),
                new Comida(ComidaEnum.SUSHI.toString())}, true),
            /**
             * tier 5
             */
            new Tier(Constantes.TIER_5, getMascotasTier(35, 42), new Comida[]{
                new Comida(ComidaEnum.MELON.toString()),
                new Comida(ComidaEnum.HONGO.toString())}, true),
            /**
             * tier 6
             */
            new Tier(Constantes.TIER_6, getMascotasTier(43, 51), new Comida[]{
                new Comida(ComidaEnum.PIZZA.toString()),
                new Comida(ComidaEnum.CARNE.toString())}, true),
            /**
             * tier 7
             */
            new Tier(Constantes.TIER_7, getMascotasTier(52, 53), new Comida[]{
                new Comida(ComidaEnum.GELATINA.toString())}, true)};
    }

    /**
     * Sirve para darle los mascotas correspondientes a un Tier en específico
     *
     * @param inicio
     * @param indiceFinal
     * @return
     */
    private Mascota[] getMascotasTier(int inicio, int indiceFinal) {
        int maximo = indiceFinal - inicio;
        Mascota[] mascotas = new Mascota[maximo + 1];
        for (int i = inicio; i <= indiceFinal; i++) {
            this.manejadorMascota.agregarMascota(this.manejadorMascota.getMascotas()[i], mascotas);
        }
        return mascotas;
    }

    /**
     *
     * @param mascotas
     */
    public void agregarMascotaParaMostrarEnTienda(Mascota[] mascotas) {
        for (int i = 0; i < mascotas.length; i++) {
            if (!hayEspacio(mascotasPorTier)) {
                redimensionarMascotarPorTier();
            }
            for (int j = 0; j < mascotasPorTier.length; j++) {
                if (mascotasPorTier[j] == null) {
                    mascotasPorTier[j] = mascotas[i];
                    break;
                }
            }
        }

    }

    private void redimensionarMascotarPorTier() {
        Mascota[] mascotasR = new Mascota[mascotasPorTier.length + 1];
        System.arraycopy(mascotasPorTier, 0, mascotasR, 0, mascotasPorTier.length);
        mascotasPorTier = mascotasR;
    }

    private boolean hayEspacio(Mascota[] mascotas) {
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i] == null) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return
     */
    public Tier[] getTieres() {
        return tieres;
    }

    /**
     *
     * @return
     */
    public Mascota[] getMascotasPorTier() {
        return mascotasPorTier;
    }

}
