package br.com.unicsul.petshop.repository;

import br.com.unicsul.petshop.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal,  Long> {
}
