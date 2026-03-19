package com.SistemaVendas.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Periodo {

    private Integer idPeriodo;
    private LocalDate DataPeriodo;
    private Integer DiaSemana;
    private String MesPeriodo;
    private Integer AnoPeriodo;

}
