package com.ioc.ext;

import com.ioc.dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData(){
        System.out.println("Version web capteur ...");
        return 41 ;
    }
}
