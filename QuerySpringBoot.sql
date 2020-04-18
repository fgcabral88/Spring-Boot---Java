CREATE TABLE categoria
(
  id serial PRIMARY KEY,
  nome VARCHAR(20) NOT NULL
);

CREATE TABLE livro
(
  id_livro serial PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  preco DECIMAL(5,2),
  paginas INTEGER,
  codigo INTEGER,
  id_categoria INTEGER NOT NULL,
  CONSTRAINT livro_categoria_id_fkey FOREIGN KEY (id_categoria)
    REFERENCES categoria (id) MATCH SIMPLE 
    ON UPDATE NO ACTION ON DELETE NO ACTION
);

INSERT INTO categoria(nome) VALUES('RPG');

INSERT INTO livro(nome, preco, paginas, codigo, id_categoria) VALUES('Magic The Gathering Theros Beyond Death Bundle', 189.89, 0, 1, 1);
INSERT INTO livro(nome, preco, paginas, codigo, id_categoria) VALUES('Pokemon Espada E Escudo 1 Blister Triplo', 21.90, 0, 2, 1);

INSERT INTO categoria(nome) VALUES('Informática');

INSERT INTO livro(nome, preco, paginas, codigo, id_categoria) VALUES('Use A Cabeca Desenvolvendo Para Android', 199.99, 928, 3, 2);
INSERT INTO livro(nome, preco, paginas, codigo, id_categoria) VALUES('Introducao A Programacao Com Python', 73.00, 328, 4, 2);
INSERT INTO livro(nome, preco, paginas, codigo, id_categoria) VALUES('Flutter Na Pratica', 115.00, 368, 5, 2);

INSERT INTO categoria(nome) VALUES('Direito');

INSERT INTO livro(nome, preco, paginas, codigo, id_categoria) VALUES('Vade Mecum 2020 - Saraiva', 207.00, 2568, 6, 3);
INSERT INTO livro(nome, preco, paginas, codigo, id_categoria) VALUES('Pacote Anticrime Comentado - Nucci', 78.00, 150, 7, 3);

INSERT INTO categoria(nome) VALUES('Gastronomia');

INSERT INTO livro(nome, preco, paginas, codigo, id_categoria)VALUES('Hamburgueres - 50 Das Melhores Receitas', 24.90, 128, 8, 4);
INSERT INTO livro(nome, preco, paginas, codigo, id_categoria)VALUES('Culinaria Vegana Para Atletas', 65.00, 228, 9, 4);
