package com.bookstore.jpa.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
//classe dos livros ≥ "modelo de livro"


@Entity
@Table(name="TB_BOOK")
public class BookModel implements Serializable {
    private static final long SerialVersionUID = 1L;

    //criando colunas da tabela TB_BOOK

    @Id //classifica o atributo como chave primarira
    @GeneratedValue(strategy = GenerationType.AUTO) //"auto-incremet"
    private UUID id;

    @Column(nullable = false, unique = true)    //propriedades da coluna, se pode ser vazia, unico...
    private String title;

    //CRIANDO RELACIONAMENTOS

    @ManyToOne  //VARIOS LIVROS PODEM TER APENAS 1 EDITORA
    @JoinColumn(name = "publisher_id")  // SERIA O REFERENCES NO SQL
    private PublisherModel publisher;

    //CRIANDO UM RELACIONAMENTOS MUITOS PARA MUITOS -> MANY TO MANY
    //VARIOS AUTORES PODEM TE PUBLICADO VARIOS LIVROS ASSIM COMO VARIOS LIVROS PODEM TER VARIOS AUTORES

    @ManyToMany
    @JoinTable(
            name = "tb_book_author",    //definie o nome da tabela auxiliar, poir é N:N
            joinColumns = @JoinColumn(name = "book_id"), //seta da sua tabela
            inverseJoinColumns = @JoinColumn(name = "author_id") //seta da outra tabela
    )
    private Set<AuthorModel> authors = new HashSet<>();


    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    private Review review;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PublisherModel getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherModel publisher) {
        this.publisher = publisher;
    }

    public Set<AuthorModel> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorModel> authors) {
        this.authors = authors;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
