package br.com.unicsul.petshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "animais")
public class Animal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_animal", nullable = false, length = 30)
    private String nome_animal;

    @Column(name = "tipo", nullable = false, length = 30)
    private String tipo;

    @Column(name = "raca", nullable = false, length = 50)
    private String raca;

    @Column(name = "cor", nullable = false, length = 30)
    private String cor;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
