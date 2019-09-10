package com.example.almafiesta2k20;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class dramsfragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.dramsfragment, container, false);



        final ArrayList<eventData> dramsData=new ArrayList<>();
        dramsData.add(new eventData(R.drawable.sdrdr1,getResources().getString(R.string.sdrd1),getResources().getString(R.string.sdrh1),getResources().getString(R.string.faceoff)));
        dramsData.add(new eventData(R.drawable.sdrdr2,getResources().getString(R.string.sdrd2),getResources().getString(R.string.sdrh2),getResources().getString(R.string.ncircled)));
        dramsData.add(new eventData(R.drawable.sdrdr3,getResources().getString(R.string.sdrd3),getResources().getString(R.string.sdrh3),getResources().getString(R.string.spotlight)));

        listArrayAdapter lar=new listArrayAdapter(getContext(),0,dramsData);
        final ListView list= rootView.findViewById(R.id.dramsList);
        list.setAdapter(lar);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {



                Intent intent=new Intent(dramsfragment.this,listOpener.class);
                intent.putExtra("Text",dramsData.get(i).getText());
                intent.putExtra("Head",dramsData.get(i).getHead());
                intent.putExtra("Image ID",dramsData.get(i).getImage());
                startActivity(intent);


            }
        });






        return rootView;
    }
}
