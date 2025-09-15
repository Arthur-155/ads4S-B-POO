package java.prova.prova_spring.controller;

import org.springframework.web.bind.annotation.*;

import java.prova.prova_spring.models.Estudante;
import java.prova.prova_spring.service.EstudanteService;
import java.util.List;

@RestController
@RequestMapping("/Estudantes")
public class EstudanteController {

    private EstudanteService service;

    @PostMapping
    public Estudante criarPessoa(@RequestBody Estudante estudante){
        return service.criarEstudante(estudante);
    }

    @GetMapping
    public List<Estudante> buscarPessoa(){
        return service.buscarAlunos();
    }

    @GetMapping("/{id}")
    public Estudante buscarEstudantePorId(int id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(int id){
        service.deletarEstudante(id);
    }



}
