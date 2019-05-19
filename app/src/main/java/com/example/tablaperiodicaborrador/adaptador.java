package com.example.tablaperiodicaborrador;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class adaptador  extends BaseAdapter{

    private static LayoutInflater inflater = null;

    String[][] datos;



    public adaptador(Context contexto, String[][] datos, int[] imagenes) {

        this.datos = datos;



        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.metaloide, null);
        ImageView imagen = (ImageView) vista.findViewById(R.id.mtimagen);
        TextView id = (TextView) vista.findViewById(R.id.mtid);
        TextView simbolo = (TextView) vista.findViewById(R.id.mtsimbolo);
        TextView nombre = (TextView) vista.findViewById(R.id.mtnombre);
        imagen.setImageResource(Integer.parseInt(datos[i][0]));
        id.setText(datos[i][1]);
        simbolo.setText(datos[i][2]);
        nombre.setText(datos[i][3]);

        return vista;

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}


