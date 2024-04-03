package com.mauroluz.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biblioteca")
public class Controller {
    private IAcervo acervo;

    @Autowired
    public Controller(IAcervo acervo) {
        this.acervo = acervo;
    }
    // @GetMapping("/")
    // @CrossOrigin(origins = "*")
    // public String mensagemDeBemVindo() {
    //     return "Bem-vindo à biblioteca central!";
    // }

    // @GetMapping("/livros")
    // @CrossOrigin(origins = "*")
    // public List<Livro> getLivros() {
    //     return this.livros;
    // }

    // @GetMapping("/autores")
    // @CrossOrigin(origins = "*")
    // public List<String> getAutores() {
    //     return livros.stream()
    //                  .map(Livro::getAutor)
    //                  .distinct()
    //                  .collect(Collectors.toList());
    // }

    // @GetMapping("/titulos")
    // @CrossOrigin(origins = "*")
    // public List<String> getTitulos() {
    //     return livros.stream()
    //                  .map(Livro::getTitulo)
    //                  .toList();
    // }

    // @GetMapping("/livrosPorAno")
    // @CrossOrigin(origins = "*")
    // public List<Livro> getLivrosPorAno(@RequestParam(value = "ano") int ano) {
    //     return livros.stream()
    //                  .filter(livro -> livro.getAno() == ano)
    //                  .toList();
    // }

    // @GetMapping("/desatualizados/{ano}")
    // @CrossOrigin(origins = "*")
    // public List<Livro> getLivrosDesatualizados(@PathVariable(value = "ano") int ano) {
    //     return livros.stream()
    //                  .filter(livro -> livro.getAno() < ano)
    //                  .toList();
    // }

    // @GetMapping("/consulta/{autor}/{ano}")
    // @CrossOrigin(origins = "*")
    // public List<Livro> getLivrosDeAutorEmAno(@PathVariable(value = "autor") String autor,
    //                                          @PathVariable(value = "ano") int ano) {
    //     return livros.stream()
    //                  .filter(livro -> livro.getAutor().equals(autor))
    //                  .filter(livro -> livro.getAno() == ano)
    //                  .toList();
    // }

    // @PostMapping("/atualizaLivro")
    // @CrossOrigin(origins = "*")
    // public boolean atualizaLivro(@RequestBody final Livro livro) {
    //     long id = livro.getId();
    //     for (Livro l : livros) {
    //         if (l.getId() == id) {
    //             l.setAutor(livro.getAutor());
    //             l.setTitulo(livro.getTitulo());
    //             l.setAno(livro.getAno());
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}