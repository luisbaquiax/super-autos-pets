/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peleasanimales.manejadores;

import com.peleasanimales.Mascota;
import com.peleasanimales.TipoEnum;
import com.peleasanimales.util.Constantes;
import static java.lang.System.arraycopy;

/**
 *
 * @author luis
 */
public class ManejadorMascota {

    private Mascota[] mascotas;
    private Mascota[] mascotasTier;

    public ManejadorMascota() {
        iniciarMascotas();
    }

    private void iniciarMascotas() {
        this.mascotas = new Mascota[]{
            /**
             * tier 1
             */
            new Mascota("Hormiga", 2, 1, 1, new String[]{TipoEnum.INSECTO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_1),
            new Mascota("Pescado", 2, 3, 1, new String[]{TipoEnum.ACUATICO.toString()},
            Constantes.TIER_1),
            new Mascota("Mosquito", 2, 2, 1, new String[]{TipoEnum.VOLADOR.toString()},
            Constantes.TIER_1),
            new Mascota("Grillo", 1, 2, 1, new String[]{TipoEnum.INSECTO.toString()},
            Constantes.TIER_1),
            new Mascota("Castor", 2, 2, 1, new String[]{TipoEnum.ACUATICO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_1),
            new Mascota("Caballo", 2, 1, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.DOMESTICO.toString()},
            Constantes.TIER_1),
            new Mascota("Nutria", 2, 3, 1, new String[]{TipoEnum.MAMIFERO.toString()},
            Constantes.TIER_1),
            new Mascota("Escarabajo", 2, 1, 1, new String[]{TipoEnum.INSECTO.toString()},
            Constantes.TIER_1),
            /**
             * tier 2
             */
            new Mascota("Sapo", 3, 3, 1, new String[]{TipoEnum.ACUATICO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_2),
            new Mascota("Dodo", 2, 3, 1, new String[]{TipoEnum.VOLADOR.toString()},
            Constantes.TIER_2),
            new Mascota("Elefante", 3, 5, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_2),
            new Mascota("Puerco", 3, 2, 1, new String[]{TipoEnum.SOLITARIO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_2),
            new Mascota("Pavoreal", 2, 5, 1, new String[]{TipoEnum.DOMESTICO.toString(), TipoEnum.VOLADOR.toString()},
            Constantes.TIER_2),
            new Mascota("Rata", 4, 5, 1, new String[]{TipoEnum.SOLITARIO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_2),
            new Mascota("Zorro", 5, 2, 1, new String[]{TipoEnum.SOLITARIO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_2),
            new Mascota("Araña", 2, 3, 1, new String[]{TipoEnum.INSECTO.toString()},
            Constantes.TIER_2),
            /**
             * tier 3
             */
            new Mascota("Camello", 2, 5, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.DESERTICO.toString()},
            Constantes.TIER_3),
            new Mascota("Mapache", 5, 4, 1, new String[]{TipoEnum.SOLITARIO.toString()},
            Constantes.TIER_3),
            new Mascota("Jirafa", 2, 5, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_3),
            new Mascota("Tortuga", 1, 2, 1, new String[]{TipoEnum.REPTIL.toString()},
            Constantes.TIER_3),
            new Mascota("Caracol", 2, 2, 1, new String[]{TipoEnum.INSECTO.toString(), TipoEnum.SOLITARIO.toString()},
            Constantes.TIER_3),
            new Mascota("Oveja", 2, 2, 1, new String[]{TipoEnum.DOMESTICO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_3),
            new Mascota("Conejo", 3, 2, 1, new String[]{TipoEnum.MAMIFERO.toString()},
            Constantes.TIER_3),
            new Mascota("Lobo", 3, 4, 1, new String[]{TipoEnum.SOLITARIO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_3),
            new Mascota("Buey", 1, 4, 1, new String[]{TipoEnum.MAMIFERO.toString()},
            Constantes.TIER_3),
            new Mascota("Canguro", 1, 2, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_3),
            new Mascota("Buho", 5, 3, 1, new String[]{TipoEnum.SOLITARIO.toString(), TipoEnum.VOLADOR.toString()},
            Constantes.TIER_3),
            /**
             * tier 4
             */
            new Mascota("Venado", 1, 1, 1, new String[]{TipoEnum.MAMIFERO.toString()},
            Constantes.TIER_4),
            new Mascota("Loro", 5, 3, 1, new String[]{TipoEnum.VOLADOR.toString()},
            Constantes.TIER_4),
            new Mascota("Hipopótamo", 4, 7, 1, new String[]{TipoEnum.ACUATICO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_4),
            new Mascota("Delfín", 4, 6, 1, new String[]{TipoEnum.ACUATICO.toString()},
            Constantes.TIER_4),
            new Mascota("Puma", 3, 7, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_4),
            new Mascota("Ballena", 3, 8, 1, new String[]{TipoEnum.ACUATICO.toString()},
            Constantes.TIER_4),
            new Mascota("Ardilla", 1, 2, 1, new String[]{TipoEnum.DOMESTICO.toString()},
            Constantes.TIER_4),
            new Mascota("Llama", 3, 6, 1, new String[]{TipoEnum.TERRESTRE.toString(), TipoEnum.VOLADOR.toString()},
            Constantes.TIER_4),
            /*
             * tier 5
             */
            new Mascota("Foca", 3, 8, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.ACUATICO.toString()},
            Constantes.TIER_5),
            new Mascota("Jaguar", 7, 4, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_5),
            new Mascota("Escorpión", 1, 1, 1, new String[]{TipoEnum.DESERTICO.toString(), TipoEnum.SOLITARIO.toString()},
            Constantes.TIER_5),
            new Mascota("Rinoceronte", 5, 8, 1, new String[]{TipoEnum.DESERTICO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_5),
            new Mascota("Mono", 1, 2, 1, new String[]{TipoEnum.MAMIFERO.toString()},
            Constantes.TIER_5),
            new Mascota("Cocodrilo", 8, 4, 1, new String[]{TipoEnum.REPTIL.toString(), TipoEnum.SOLITARIO.toString()},
            Constantes.TIER_5),
            new Mascota("Vaca", 4, 6, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_5),
            new Mascota("Chompipe", 3, 4, 1, new String[]{TipoEnum.TERRESTRE.toString(), TipoEnum.VOLADOR.toString()},
            Constantes.TIER_5),
            /**
             * tier 6
             */
            new Mascota("Panda", 5, 5, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.SOLITARIO.toString()},
            Constantes.TIER_6),
            new Mascota("Gato", 4, 5, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.DOMESTICO.toString()},
            Constantes.TIER_6),
            new Mascota("Tigre", 4, 3, 1, new String[]{TipoEnum.TERRESTRE.toString(), TipoEnum.MAMIFERO.toString()},
            Constantes.TIER_6),
            new Mascota("Serpiente", 6, 6, 1,
            new String[]{TipoEnum.DESERTICO.toString(), TipoEnum.TERRESTRE.toString(), TipoEnum.REPTIL.toString()},
            Constantes.TIER_6),
            new Mascota("Mamut", 3, 10, 1,
            new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.TERRESTRE.toString(), TipoEnum.SOLITARIO.toString()},
            Constantes.TIER_6),
            new Mascota("leopardo", 10, 4, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_6),
            new Mascota("Gorila", 6, 9, 1, new String[]{TipoEnum.MAMIFERO.toString(), TipoEnum.TERRESTRE.toString()},
            Constantes.TIER_6),
            new Mascota("Pulpo", 8, 8, 1, new String[]{TipoEnum.ACUATICO.toString(), TipoEnum.SOLITARIO.toString()},
            Constantes.TIER_6),
            new Mascota("Mosca", 5, 5, 1, new String[]{TipoEnum.VOLADOR.toString(), TipoEnum.INSECTO.toString()},
            Constantes.TIER_6),
            /**
             * tier 7
             */
            new Mascota("Quetzal", 10, 10, 1, new String[]{TipoEnum.VOLADOR.toString(), TipoEnum.SOLITARIO.toString()},
            Constantes.TIER_7),
            new Mascota("Camaleón", 8, 8, 1, new String[]{TipoEnum.REPTIL.toString(), TipoEnum.SOLITARIO.toString()},
            Constantes.TIER_7)};
    }

    /**
     * Agrega una mascota a las lista de mascotas que se le envia por parametro
     *
     * @param mascotaNueva
     * @param mascotas
     */
    public void agregarMascota(Mascota mascotaNueva, Mascota[] mascotas) {
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i] == null) {
                mascotas[i] = mascotaNueva;
                break;
            }
        }
    }

    /**
     * Elimina una mascota en base a su nombre, servirá para que el jugador
     * pueda vender su mascota
     *
     * @param mascotaEliminado
     * @param mascotas
     */
    public void eliminarMascota(Mascota mascotaEliminado, Mascota[] mascotas) {
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i].getNombre().equalsIgnoreCase(mascotaEliminado.getNombre())) {
                mascotas[i] = null;
                break;
            }
        }
    }

    /**
     * Agrega mascotas a una lista auxiliar para poder mostrar en la Tienda
     *
     * @param tier
     */
    public void agregarMascotaPorTier(int tier) {
        this.mascotasTier = new Mascota[1];
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i].getTierPerteneciente() <= tier) {
                if (!hayEspacio(mascotasTier)) {
                    redimensioarMascotasTier();
                }
                for (int j = 0; j < mascotasTier.length; j++) {

                    if (mascotasTier[j] == null) {
                        mascotasTier[j] = mascotas[i];
                        break;
                    }
                }
            }
        }

    }

    public Mascota buscarMascota(Mascota mascota) {
        for (int i = 0; i < mascotasTier.length; i++) {
            if (mascotasTier[i].equals(mascota)) {
                return mascotasTier[i];
            }
        }
        return null;
    }

    private void redimensioarMascotasTier() {
        Mascota[] auxi = new Mascota[mascotasTier.length + 1];
        arraycopy(mascotasTier, 0, auxi, 0, mascotasTier.length);
        mascotasTier = auxi;
    }

    private boolean hayEspacio(Mascota[] mascotas) {
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i] == null) {
                return true;
            }
        }
        return false;
    }

    public Mascota[] getMascotaPorTier() {
        return mascotasTier;
    }

    public Mascota[] getMascotas() {
        return mascotas;
    }

}
