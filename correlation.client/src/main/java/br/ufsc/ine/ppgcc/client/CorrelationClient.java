package br.ufsc.ine.ppgcc.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient
public interface CorrelationClient {

    @PostMapping(path = "correlation/coefficient", produces = MediaType.APPLICATION_JSON_VALUE)
    double calculateCoefficient(double[] inputData, double[] externalMeasure);
}
