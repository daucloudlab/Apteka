package kz.abcsoft.apteka.testdata;

import java.util.ArrayList;

import kz.abcsoft.apteka.modle.Medikament;

/**
 * Created by daulet on 6/4/15.
 */
public class MedikamentTestList {
    private static ArrayList<Medikament> allMedikaments ;
    private static ArrayList<Medikament> aptekaMedikaments ;

    public static ArrayList<Medikament> getAllMedikaments(){
        allMedikaments = new ArrayList<Medikament>() ;

        Medikament medikament1 = new Medikament(1, "Адвантан", "1% мазь", 1200) ;
        allMedikaments.add(medikament1) ;

        Medikament medikament2 = new Medikament(1, "Тетрациклин", "1% мазь", 700) ;
        allMedikaments.add(medikament2) ;

        Medikament medikament3 = new Medikament(2, "Проспан", "Сироп", 1600) ;
        allMedikaments.add(medikament3) ;

        Medikament medikament4 = new Medikament(3, "Тетрациклин", "Таблетки", 930) ;
        allMedikaments.add(medikament4) ;

        return allMedikaments ;
    }

    public static ArrayList<Medikament> getAptekaMedikaments(int id){
        aptekaMedikaments = new ArrayList<Medikament>() ;

        for(Medikament m : getAllMedikaments()){
            if(m.getId() == id){
                aptekaMedikaments.add(m) ;
            }
        }
        return aptekaMedikaments ;
    }


}
