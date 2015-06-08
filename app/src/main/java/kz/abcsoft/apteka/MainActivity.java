package kz.abcsoft.apteka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeader;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.ArrayList;
import java.util.List;

import kz.abcsoft.apteka.adapter.AptekaListAdapter;
import kz.abcsoft.apteka.adapter.MedikamentListAdapter;
import kz.abcsoft.apteka.map.MapsActivity;
import kz.abcsoft.apteka.modle.Apteka;
import kz.abcsoft.apteka.modle.Medikament;
import kz.abcsoft.apteka.testdata.AptekaTestList;
import kz.abcsoft.apteka.testdata.MedikamentTestList;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar ;

    private EditText medikamentSearch ;
    private List<Medikament> listMedikaments ;
    private List<Apteka> listApteks ;
    private MedikamentListAdapter adapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar() ;
        initNavigationDrawer();


        listApteks = AptekaTestList.getListApteks() ;
        listMedikaments = MedikamentTestList.getAllMedikaments();

        adapter  = new MedikamentListAdapter(this, listMedikaments, listApteks) ;
        ListView listView = (ListView)findViewById(R.id.medikaments_list) ;
        listView.setAdapter(adapter);

        medikamentSearch = (EditText)findViewById(R.id.input_medikament_search) ;
        medikamentSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String stringAID = ((TextView)view.findViewById(R.id.apteka_id)).getText().toString() ;
                String stringMID = ((TextView)view.findViewById(R.id.medikament_id)).getText().toString() ;
                Intent medikamentDetailIntent = new Intent(getApplicationContext(), MedikamentDetailActivity.class) ;
                medikamentDetailIntent.putExtra("pid", stringAID) ;
                medikamentDetailIntent.putExtra("mid", stringMID) ;
                startActivity(medikamentDetailIntent);
            }
        });

    }

    private void initToolbar(){
        toolbar = (Toolbar)findViewById(R.id.main_toolbar) ;
        toolbar.setTitle(R.string.main_toolbar_title);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId() ;
                if(id == R.id.to_apteks_list) {
                    Intent to_apteks_list_intent = new Intent(MainActivity.this, AptekaListActivity.class);
                    startActivity(to_apteks_list_intent);
                    return true ;
                }
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.toolbar_menu) ;

    }

    private void initNavigationDrawer(){

        AccountHeader accountHeader = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.material_background)
                .build() ;

        Drawer drawerResult = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withAccountHeader(accountHeader)
                .withDisplayBelowToolbar(true)
                .withActionBarDrawerToggleAnimated(true)
                .addDrawerItems(
                        new PrimaryDrawerItem()
                                .withName(R.string.nav_menu_item_apteki)
                                .withIdentifier(1)
                                .withIcon(R.drawable.ic_clinic_room_24),

                        new DividerDrawerItem(),

                        new PrimaryDrawerItem()
                                .withName(R.string.nav_menu_item_near_apteki)
                                .withIdentifier(2)
                                .withIcon(R.drawable.ic_room_black_24dp),

                        new DividerDrawerItem(),

                        new PrimaryDrawerItem()
                                .withName(R.string.nav_menu_item_search_medikament)
                                .withIdentifier(3)
                                .withIcon(R.drawable.google_news_24)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem iDrawerItem) {

                        switch (iDrawerItem.getIdentifier()) {
                            case 1:
                                Intent intent1 = new Intent(MainActivity.this, AptekaListActivity.class) ;
                                startActivity(intent1);
                                return true ;
                            case 2:
                                Intent intent2 = new Intent(MainActivity.this, MapsActivity.class) ;
                                startActivity(intent2);
                                return true ;
                            case 3:
                                return false ;
                        }
                        return false ;
                    }
                })
                .build() ;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}
