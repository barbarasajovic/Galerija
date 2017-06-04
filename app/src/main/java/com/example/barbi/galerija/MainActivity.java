package com.example.barbi.galerija;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    public ZM_Stranka_PregledUmetnin zm_stranka_pregledUmetnin = new ZM_Stranka_PregledUmetnin();
    public Umetnik umetnik = new Umetnik();
    public Obdobje obdobje = new Obdobje();
    public Umetnina umetnina = new Umetnina();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //array vseh umetnin
        ArrayList<String> vseUmetnine = zm_stranka_pregledUmetnin.PricniPregledUmetnin();

        //array vseh umetnikov
        ArrayList<Umetnik> umetniki = new ArrayList<>();
        final ArrayList<String> umetniki2 = new ArrayList<>();

        umetniki.addAll(umetnik.Umetniki);
        for(int i = 0; i < umetniki.size(); i++){
            umetniki2.add(umetniki.get(i).Avtor);
        }

        //array vseh obdobij
        ArrayList<Obdobje> obdobja = new ArrayList<>();
        ArrayList<String> obdobja2 = new ArrayList<>();

        obdobja.addAll(obdobje.Ubdobja);
        for(int i = 0; i < obdobja.size(); i++){
            obdobja2.add(obdobja.get(i).Ime);
        }



        /*
        //U1metnina u = new Umetnina();
        Umetnina u = new Umetnina();
        String podatkiUmetnine = u.VrniPodatkeUmetnine("The Healing of the Man born Blind");
        //sout
        System.out.println("JUPI" + podatkiUmetnine);
        System.out.println("----------------FILTER");
        Obdobje o2 = new Obdobje();

        ArrayList<Umetnina> filter = new ArrayList<>();
        filter=o2.VrniVseUmetnineTegaObdobja("Renesančna umetnost","Duccio");
        for (Umetnina u : filter){
            System.out.println("    "+u.Ime+ " ");
        }
        System.out.println();
        */




        //adapter za umetnike
        final ListView lvUmetniki = (ListView)findViewById(R.id.umetniki);

        ArrayList umetnikiSortTest = zm_stranka_pregledUmetnin.IzberiUmetnika(umetniki2.get(0));

        ArrayAdapter umetnikiAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, umetniki2);
        lvUmetniki.setAdapter(umetnikiAdapter);


        final ListView lvObdobja = (ListView)findViewById(R.id.obdobja);
        ArrayAdapter obdobjaAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, obdobja2);
        lvObdobja.setAdapter(obdobjaAdapter);

        final ListView lvUmetnine = (ListView)findViewById(R.id.umetnine);
        ArrayAdapter<String> umetnineAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, vseUmetnine);
        lvUmetnine.setAdapter(umetnineAdapter);

        lvUmetniki.setVisibility(View.VISIBLE);
        lvObdobja.setVisibility(View.VISIBLE);
        lvUmetnine.setVisibility(View.VISIBLE);

        lvUmetniki.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayList umetnikiSort = zm_stranka_pregledUmetnin.IzberiUmetnika(umetniki2.get(position));
                ArrayAdapter umetnineAdapter2 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, umetnikiSort);
                lvUmetnine.setAdapter(umetnineAdapter2);
            }
        });
        //TextView tv = (TextView)findViewById(R.id.textView);
        //tv.setText(umetniki2.get(0));



    }
}
