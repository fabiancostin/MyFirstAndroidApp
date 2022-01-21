package com.example.proiectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MateriiActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    ArrayList<String> listGroup = new ArrayList<>();
    HashMap<String,ArrayList<String>> listChild = new HashMap<>();
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materii);

        expandableListView = findViewById(R.id.exp_list_view);


        for(int g=0;g<3;g++)
        {
            listGroup.add("Anul "+(g+1));
            ArrayList<String> arrayList = new ArrayList<>();
            if(g==0)
            {
                arrayList.add("Arhitectura sistemelor de calcul");
                arrayList.add("Algoritmi şi structuri de date");
                arrayList.add("Fundamentele programării");
                arrayList.add("Fundamentele algebrice ale informaticii");
                arrayList.add("Analiză matematică");
                arrayList.add("Educaţie fizică");
                arrayList.add(" ");
                arrayList.add("Baze de date");
                arrayList.add("Geometrie computaţională");
                arrayList.add("Algoritmica grafurilor");
                arrayList.add("Logică matematică și computaţională");
                arrayList.add("Programare orientată pe obiecte");
                arrayList.add("Educaţie fizică");
            }
            else if(g==1)
            {
                arrayList.add("Sisteme de gestiune a bazelor de date");
                arrayList.add("Programare logică");
                arrayList.add("Ecuaţii diferenţiale şi cu derivate parțiale");
                arrayList.add("Proiectarea şi implementarea algoritmilor");
                arrayList.add("Educaţie fizică");
                arrayList.add(" ");
                arrayList.add("Programare WEB");
                arrayList.add("Reţele neuronale");
                arrayList.add("Reţele de calculatoare");
                arrayList.add("Probabilităţi şi statistică matematică");
                arrayList.add("Verificarea şi validarea sistemelor software");
                arrayList.add("Practica de specialitate");
                arrayList.add("Metode avansate de programare");
            }
            else{
                arrayList.add("Sisteme de operare");
                arrayList.add("Analiza algoritmilor");
                arrayList.add("Limbaje formale şi automate");
                arrayList.add("Analiza și prelucrarea imaginilor");
                arrayList.add(" ");
                arrayList.add("Inteligenţă artificială");
                arrayList.add("Inginerie software");
                arrayList.add("Tehnici avansate de programare");
                arrayList.add("Elaborarea lucrării de licenţă");
            }
            listChild.put(listGroup.get(g),arrayList);
        }
        adapter = new MainAdapter(listGroup,listChild);
        expandableListView.setAdapter(adapter);
    }
}