package br.com.etecia.customapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Apresenta_filmesActivity extends AppCompatActivity {

    TextView mTitulo, mCategoria, mDescricao;

    ImageView mImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filmes_layout);

        mTitulo = findViewById(R.id.mTituloFilme);
        mCategoria = findViewById(R.id.mCategoria);
        mDescricao = findViewById(R.id.mDescricao);
        mImagem = findViewById(R.id.mImagemFilme);

        //Declarando intent para receber Valor
        Intent intent = getIntent();
        //Declarando as variaveis que irão receber o valor
        String titulo, descricao, categoria;
        int imagemFilme;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");

        imagemFilme = intent.getExtras().getInt("ImagemFilme");

        mTitulo.setText(titulo);
        mDescricao.setText(descricao);
        mCategoria.setText(categoria);
        mImagem.setImageResource(imagemFilme);

    }
}