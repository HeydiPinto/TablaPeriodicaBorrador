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
            {"https://www.google.com/search?q=boro&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjpktyRp6jiAhXwwVkKHRAvAtoQ_AUIDigB&biw=1242&bih=603#imgrc=LCx1LMcTtGwrfM:","5","B","Boro"}   ,
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=c6vhXJKtCoyIggf1lo2oAg&q=silicio&oq=silicio&gs_l=img.3..0i67j0l2j0i67l2j0l2j0i67j0l2.424895.426619..427029...0.0..0.311.1434.0j2j2j2......1....1..gws-wiz-img.3gYwHd7YJLE#imgrc=06jXWOVL8zgTgM:","14","Si","Silicio"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=Iq3hXKnUCM70tAXS8azYCw&q=germnio&oq=germnio&gs_l=img.3..0i10i24.525868.526925..527998...0.0..0.696.1754.0j2j1j0j1j1......1....1..gws-wiz-img.......0i67j0j0i10.E725D4ypFOo#imgrc=Dc590G5c9ULqAM:","32","G","Germanio"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=Nq_hXLHHMYqctgX637ioBA&q=arsenico&oq=arsenico&gs_l=img.3..0l10.31569.33659..34459...0.0..1.438.3209.0j6j6j1j1......1....1..gws-wiz-img.....0.KC9T1ZrQAEQ#imgrc=mL2pzywMhlOaLM:","33","As","Arsénico"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=Wq_hXOvOOsKUtQXCm5TgCg&q=antimonio&oq=ant&gs_l=img.1.0.0i67j0j0i67j0l4j0i67j0l2.47329.48254..49548...0.0..0.182.352.0j2......1....1..gws-wiz-img.tCWt9JR-ZSU#imgrc=oCsrSS3t1ZByHM:","51","Sb","Antimonio"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=j6_hXK7sB8qIsQWD15uoAw&q=telurio&oq=telurio&gs_l=img.3..0l10.28668.30808..31341...1.0..0.285.1569.0j5j3......1....1..gws-wiz-img.......0i67j0i10i19j0i5i30i19.wYgOe78wemk#imgrc=1FX3D06xXFAwuM:","52","Te","Telurio"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=GLThXKTFKIHwsAXGxIPQDg&q=polonio+elemento+quimico&oq=polonio+elemento+quimico&gs_l=img.3..0j0i5i30j0i24l2.18338.19367..19746...0.0..0.587.2413.2-4j1j1j1......1....1..gws-wiz-img.XzVOJWrYOvU#imgrc=ja7MFugopBwMjM:","85","Po","Polonio"}
    };




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
