package br.ufsc.ine.ppgcc.service;

import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;

import org.springframework.stereotype.Service;

@Service
public class PearsonCorrelationService implements ICorrelationService {

    @Override
    public double calculateCoefficient(double[] inputData, double[] externalMeasure) {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();

        return Math.abs(pearsonsCorrelation.correlation(inputData, externalMeasure));
    }

    @Override
    public double calculateAbsCoefficient(double[] inputData, double[] externalMeasure) {
        return Math.abs(calculateCoefficient(inputData, externalMeasure));
    }
}
