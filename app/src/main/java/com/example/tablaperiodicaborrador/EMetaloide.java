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
public class EMetaloide extends Fragment {
    ListView listas;

    String[][] datos = {
            {"5","B","Boro"}   ,
            {"14","Si","Silicio"},
            {"32","G","Germanio"},
            {"33","As","Arsénico"},
            {"51","Sb","Antimonio"},
            {"52","Te","Telurio"},
            {"85","Po","Polonio"}
    };

    int [] datosImg = {R.drawable.bor, R.drawable.sili, R.drawable.germa, R.drawable.arse, R.drawable.antimon, R.drawable.telu, R.drawable.polonio};




    


    public EMetaloide() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_emetaloide, container, false);
    }

}
