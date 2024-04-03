package com.mauroluz.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Acervo implements IAcervo {
    private JdbcTemplate jdbcTemplate;

    public Acervo(JdbcTemplate sgbd) {
        this.jdbcTemplate = sgbd;
    }

    @Override
    public List<Livro> getAll() {
        return jdbcTemplate.query("SELECT * FROM livros",
               (rs, rownum) -> new Livro(rs.getLong("codigo"), rs.getString("titulo"), rs.getString("autor"), rs.getInt("ano")));
    }

    @Override
    public List<String> getTitulos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitulos'");
    }

    @Override
    public List<String> getAutores() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAutores'");
    }

    @Override
    public List<Livro> getLivrosDoAutor(String autor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLivrosDoAutor'");
    }

    @Override
    public Livro getLivroTitulo(String titulo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLivroTitulo'");
    }

    @Override
    public boolean cadastraLivroNovo(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastraLivroNovo'");
    }

    @Override
    public boolean removeLivro(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLivro'");
    }
    
}
