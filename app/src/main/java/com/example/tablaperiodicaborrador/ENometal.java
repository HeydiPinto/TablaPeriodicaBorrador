package com.example.tablaperiodicaborrador;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ENometal extends Fragment {
    ListView listas;

    String[][] datos = {
            {"1","H","Hidrogeno"}   ,
            {"2","He","Helio"},
            {"6","C","Carbono"},
            {"7","N","Nitrogeno"},
            {"8","O","Oxigeno"},
            {"9","F","Floúr"},
            {"10","Ne","Neón"},
            {"15","P","Forforo"},
            {"16","S","Azufre"},
            {"17","Cl","Cloro"},
            {"18","Ar","Argon"},
            {"34","Se","Selenio"},
            {"35","Br","Bromo"},
            {"36","Kr","Kripton"},
            {"53","I","Yodo"},
            {"54","Xe","Xenon"},
            {"85","At","Astato"},
            {"86","Rn","Radon"}
            
    };

    



    public ENometal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_enometal, container, false);
    }

}
