package com.ioc.metier;

import com.ioc.dao.IDao;

public class MetierImpl implements Imetier{

    private IDao dao ; // couplage faible ==> depende d une interface

    // injection par constructeur ==> best practice
    public MetierImpl(IDao dao){
        this.dao = dao;
    }

    // no args constructor : afin dituliser l injection par setter
    public MetierImpl(){

    }

    // injection par setter
    // moin utiliser
    public void setDao(IDao dao){
        this.dao = dao ;
    }

    @Override
    public double calcul(){
        double t = dao.getData();
        return t*43/3;
    }
}
