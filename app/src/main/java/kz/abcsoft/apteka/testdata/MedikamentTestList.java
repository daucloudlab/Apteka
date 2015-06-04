package kz.abcsoft.apteka.testdata;

import android.provider.MediaStore;

import java.util.ArrayList;

import kz.abcsoft.apteka.modle.Medikament;

/**
 * Created by daulet on 6/4/15.
 */
public class MedikamentTestList {
    private static final int LEKARSTV_PREPERAT = 1 ;
    private static final int TRAVY_FITO_CHAI = 2 ;
    private static final int DOBAVKI_VITAMINY = 3 ;
    private static final int INTIM_ZDOROVIE = 4 ;
    private static final int MEDTECHNIKA = 5 ;
    private static final int MAM_DETEY = 6 ;
    private static final int KRASOTA_UXOD = 7 ;
    private static final int RAZNOE = 8 ;


    private static ArrayList<Medikament> allMedikaments ;
    private static ArrayList<Medikament> aptekaMedikaments ;


    public static ArrayList<Medikament> getAllMedikaments(){
        allMedikaments = new ArrayList<Medikament>() ;

        Medikament medikament1 = new Medikament(1, LEKARSTV_PREPERAT, "Адвантан", "1% мазь", 1200) ;
        allMedikaments.add(medikament1) ;

        Medikament medikament2 = new Medikament(1, LEKARSTV_PREPERAT, "Тетрациклин", "1% мазь", 700) ;
        allMedikaments.add(medikament2) ;

        Medikament medikament3 = new Medikament(2, MAM_DETEY, "Проспан", "Сироп", 1600) ;
        allMedikaments.add(medikament3) ;

        Medikament medikament4 = new Medikament(3, LEKARSTV_PREPERAT, "Тетрациклин", "Таблетки", 930) ;
        allMedikaments.add(medikament4) ;

        return allMedikaments ;
    }

    public static ArrayList<Medikament> getAptekaMedikaments(int id){
        aptekaMedikaments = new ArrayList<Medikament>() ;

        for(Medikament m : getAllMedikaments()){
            if(m.getAid() == id){
                aptekaMedikaments.add(m) ;
            }
        }
        return aptekaMedikaments ;
    }

    public static ArrayList<Medikament> getAptekaMedikamentsByCategory1(ArrayList<Medikament> medikaments){
        ArrayList<Medikament> temp = new ArrayList<Medikament>() ;

        for(Medikament m : medikaments){
            if(m.getCid() == LEKARSTV_PREPERAT){
                temp.add(m) ;
            }
        }
        return temp ;
    }

    public static ArrayList<Medikament> getAptekaMedikamentsByCategory2(ArrayList<Medikament> medikaments){
        ArrayList<Medikament> temp = new ArrayList<Medikament>() ;

        for(Medikament m : medikaments){
            if(m.getCid() == TRAVY_FITO_CHAI){
                temp.add(m) ;
            }
        }
        return temp ;
    }

    public static ArrayList<Medikament> getAptekaMedikamentsByCategory3(ArrayList<Medikament> medikaments){
        ArrayList<Medikament> temp = new ArrayList<Medikament>() ;

        for(Medikament m : medikaments){
            if(m.getCid() == DOBAVKI_VITAMINY){
                temp.add(m) ;
            }
        }
        return temp ;
    }

    public static ArrayList<Medikament> getAptekaMedikamentsByCategory4(ArrayList<Medikament> medikaments){
        ArrayList<Medikament> temp = new ArrayList<Medikament>() ;

        for(Medikament m : medikaments){
            if(m.getCid() == INTIM_ZDOROVIE){
                temp.add(m) ;
            }
        }
        return temp ;
    }

    public static ArrayList<Medikament> getAptekaMedikamentsByCategory5(ArrayList<Medikament> medikaments){
        ArrayList<Medikament> temp = new ArrayList<Medikament>() ;

        for(Medikament m : medikaments){
            if(m.getCid() == MEDTECHNIKA){
                temp.add(m) ;
            }
        }
        return temp ;
    }

    public static ArrayList<Medikament> getAptekaMedikamentsByCategory6(ArrayList<Medikament> medikaments){
        ArrayList<Medikament> temp = new ArrayList<Medikament>() ;

        for(Medikament m : medikaments){
            if(m.getCid() == MAM_DETEY){
                temp.add(m) ;
            }
        }
        return temp ;
    }

    public static ArrayList<Medikament> getAptekaMedikamentsByCategory7(ArrayList<Medikament> medikaments){
        ArrayList<Medikament> temp = new ArrayList<Medikament>() ;

        for(Medikament m : medikaments){
            if(m.getCid() == KRASOTA_UXOD){
                temp.add(m) ;
            }
        }
        return temp ;
    }

    public static ArrayList<Medikament> getAptekaMedikamentsByCategory8(ArrayList<Medikament> medikaments){
        ArrayList<Medikament> temp = new ArrayList<Medikament>() ;

        for(Medikament m : medikaments){
            if(m.getCid() == RAZNOE){
                temp.add(m) ;
            }
        }
        return temp ;
    }


}
