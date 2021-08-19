package br.ufsc.ine.ppgcc.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntityMeasure {

    private String name;
    private double weight;
    private List<SerialScore> serialTime;
}
