package controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import repository.CategoriaRepository;
import model.Categoria;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class CategoriaController {

    CategoriaRepository categoriaRepository;

    // Listar categoria:
    @GetMapping("/categoria")
    public List<Categoria> listaCategoria(){
        return categoriaRepository.findAll();
    }

    // Listar por Id:
    @GetMapping("/categoria/{id}")
    public List<Categoria> categoriaId(@PathVariable(value = "id") int id){
        return (List<Categoria>) categoriaRepository.findById(id);
    }

    // Salvar categoria:
    @PostMapping("/categoria")
    public Categoria salvaCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    // Atualizar categoria:
    @PutMapping("/categoria")
    public Categoria atualizaCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    // Deletar categoria:
    @DeleteMapping("/categoria")
    public void deletaCategoria(@RequestBody Categoria categoria){
        categoriaRepository.delete(categoria);
    }
}
