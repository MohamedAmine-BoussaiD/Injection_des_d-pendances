package com.ioc.pres;

import com.ioc.dao.DaoImpl;
import com.ioc.dao.IDao;
import com.ioc.metier.MetierImpl;
import org.w3c.dom.ls.LSOutput;

public class pres1 {


    public static void main(String[] args){
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);

        System.out.println("RES= " + metier.calcul());
    }


}
