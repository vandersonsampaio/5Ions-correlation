package br.ufsc.ine.ppgcc.service.interfaces;

import br.ufsc.ine.ppgcc.model.EntityMeasure;
import br.ufsc.ine.ppgcc.model.ExteriorMeasure;

import java.util.List;

public interface ICorrelationService {

    double calculate(List<EntityMeasure> entitiesMeasure, ExteriorMeasure exteriorMeasure);

    List<EntityMeasure> computeWeight(List<EntityMeasure> entitiesMeasure, ExteriorMeasure exteriorMeasure);
}
