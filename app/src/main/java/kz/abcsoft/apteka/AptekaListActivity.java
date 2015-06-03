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
import java.util.List;

import kz.abcsoft.apteka.adapter.AptekaListAdapter;
import kz.abcsoft.apteka.modle.Apteka;
import kz.abcsoft.apteka.testdata.AptekaTestList;


public class AptekaListActivity extends AppCompatActivity {

    List<Apteka> listApteks ;
    AptekaListAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apteka_list);

        Toolbar toolbar = (Toolbar)findViewById(R.id.apteka_list_toolbar) ;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Список Аптек");
//        main_toolbar.setTitle("Список Аптек");
//        main_toolbar.inflateMenu(R.menu.toolbar_menu);
//

        // Аптекалардың тізімін аламыз
        listApteks = AptekaTestList.getListApteks() ;

        adapter = new AptekaListAdapter(this, listApteks ) ;
        ListView listView = (ListView)findViewById(R.id.list) ;
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String pid = ((TextView)view.findViewById(R.id.pid)).getText().toString() ;
                Intent intent = new Intent(getApplicationContext(), AptekaDetailActivity.class) ;
                intent.putExtra("pid", pid) ;
                startActivity(intent);
            }
        });


    }
}
