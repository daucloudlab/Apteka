package kz.abcsoft.apteka.testdata;

import java.util.ArrayList;

import kz.abcsoft.apteka.modle.Medikament;

/**
 * Created by daulet on 6/4/15.
 */
public class MedikamentTestList {
    private static ArrayList<Medikament> medikaments ;

    public static ArrayList<Medikament> getMedikaments(){
        medikaments = new ArrayList<Medikament>() ;

        Medikament medikament1 = new Medikament("Адвантан", "1% мазь", 1200) ;
        medikaments.add(medikament1) ;

        Medikament medikament2 = new Medikament("Тетрациклин", "1% мазь", 700) ;
        medikaments.add(medikament2) ;

        Medikament medikament3 = new Medikament("Проспан", "Сироп", 1600) ;
        medikaments.add(medikament3) ;

        Medikament medikament4 = new Medikament("Тетрациклин", "Таблетки", 930) ;
        medikaments.add(medikament4) ;

        return medikaments ;
    }


}
