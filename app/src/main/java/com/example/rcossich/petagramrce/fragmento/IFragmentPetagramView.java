package com.example.rcossich.petagramrce.fragmento;


import com.example.rcossich.petagramrce.adaptador.MascotaAdaptador;
import com.example.rcossich.petagramrce.modelo.Mascota;

import java.util.ArrayList;

/**
 * Created by rcossich on 23/03/2017.
 */

public interface IFragmentPetagramView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
