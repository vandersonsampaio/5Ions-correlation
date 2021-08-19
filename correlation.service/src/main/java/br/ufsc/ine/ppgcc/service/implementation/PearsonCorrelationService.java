package br.ufsc.ine.ppgcc.service.implementation;

import br.ufsc.ine.ppgcc.model.EntityMeasure;
import br.ufsc.ine.ppgcc.model.ExteriorMeasure;
import br.ufsc.ine.ppgcc.model.SerialScore;
import br.ufsc.ine.ppgcc.service.interfaces.ICorrelationService;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PearsonCorrelationService implements ICorrelationService {

    @Override
    public double calculate(List<EntityMeasure> entitiesMeasure, ExteriorMeasure exteriorMeasure) {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        double[] exteriorArray = exteriorMeasure.getSerialTime().stream()
                .mapToDouble(SerialScore::getScore).toArray();
        List<SerialScore> scores = new ArrayList<>();

        for(EntityMeasure entity : entitiesMeasure){
            double weight = entity.getWeight();

            scores.addAll(entity.getSerialTime().stream().map(s -> SerialScore.builder()
                    .timestamp(s.getTimestamp())
                    .score(s.getScore() * weight).build())
                    .collect(Collectors.toList()));
        }

        List<Date> dates = scores.stream().map(SerialScore::getTimestamp).collect(Collectors.toList());

        for(Date date : dates) {

        }

        return pearsonsCorrelation.correlation(exteriorArray, exteriorArray);
    }

    @Override
    public List<EntityMeasure> computeWeight(List<EntityMeasure> entitiesMeasure, ExteriorMeasure exteriorMeasure) {
        return entitiesMeasure;
    }
}
