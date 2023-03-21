package br.com.etecia.customapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Filmes> listaFilmes;

    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //apresentando xml pro java
        idRecyclerView = findViewById(R.id.idListaFilme);

        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Tudo em Todo Lugar",
                        "Uma imigrante chinesa parte rumo a uma aventura onde, sozinha, precisará salvar o mundo, explorando outros universos e outras vidas que poderia ter vivido.",
                        "Comédia",
                        R.drawable.tudoaomesmotempo));
        listaFilmes.add(
                new Filmes("testando comit",
                        "Uma imigrante chinesa parte rumo a uma aventura onde, sozinha, precisará salvar o mundo, explorando outros universos e outras vidas que poderia ter vivido.",
                        "Comédia",
                        R.drawable.tudoaomesmotempo));
        listaFilmes.add(
                new Filmes("Tudo em Todo Lugar",
                        "Uma imigrante chinesa parte rumo a uma aventura onde, sozinha, precisará salvar o mundo, explorando outros universos e outras vidas que poderia ter vivido.",
                        "Comédia",
                        R.drawable.tudoaomesmotempo));
        listaFilmes.add(
                new Filmes("Tudo em Todo Lugar",
                        "Uma imigrante chinesa parte rumo a uma aventura onde, sozinha, precisará salvar o mundo, explorando outros universos e outras vidas que poderia ter vivido.",
                        "Comédia",
                        R.drawable.tudoaomesmotempo));
        listaFilmes.add(
                new Filmes("Tudo em Todo Lugar",
                        "Uma imigrante chinesa parte rumo a uma aventura onde, sozinha, precisará salvar o mundo, explorando outros universos e outras vidas que poderia ter vivido.",
                        "Comédia",
                        R.drawable.tudoaomesmotempo));
        listaFilmes.add(
                new Filmes("Tudo em Todo Lugar",
                        "Uma imigrante chinesa parte rumo a uma aventura onde, sozinha, precisará salvar o mundo, explorando outros universos e outras vidas que poderia ter vivido.",
                        "Comédia",
                        R.drawable.tudoaomesmotempo));


        //ligando adaptador e parametros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        //tipo de lay de a lista irá seguir
        idRecyclerView.setLayoutManager(
                new GridLayoutManager(
                        getApplicationContext(), 2));

        //fixador de tamanho da lista - deixa a lista mais rapida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recycler ao adap
        idRecyclerView.setAdapter(adapter);

    }
}