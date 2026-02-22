package com.ioc.metier;

import com.ioc.dao.IDao;

public class MetierImpl implements Imetier{

    private IDao dao ;

    public MetierImpl(IDao dao){
        this.dao = dao;
    }

    @Override
    public double calcul(){
        double t = dao.getData();
        return t*43/3;
    }
}
