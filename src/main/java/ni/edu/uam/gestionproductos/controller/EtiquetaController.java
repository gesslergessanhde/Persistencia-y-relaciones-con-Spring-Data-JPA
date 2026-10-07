// EtiquetaController.java
package ni.edu.uam.gestionproductos.controller;

import ni.edu.uam.gestionproductos.entity.Etiqueta;
import ni.edu.uam.gestionproductos.repository.EtiquetaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etiquetas")
public class EtiquetaController {

    private final EtiquetaRepository repository;

    public EtiquetaController(EtiquetaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Etiqueta> listar() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Etiqueta guardar(@RequestBody Etiqueta etiqueta) {
        return repository.save(etiqueta);
    }
}