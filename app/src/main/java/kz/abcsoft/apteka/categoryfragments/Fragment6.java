package kz.abcsoft.apteka.categoryfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kz.abcsoft.apteka.R;
import kz.abcsoft.apteka.adapter.AptekaMedikamentListAdapter;
import kz.abcsoft.apteka.modle.Apteka;
import kz.abcsoft.apteka.modle.Medikament;
import kz.abcsoft.apteka.testdata.AptekaTestList;
import kz.abcsoft.apteka.testdata.MedikamentTestList;

/**
 * Created by daulet on 6/4/15.
 */
public class Fragment6 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment1, container, false) ;

        String pid = getActivity().getIntent().getStringExtra("pid") ;
        int pidInteger = Integer.parseInt(pid) ;

        ArrayList<Medikament> medikamentsCategory6 =
                MedikamentTestList.getAptekaMedikamentsByCategory6(getMedikamentsForDifCategory(pidInteger)) ;

        ListView medikamentsListView = (ListView) rootView.findViewById(R.id.listFragment1) ;
        AptekaMedikamentListAdapter medikamentListAdapter = new AptekaMedikamentListAdapter(getActivity(),
                medikamentsCategory6) ;
        medikamentsListView.setAdapter(medikamentListAdapter);

        return rootView ;
    }

    private ArrayList<Medikament> getMedikamentsForDifCategory(int id){

        List<Apteka> listApteks = AptekaTestList.getListApteks() ;
        Apteka apteka = AptekaTestList.getApteka(id) ;

        ArrayList<Medikament> medikaments = MedikamentTestList.getAptekaMedikaments(apteka.getId()) ;

        return medikaments ;
    }
}