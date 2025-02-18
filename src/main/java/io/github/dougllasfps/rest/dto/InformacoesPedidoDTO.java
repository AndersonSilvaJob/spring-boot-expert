package io.github.dougllasfps.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InformacoesPedidoDTO {

    private Integer codigo;
    private String cpf;
    private String nome;
    private BigDecimal total;
    private String dataPedido;
    private String status;
    private List<InformacoesItemPedidoDTO> items;
}
