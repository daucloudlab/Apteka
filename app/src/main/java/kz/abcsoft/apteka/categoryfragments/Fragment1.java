package kz.abcsoft.apteka.categoryfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import kz.abcsoft.apteka.R;
import kz.abcsoft.apteka.adapter.AptekaMedikamentListAdapter;
import kz.abcsoft.apteka.modle.Apteka;
import kz.abcsoft.apteka.modle.Medikament;
import kz.abcsoft.apteka.testdata.AptekaTestList;
import kz.abcsoft.apteka.testdata.MedikamentTestList;

/**
 * Created by daulet on 6/3/15.
 */
public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment1, container, false) ;

        String pid = getActivity().getIntent().getStringExtra("pid") ;
        int pidInteger = Integer.parseInt(pid) ;

        List<Apteka> listApteks = AptekaTestList.getListApteks() ;
        Apteka apteka = AptekaTestList.getApteka(pidInteger) ;

        Log.d("ТЕКСЕРУ", apteka.getTitle()) ;

        List<Medikament> medikaments = MedikamentTestList.getAptekaMedikaments(apteka.getId()) ;
        ListView medikamentsListView = (ListView) rootView.findViewById(R.id.listFragment1) ;
        AptekaMedikamentListAdapter medikamentListAdapter = new AptekaMedikamentListAdapter(getActivity(),
                medikaments) ;
        medikamentsListView.setAdapter(medikamentListAdapter);

        return rootView ;
    }
}
