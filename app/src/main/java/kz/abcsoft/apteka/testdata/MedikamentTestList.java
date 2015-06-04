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

        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "ЭФФЕРЕЛГАН", "С витамином. Таблетки", 690)
        ) ;
        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "ЭФФЕРЕЛГАН", "90 мл Сироп", 804)
                ) ;
        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "ЭФФЕРЕЛГАН", "80 мг Свечи", 740)
                ) ;
        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "Эфизол", "Таблетки", 580)
                ) ;
        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "Эутирокс", "75 мг Таблетки", 695)
                ) ;
        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "Эутирокс", "50 мг Таблетки", 655)
                ) ;
        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "Этодин Форт", "400 мг Таблетки", 2255)
        ) ;
        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "Эуфиллин", "2.5% 5 мг Мазь", 655)
        ) ;
        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "Эссенциале форте H", "30 капсула", 1850)
        ) ;
        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "Эссенциале H", "5 ампул по 5 мл", 3492)
        ) ;
        allMedikaments.add(
                new Medikament(0, LEKARSTV_PREPERAT, "Эсрумизан", "25 капсул", 545)
        ) ;
        allMedikaments.add(
                new Medikament(0, TRAVY_FITO_CHAI, "ШАЛФЕЙ", "30 гр Фито чай", 80)
                ) ;
        allMedikaments.add(
                new Medikament(0, TRAVY_FITO_CHAI, "Черника плоды", "30 гр Фито чай", 310)
        ) ;
        allMedikaments.add(
                new Medikament(0, TRAVY_FITO_CHAI, "Череды трава", "50 гр Фито чай", 100)
        ) ;
        allMedikaments.add(
                new Medikament(0, DOBAVKI_VITAMINY, "Черника форте", "0.25 мг Таблетки", 340)
        ) ;
        allMedikaments.add(
                new Medikament(0, DOBAVKI_VITAMINY, "Цинарикс.Экстракт артишока", "400 мг Таблетки", 660)
        ) ;
        allMedikaments.add(
                new Medikament(0, INTIM_ZDOROVIE, "EVITEST", " для определения беременности", 270)
        ) ;
        allMedikaments.add(
                new Medikament(0, INTIM_ZDOROVIE, "Гусарские классические", "Context", 285)
        ) ;
        allMedikaments.add(
                new Medikament(0, MEDTECHNIKA, "Электрогрелка.Электропояс", "Пояс", 4225)
        ) ;
        allMedikaments.add(
                new Medikament(0, MEDTECHNIKA, "Тонометр Omron", "Полуавтомат", 5155)
        ) ;
        allMedikaments.add(
                new Medikament(0, MEDTECHNIKA, "Тонометр Omron", "Автоматический", 14225)
        ) ;
        allMedikaments.add(
                new Medikament(0, MEDTECHNIKA, "Термометр", "Ртутный", 270)
        ) ;

        allMedikaments.add(
                new Medikament(0, MAM_DETEY, "Цепочка NUK", "для пустышки", 1000)
        ) ;
        allMedikaments.add(
                new Medikament(0, MAM_DETEY, "Трусики подгузники Huggies", "5 малоразмер 14 шт", 1650)
        ) ;
        allMedikaments.add(
                new Medikament(0, MAM_DETEY, "Салфетки Джонсон бэйби", "влажный белый", 375)
        ) ;
        allMedikaments.add(
                new Medikament(0, MAM_DETEY, "Подгузники Pampers", "4 размер 35 шт", 4135)
        ) ;
        allMedikaments.add(
                new Medikament(0, KRASOTA_UXOD, "Я Самая ватные палочки", "круглые 120 шт", 190)
        ) ;
        allMedikaments.add(
                new Medikament(0, KRASOTA_UXOD, "Я Самая ватные палочки", "круглые 45 шт", 90)
        ) ;
        allMedikaments.add(
                new Medikament(0, KRASOTA_UXOD, "Эвкалиптовое эфирное масло", "50 гр", 735)
        ) ;
        allMedikaments.add(
                new Medikament(0, KRASOTA_UXOD, "Физиогель крем-интенсив", "100 мл", 3900)
        ) ;
        allMedikaments.add(
                new Medikament(0, RAZNOE, "Eclipse в ассортименте", "", 94)
        ) ;
        allMedikaments.add(
                new Medikament(0, RAZNOE, "Duracell батерейка", "AAA MN2400", 590)
        ) ;





        allMedikaments.add(
                new Medikament(1, LEKARSTV_PREPERAT, "Адвантан", "1% мазь", 1200)
        ) ;
        allMedikaments.add(
                new Medikament(1, LEKARSTV_PREPERAT, "Тетрациклин", "1% мазь", 700)
        ) ;
        allMedikaments.add(
                new Medikament(1, LEKARSTV_PREPERAT, "Тетрациклин", "Таблетки", 200)
        ) ;
        allMedikaments.add(
                new Medikament(1, LEKARSTV_PREPERAT, "Эфизол", "Таблетки", 580)
        ) ;
        allMedikaments.add(
                new Medikament(1, LEKARSTV_PREPERAT, "Эутирокс", "75 мг Таблетки", 695)
        ) ;
        allMedikaments.add(
                new Medikament(1, LEKARSTV_PREPERAT, "Эутирокс", "50 мг Таблетки", 655)
        ) ;
        allMedikaments.add(
                new Medikament(1, TRAVY_FITO_CHAI, "ШАЛФЕЙ", "30 гр Фито чай", 80)
        ) ;
        allMedikaments.add(
                new Medikament(1, TRAVY_FITO_CHAI, "Черника плоды", "30 гр Фито чай", 310)
        ) ;
        allMedikaments.add(
                new Medikament(1, TRAVY_FITO_CHAI, "Череды трава", "50 гр Фито чай", 100)
        ) ;
        allMedikaments.add(
                new Medikament(1, DOBAVKI_VITAMINY, "Черника форте", "0.25 мг Таблетки", 340)
        ) ;
        allMedikaments.add(
                new Medikament(1, DOBAVKI_VITAMINY, "Цинарикс.Экстракт артишока", "400 мг Таблетки", 660)
        ) ;
        allMedikaments.add(
                new Medikament(1, INTIM_ZDOROVIE, "EVITEST", " для определения беременности", 270)
        ) ;
        allMedikaments.add(
                new Medikament(1, INTIM_ZDOROVIE, "Гусарские классические", "Context", 285)
        ) ;
        allMedikaments.add(
                new Medikament(1, MEDTECHNIKA, "Электрогрелка.Электропояс", "Пояс", 4225)
        ) ;
        allMedikaments.add(
                new Medikament(1, MEDTECHNIKA, "Тонометр Omron", "Полуавтомат", 5155)
        ) ;
        allMedikaments.add(
                new Medikament(1, MEDTECHNIKA, "Тонометр Omron", "Автоматический", 14225)
        ) ;
        allMedikaments.add(
                new Medikament(1, MEDTECHNIKA, "Термометр", "Ртутный", 270)
        ) ;

        allMedikaments.add(
                new Medikament(1, MAM_DETEY, "Цепочка NUK", "для пустышки", 1000)
        ) ;
        allMedikaments.add(
                new Medikament(1, MAM_DETEY, "Трусики подгузники Huggies", "5 малоразмер 14 шт", 1650)
        ) ;
        allMedikaments.add(
                new Medikament(1, MAM_DETEY, "Салфетки Джонсон бэйби", "влажный белый", 375)
        ) ;
        allMedikaments.add(
                new Medikament(1, MAM_DETEY, "Подгузники Pampers", "4 размер 35 шт", 4135)
        ) ;
        allMedikaments.add(
                new Medikament(1, KRASOTA_UXOD, "Я Самая ватные палочки", "круглые 120 шт", 190)
        ) ;
        allMedikaments.add(
                new Medikament(1, KRASOTA_UXOD, "Я Самая ватные палочки", "круглые 45 шт", 90)
        ) ;
        allMedikaments.add(
                new Medikament(1, KRASOTA_UXOD, "Эвкалиптовое эфирное масло", "50 гр", 735)
        ) ;
        allMedikaments.add(
                new Medikament(1, KRASOTA_UXOD, "Физиогель крем-интенсив", "100 мл", 3900)
        ) ;
        allMedikaments.add(
                new Medikament(1, RAZNOE, "Eclipse в ассортименте", "", 94)
        ) ;
        allMedikaments.add(
                new Medikament(1, RAZNOE, "Duracell батерейка", "AAA MN2400", 590)
        ) ;



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
