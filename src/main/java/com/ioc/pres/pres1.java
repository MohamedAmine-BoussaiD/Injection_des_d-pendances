package com.ioc.pres;

import com.ioc.dao.DaoImpl;
import com.ioc.dao.IDao;
import com.ioc.ext.DaoImplV2;
import com.ioc.metier.MetierImpl;
import org.w3c.dom.ls.LSOutput;

public class pres1 {


    public static void main(String[] args){

        /*
        couplage fort : si je veut utiliser la version capteur
                        je doit modifier la couch presenation

                        DaoImplV2 d = new DaoImplV2();
        */

        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);

        /*
        ou on utilisont l injection par setter

            DaoImpl d = new DaoImpl();
            MetierImpl metier = new MetierImpl();  no args const
            metier.setDao(d);
        */

        System.out.println("RES= " + metier.calcul());
    }


}
