package br.ufsc.ine.ppgcc.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SerialScore {

    private Date timestamp;
    private double score;
}
