package com.ioc.pres;

import com.ioc.dao.IDao;
import com.ioc.metier.Imetier;
import com.ioc.metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2 {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

    // creation du objet Dao

        // lire le fichier
        Scanner sc  = new Scanner(new File("config.txt"));

        // lire class name
        String daoClassName = sc.nextLine();

        // charger la class en memoire
        Class cDao = Class.forName(daoClassName);

        // creer un objet de class
        // newInstance() : equivalent a constructeur sans parametre => object(IDao)
        IDao dao = (IDao) cDao.newInstance();


     // creation du objet metier

        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        Imetier metier = (Imetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        // getConstructor(IDao.class) == cherche un constructeur qui recoit un objet de type IDao

        System.out.println(metier.calcul());




    }
}
