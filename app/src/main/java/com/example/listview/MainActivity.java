package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // criação da lista local

    private ListView listLocais;
    private String[] itens = {
            "Angra dos Reis", "Caldas Novas", "Campos do Jordão",
            "Costa do sauiupe", "ilheus", "Porto Seguro", "Tiradentes",
            "Praga", "Santiago", "Zurique", "Caribee", "Buenos Aires", "Budapeste",
            "Cancún", "Aruba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // recupera a view xml
        listLocais = findViewById(R.id.listLocais);

        //criar adpatador para lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        // adiciona adaptador para a lista
        listLocais.setAdapter(adaptador);

        // adiciona clique na lista
        listLocais.setOnItemClickListener((parent, view, position, id) -> {
            String valorSelecionado = listLocais.getItemAtPosition(position).toString();
            Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_LONG).show();
        });


    }
}