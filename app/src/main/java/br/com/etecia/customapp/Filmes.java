package br.com.etecia.customapp;

public class Filmes {
    private String Titulo;
    private String Descricao;
    private String Categoria;
    private int imagem;

    public Filmes(String titulo, String descricao, String categoria, int imagem) {
        Titulo = titulo;
        Descricao = descricao;
        Categoria = categoria;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }


}
