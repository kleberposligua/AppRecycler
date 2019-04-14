package com.kleber.apprecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<PersonajeVo> listDatos = new ArrayList<PersonajeVo>();
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listDatos=new ArrayList<PersonajeVo>();

        recycler=(RecyclerView) findViewById(R.id.recylerId);
        //linear layout
        //recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        //recycler.setLayoutManager(new GridLayoutManager(this,3));

        //grid layout
        recycler.setLayoutManager(new GridLayoutManager(this,2));

        llenarLista();

        MyAdapter adapterDatos=new MyAdapter(listDatos);
        recycler.setAdapter(adapterDatos);
    }

    private void llenarLista() {
        listDatos.add(new PersonajeVo("Homero","Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson",R.drawable.homero));
        listDatos.add(new PersonajeVo("Marge","Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson",R.drawable.marge));
        listDatos.add(new PersonajeVo("Bart","Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson",R.drawable.bart));
        listDatos.add(new PersonajeVo("Lisa","Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson",R.drawable.lisa));
        listDatos.add(new PersonajeVo("Maggie","Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson",R.drawable.maggie));
        listDatos.add(new PersonajeVo("Moe","Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson",R.drawable.moe));
        listDatos.add(new PersonajeVo("Apus","Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson-Homero Simpson",R.drawable.apus));


    }
}
