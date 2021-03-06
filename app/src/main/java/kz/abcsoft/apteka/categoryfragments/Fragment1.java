package kz.abcsoft.apteka.categoryfragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kz.abcsoft.apteka.MedikamentDetailActivity;
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
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment1, container, false) ;

        final String pid = getActivity().getIntent().getStringExtra("pid") ;
        int pidInteger = Integer.parseInt(pid) ;
//        final String mid = getActivity().getIntent().getStringExtra("mid") ; // Мен бұлай ала алмаймын

        final ArrayList<Medikament> medikamentsCategory1 =
                MedikamentTestList.getAptekaMedikamentsByCategory1(getMedikamentsForDifCategory(pidInteger)) ;

        ListView medikamentsListView = (ListView) rootView.findViewById(R.id.listFragment1) ;
        AptekaMedikamentListAdapter medikamentListAdapter = new AptekaMedikamentListAdapter(getActivity(),
                medikamentsCategory1) ;
        medikamentsListView.setAdapter(medikamentListAdapter);



        medikamentsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent medikamentDetailIntent = new Intent(getActivity(), MedikamentDetailActivity.class);
                medikamentDetailIntent.putExtra("pid", pid);
                Medikament medikament = medikamentsCategory1.get(i) ;
                medikamentDetailIntent.putExtra("mid", Integer.toString(medikament.getMid()));
                startActivity(medikamentDetailIntent);
            }
        }) ;

        return rootView ;
    }

    private ArrayList<Medikament> getMedikamentsForDifCategory(int id){

        List<Apteka> listApteks = AptekaTestList.getListApteks() ;
        Apteka apteka = AptekaTestList.getApteka(id) ;

        ArrayList<Medikament> medikaments = MedikamentTestList.getAptekaMedikaments(apteka.getId()) ;

        return medikaments ;
    }
}
