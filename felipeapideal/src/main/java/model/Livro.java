package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import model.Categoria;

import javax.persistence.*;
import java.io.Serializable;

@Slf4j
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="TB_LIVRO")
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_livro;
    private String nome;
    private double preco;
    private int paginas;
    private int codigo;
    private Categoria id;

}
