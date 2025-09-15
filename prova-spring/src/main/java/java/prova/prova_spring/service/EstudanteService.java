package java.prova.prova_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.prova.prova_spring.models.Estudante;
import java.prova.prova_spring.repository.EstudanteRepository;
import java.util.List;

@Service
public class EstudanteService {
    @Autowired
    private EstudanteRepository repository;

    public Estudante criarEstudante (Estudante estudante){
        return repository.save(estudante);
    }

    public List <Estudante> buscarAlunos(){
        return repository.findAll();
    }

    public Estudante buscarPorId(int id){
        return repository.findById(id).get();
    }

    public void deletarEstudante(int id){
         repository.deleteById(id);
    }
}
