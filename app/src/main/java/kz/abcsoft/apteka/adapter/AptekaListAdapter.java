package kz.abcsoft.apteka.adapter;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import kz.abcsoft.apteka.R;
import kz.abcsoft.apteka.modle.Apteka;

public class AptekaListAdapter extends BaseAdapter{
    private Activity activity ;
    private LayoutInflater inflater ;
    private List<Apteka> aptekaItems ;

    public AptekaListAdapter(Activity activity, List<Apteka> aptekaItems){
        this.activity = activity ;
        this.aptekaItems = aptekaItems ;
    }

    @Override
    public int getCount(){
        return aptekaItems.size() ;
    }

    @Override
    public Object getItem(int location){
        return aptekaItems.get(location) ;
    }

    @Override
    public long getItemId(int position){
        return position ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater == null)
            inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        if(convertView == null)
            convertView = inflater.inflate(R.layout.list_apteki_row, null) ;

        TextView title = (TextView)convertView.findViewById(R.id.title) ;
        TextView phone = (TextView)convertView.findViewById(R.id.phone) ;
        TextView address = (TextView)convertView.findViewById(R.id.address) ;
        TextView pid = (TextView)convertView.findViewById(R.id.pid) ;

        Apteka apteka = aptekaItems.get(position) ;

        title.setText(apteka.getTitle());
        phone.setText(apteka.getPhone());

        List<String> aptekaAddresses = apteka.getAddresses() ;
//        StringBuilder sb = new StringBuilder() ;
//        for(String aptekaAddress : aptekaAddresses){
//            sb.append(aptekaAddress + "; ") ;
//        }
//        address.setText(sb.toString());

        // Тек бір ғана адрессті алып қоямыз
        address.setText(aptekaAddresses.get(0)) ;

        pid.setText( Integer.toString(apteka.getId()) );


        return convertView;
    }
}
