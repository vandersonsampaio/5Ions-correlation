package br.ufsc.ine.ppgcc.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExteriorMeasure {

    private String name;
    private List<SerialScore> serialTime;
}
