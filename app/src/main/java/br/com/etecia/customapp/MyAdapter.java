package br.com.etecia.customapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContext;

    public MyAdapter(Context mContext, List<Filmes> listFilmes) {
        this.mContext = mContext;
        this.listFilmes = listFilmes;
    }

    private List<Filmes> listFilmes;

    public MyAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.modelo_filmes, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idTitulosFilmes.setText(listFilmes.get(position).getTitulo());
        holder.idImagemFilmes.setImageResource(listFilmes.get(position).getImagem());
    }

    @Override
    public int getItemCount() {
        return listFilmes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView idTitulosFilmes;
        ImageView idImagemFilmes;
        CardView idCardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTitulosFilmes = itemView.findViewById(R.id.idTitulosFilmes);
            idImagemFilmes = itemView.findViewById(R.id.idImgFilmes);
            idCardView = itemView.findViewById(R.id.idCardFilmes);

        }
    }
}


