package com.SistemaVendas.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Categoria {

    private Integer idCategoria;
    private String nomeCategoria;
    private String descricaoCategoria;

}
