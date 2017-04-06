package com.example.rcossich.petagramrce.restApi.model;

import com.example.rcossich.petagramrce.modelo.MascotaInstagram;

import java.util.ArrayList;

/**
 * Created by rcossich on 29/03/2017.
 */

public class MascotaResponse {

    ArrayList<MascotaInstagram> mascotas;

    public ArrayList<MascotaInstagram> getMascotas() { return mascotas; }

    public void setMascotas(ArrayList<MascotaInstagram> mascotas) { this.mascotas = mascotas; }
}
