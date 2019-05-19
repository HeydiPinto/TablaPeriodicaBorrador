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
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=z6_hXIzSNoO8sAWAx6boDA&q=hidrogeno&oq=hidrogeno&gs_l=img.3..0l10.326769.329948..331041...0.0..0.187.1573.0j9......1....1..gws-wiz-img.......0i67.dQ_F93f3lEg#imgrc=trOaXZII9yhIzM:","1","H","Hidrogeno"}   ,
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=HLHhXOYpxd61BZLykxA&q=helio&oq=helio&gs_l=img.3..0i67l3j0j0i67l2j0l4.39333.40200..40530...0.0..0.568.795.2-1j5-1......1....1..gws-wiz-img.Wo0XjsRNR-4#imgrc=WGRVauLJv8tRDM:","2","He","Helio"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=R7HhXLSTFei7tgWA6pGIBg&q=carbono&oq=carbono&gs_l=img.3..0i67j0l4j0i67j0l2j0i67j0.28490.29775..30111...0.0..0.362.1423.0j5j1j1......1....1..gws-wiz-img.WLlJgPYZxAI#imgrc=A5fvfWZbdPz_TM:","6","C","Carbono"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=aLHhXJKTLdL8tAWKm6fwAw&q=nitrogeno&oq=nitr&gs_l=img.1.0.0i67j0j0i67j0j0i67j0l2j0i67j0j0i67.21858.28466..29942...0.0..0.239.820.0j2j2......3....1..gws-wiz-img.....0.x__rC1qIPWE#imgrc=iuaXhkHnrB_xmM:","7","N","Nitrogeno"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=iLHhXMuaPJC0tQXc043gAw&q=oxigeno&oq=oxigeno&gs_l=img.3..0i67j0j0i67j0j0i67j0l5.26681.28274..29196...0.0..0.307.1425.0j5j1j1......1....1..gws-wiz-img.JXSzmKkadDs#imgrc=BfUCIK0o8oRZeM:","8","O","Oxigeno"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=qrHhXIitCtHGsAXn_7Eo&q=fluor&oq=fluor&gs_l=img.3...187692.188527..189204...0.0..0.0.0.......1....1..gws-wiz-img.lFJYcx5_PDc#imgrc=AhfT1RY1h2RBkM:","9","F","Floúr"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=gLLhXKvMIJGUtQX51bKwAg&q=neon+elemento+quimico&oq=neon+ele&gs_l=img.1.0.0l9.3091.3618..4545...0.0..0.170.620.0j4......1....1..gws-wiz-img.......0i67.gdLEo1PFIAU#imgrc=bk-HNxLkBTj_pM:","10","Ne","Neón"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=hrLhXOz8BIySsAXQlJGoCg&q=fosforo+elemento+quimico&oq=fosforo+elemento+quimico&gs_l=img.3..0l3j0i5i30l4j0i24l3.18278.19620..19934...0.0..0.359.1636.0j3j2j2......1....1..gws-wiz-img.......0i7i30j0i7i10i30j0i7i5i30j0i8i7i30.Ocq7HwlFSgc#imgrc=5J2QK82UoXMZUM:","15","P","Forforo"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=mrLhXL_iO9CUtQXIuZDIBQ&q=azufre+elemento+quimico&oq=azufre+elemento+quimico&gs_l=img.3..0l2j0i5i30l2j0i8i30j0i24.20423.21493..21683...0.0..0.178.1002.0j6......1....1..gws-wiz-img.......0i7i30j0i7i5i30j0i8i7i30j0i10i24.toHkzCw7gZU#imgrc=3cFIg8pP0tGM3M:","16","S","Azufre"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=s7LhXN_YAdG1tgXeh4bQCg&q=cloro+elemento+quimico&oq=cloro+elemento+quimico&gs_l=img.3..0l4j0i7i30j0i5i30l2j0i30j0i24l2.17667.18190..18531...0.0..0.174.827.0j5......1....1..gws-wiz-img.mXMCASNk4XI#imgrc=cuxGQz9IcyN5xM:","17","Cl","Cloro"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=xrLhXM6nHoWAtQWx8afADQ&q=argon+elemento+quimico&oq=argon+elemento+quimico&gs_l=img.3..0j0i8i30j0i7i30j0i24.26688.27464..27746...0.0..0.169.824.0j5......1....1..gws-wiz-img.......0i7i5i30j0i8i7i30.mXyx51Gx8zQ#imgrc=sOZs_uDSRc94BM:","18","Ar","Argon"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=47LhXLG9E82wtgX_-YrYBg&q=selenio+elemento+quimico&oq=selenio+elemento+quimico&gs_l=img.3..0l2j0i5i30j0i24.16190.17067..17354...0.0..0.241.1558.2-7......1....1..gws-wiz-img.BGDg-ONelFo#imgrc=M0oh69tJtOp8AM:","34","Se","Selenio"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=9bLhXM-iOMTAsQWoqLPwAw&q=bromo+elemento+quimico&oq=bromo+elemento+quimico&gs_l=img.3..0l3j0i5i30.13960.16177..16439...1.0..0.271.1403.0j1j5......1....1..gws-wiz-img.......0i7i30j0i7i5i30j0i8i7i30.7S2452vlBRg#imgrc=FO9XSqxtbXGDuM:","35","Br","Bromo"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=B7PhXOybJ4mesQXuvr-4Bg&q=krypton+elemento+quimico&oq=kr+elemento+quimico&gs_l=img.1.1.0j0i7i30l2.20105.21969..23582...0.0..0.203.707.0j3j1......1....1..gws-wiz-img.......0i8i30j0i67j0i8i7i30.KYuK1xgAmJ8#imgrc=_PQbqlS_L9mdOM:","36","Kr","Kripton"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=ILPhXPiaKo2IsQXL6YWwCA&q=yodo+elemento+quimico&oq=yodo+elemento+quimico&gs_l=img.3..0l3j0i5i30l2j0i24.20795.21510..21840...0.0..0.174.646.0j4......1....1..gws-wiz-img.......0i7i30j0i7i5i30.e2QQ8OgSVpo#imgrc=4J-rgdyOOMKuUM:","53","I","Yodo"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=N7PhXIXWOIGwtQXxhoqACQ&q=xenon+elemento+quimico&oq=xenon+elemento+quimico&gs_l=img.3..0l2.24185.24857..25146...0.0..0.520.1455.0j2j1j0j1j1......1....1..gws-wiz-img.rtFQt919B-4#imgrc=Ons9r4POKcKs2M:","54","Xe","Xenon"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=UrPhXJfPDOGwtgX8zJ74CQ&q=astati+elemento+quimico&oq=astati+elemento+quimico&gs_l=img.3...50563.51446..51799...0.0..0.168.959.0j6......1....1..gws-wiz-img.......0i7i30j0i7i5i30.XiVx9Ku6SnA#imgrc=aY_lSySVRkfvFM:","85","At","Astato"},
            {"https://www.google.com/search?biw=1242&bih=603&tbm=isch&sa=1&ei=h7PhXICsBszktQWwhpSIDQ&q=radon+elemento+quimico&oq=radon+elemento+quimico&gs_l=img.3..0j0i24.143125.143909..144171...0.0..0.308.1024.0j4j0j1......1....1..gws-wiz-img.......0i7i30j0i7i5i30.cx1sS7FwPRU#imgrc=Aq1EqOTH3zB88M:","86","Rn","Radon"}
            
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
