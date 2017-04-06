package com.example.rcossich.petagramrce.fragmento;

import com.example.rcossich.petagramrce.adaptador.MascotaAdaptador4;
import com.example.rcossich.petagramrce.modelo.MascotaInstagram;

import java.util.ArrayList;

/**
 * Created by rcossich on 28/03/2017.
 */

public interface IFragmentMascotaView {

    public void generarGridLayout();

    public MascotaAdaptador4 crearAdaptador(ArrayList<MascotaInstagram> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador4 adaptador);

}
