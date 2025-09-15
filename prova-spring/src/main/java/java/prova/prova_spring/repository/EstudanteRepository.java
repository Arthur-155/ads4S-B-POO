package java.prova.prova_spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.prova.prova_spring.models.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository <Estudante,Integer>{
}
