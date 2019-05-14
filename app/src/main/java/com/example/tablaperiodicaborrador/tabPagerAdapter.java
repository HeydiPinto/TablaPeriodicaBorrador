package com.example.tablaperiodicaborrador;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class tabPagerAdapter extends FragmentStatePagerAdapter {


    String[] tabarray= new String[]{"Metales","No metales","Metaloides"};
    Integer tabNumber=3;

    public tabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                EMetal metal= new EMetal();
                return metal;
            case 1:
                ENometal Nometal= new ENometal();
                return Nometal;
            case 2:
                EMetaloide Metaloide= new EMetaloide();
                return Metaloide;

        }

        return null;
    }

    @Override
    public int getCount() {
        return tabNumber;
    }
}
