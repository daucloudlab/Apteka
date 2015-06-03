package kz.abcsoft.apteka;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

import kz.abcsoft.apteka.adapter.AptekaListAdapter;
import kz.abcsoft.apteka.modle.Apteka;


public class AptekaListActivity extends AppCompatActivity {

    ArrayList<Apteka> listApteks ;
    AptekaListAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apteka_list);

        Toolbar toolbar = (Toolbar)findViewById(R.id.apteka_list_toolbar) ;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Список Аптек");
//        toolbar.setTitle("Список Аптек");
//        toolbar.inflateMenu(R.menu.toolbar_menu);
//



        listApteks = new ArrayList<Apteka>() ;

        for(int i = 0; i < 10; i++){
            Apteka a = new Apteka("Название аптеки " + (i+1), "87078914322", "17 мкр-н, д.10") ;
            listApteks.add(a) ;
        }

        adapter = new AptekaListAdapter(this, listApteks ) ;
        ListView listView = (ListView)findViewById(R.id.list) ;
        listView.setAdapter(adapter);


    }
}
