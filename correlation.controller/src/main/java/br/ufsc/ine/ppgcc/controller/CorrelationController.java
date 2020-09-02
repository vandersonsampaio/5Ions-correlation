package br.ufsc.ine.ppgcc.controller;

import br.ufsc.ine.ppgcc.service.ICorrelationService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("correlation")
public class CorrelationController {

    private final ICorrelationService service;

    public CorrelationController(ICorrelationService service){
        this.service = service;
    }

    @PostMapping(path = "coefficient", produces = MediaType.APPLICATION_JSON_VALUE)
    public double calculateCoefficient(double[] inputData, double[] externalMeasure) {
        return service.calculateAbsCoefficient(inputData, externalMeasure);
    }
}
