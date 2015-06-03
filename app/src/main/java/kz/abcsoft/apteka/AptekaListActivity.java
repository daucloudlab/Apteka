package kz.abcsoft.apteka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

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


        // Ойдан құрастырылған аптекалардың тізімі, тест үшін
        listApteks = new ArrayList<Apteka>() ;
        // Әр аптеканың бірнеше филиалы болуы мүмкін, сондықтан бірнеше адресі
        ArrayList<String> aptekaAddresses = new ArrayList<String>() ;
        aptekaAddresses.add("17 мкр-н, Д.10") ;
        aptekaAddresses.add("Шаяхметов 43") ;
        aptekaAddresses.add("Тауке хан 17") ;

        for(int i = 0; i < 10; i++){
            Apteka a = new Apteka((i+1), "Название аптеки " + (i+1), "87078914322", aptekaAddresses) ;
            listApteks.add(a) ;
        }

        adapter = new AptekaListAdapter(this, listApteks ) ;
        ListView listView = (ListView)findViewById(R.id.list) ;
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String pid = ((TextView)view.findViewById(R.id.pid)).getText().toString() ;
//                Intent intent = new Intent(getApplicationContext(), AptekaDetailActivity.class) ;
//                intent.putExtra("pid", pid) ;
//                startActivity(intent);
            }
        });


    }
}
