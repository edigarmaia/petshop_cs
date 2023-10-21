package br.com.unicsul.petshop.service;

import br.com.unicsul.petshop.entity.Animal;
import br.com.unicsul.petshop.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    @Transactional
    public Animal salvar(Animal animal){
        return animalRepository.save(animal);
    }
}
