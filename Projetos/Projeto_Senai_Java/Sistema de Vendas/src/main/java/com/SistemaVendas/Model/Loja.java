package com.SistemaVendas.Model;

import org.w3c.dom.Text;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Loja {

    private Integer idLoja;
    private String NomeLoja;
    private String Telefone;
}
