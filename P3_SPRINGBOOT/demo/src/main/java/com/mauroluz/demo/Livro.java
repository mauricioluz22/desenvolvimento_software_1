package com.mauroluz.demo;
import java.util.Objects;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int ano;

    public Livro(int id, String titulo, String autor, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Livro id(int id) {
        setId(id);
        return this;
    }

    public Livro titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Livro autor(String autor) {
        setAutor(autor);
        return this;
    }

    public Livro ano(int ano) {
        setAno(ano);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Livro)) {
            return false;
        }
        Livro livro = (Livro) o;
        return id == livro.id && Objects.equals(titulo, livro.titulo) && Objects.equals(autor, livro.autor) && ano == livro.ano;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, autor, ano);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", ano='" + getAno() + "'" +
            "}";
    }
}
