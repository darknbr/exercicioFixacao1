package br.com.mentorama.exercicioFixacao1;
/*
* Implemente os métodos para lidar com as operações CRUD usando as anotações
* @GetMapping,
* @PostMapping,
* @PutMapping e
* @DeleteMapping.
* */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final List<Tarefa> tarefas;

    public TarefaController() {
        this.tarefas = new ArrayList<>();
    }

    @GetMapping
    public List<Tarefa> buscar(@RequestParam(required = false) String tarefa ){
        if(tarefa != null){
            return tarefas.stream()
                    .filter(m -> m.getDescricao().contains(tarefa))
                    .collect(Collectors.toList());
        }
        return tarefas;
    }

    @PostMapping
    public ResponseEntity <Integer> cadastrarTarefa (@RequestBody final Tarefa tarefa){
        if(tarefa.getId() == null){
            tarefa.setId(tarefa.getId() + 1);
        }
        tarefas.add(tarefa);
        return new ResponseEntity<>(tarefa.getId(), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity atualizarTarefa (@RequestBody final Tarefa tarefa){
        tarefas.stream().filter(m -> m.getId().equals(tarefa))
                .forEach(m -> m.setDescricao(tarefa.getDescricao()));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        tarefas.removeIf(m -> m.getId().equals(id));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
