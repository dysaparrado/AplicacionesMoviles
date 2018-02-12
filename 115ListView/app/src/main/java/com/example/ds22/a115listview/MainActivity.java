package com.example.ds22.a115listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String lista[]={"Resumed: Una actividad está visible y activa","Paused: Puede estar visible pero sin el “foco”","Stopped: No visible","Inactive: Eliminado de la pila de tareas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.listView);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, lista);

        listView.setAdapter(adapter);
    }
}
