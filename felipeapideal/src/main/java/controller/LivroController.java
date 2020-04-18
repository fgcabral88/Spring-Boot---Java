package controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import repository.LivroRepository;
import model.Livro;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class LivroController {

    LivroRepository livroRepository;

    // Listar livros:
    @GetMapping("/livro")
    public List<Livro> listaLivro(){
        return livroRepository.findAll();
    }

    // Listar por Id:
    @GetMapping("/livro/{id}")
    public List<Livro> livroId(@PathVariable(value = "id") int id) {
        return (List<Livro>) livroRepository.findById(id);
    }

    // Salvar Livro:
    @PostMapping("/livro")
    public Livro salvaLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    // Atualizar Livro:
    @PutMapping("/livro")
    public Livro atualizaLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    // Deletar Livro:
    @DeleteMapping("/livro")
    public void deletaLivro(@RequestBody Livro livro){
        livroRepository.delete(livro);
    }
}
