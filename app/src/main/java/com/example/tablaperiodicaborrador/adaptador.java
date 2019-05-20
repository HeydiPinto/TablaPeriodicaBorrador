package com.example.tablaperiodicaborrador;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class adaptador extends RecyclerView.Adapter<adaptador.ViewHolderDatos> {

    ArrayList<String> ListaDatos;

    public adaptador(ArrayList<String> listaDatos) {
        ListaDatos = listaDatos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos viewHolderDatos, int i) {

    }

    @Override
    public int getItemCount()   {
        return 0;
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        ListView dato;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);

            dato=itemView.findViewById(R.id.idDato);

        }
    }
}
