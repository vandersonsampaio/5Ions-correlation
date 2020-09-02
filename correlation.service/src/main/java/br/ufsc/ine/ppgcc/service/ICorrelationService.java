package br.ufsc.ine.ppgcc.service;

public interface ICorrelationService {

    double calculateCoefficient(double[] inputData, double[] externalMeasure);

    double calculateAbsCoefficient(double[] inputData, double[] externalMeasure);
}
