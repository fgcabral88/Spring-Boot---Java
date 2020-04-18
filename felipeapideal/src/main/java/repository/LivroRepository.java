package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Livro;

public interface LivroRepository extends JpaRepository <Livro, Integer> {

    Livro findById(int id);
}
