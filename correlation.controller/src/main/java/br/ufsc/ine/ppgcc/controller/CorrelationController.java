package br.ufsc.ine.ppgcc.controller;

import br.ufsc.ine.ppgcc.model.EntityMeasure;
import br.ufsc.ine.ppgcc.model.ExteriorMeasure;
import br.ufsc.ine.ppgcc.service.interfaces.ICorrelationService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "correlation", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class CorrelationController {

    private final ICorrelationService service;

    public CorrelationController(ICorrelationService service){
        this.service = service;
    }

    @GetMapping(value = "calculate")
    public ResponseEntity<Double> calculateCoefficient(List<EntityMeasure> entitiesMeasure, ExteriorMeasure exteriorMeasure) {
        return ResponseEntity.ok(service.calculate(entitiesMeasure, exteriorMeasure));
    }

    @GetMapping(value = "compute-weight")
    public ResponseEntity<List<EntityMeasure>> computeWeight(List<EntityMeasure> entitiesMeasure, ExteriorMeasure exteriorMeasure){
        return ResponseEntity.ok(service.computeWeight(entitiesMeasure, exteriorMeasure));
    }
}
