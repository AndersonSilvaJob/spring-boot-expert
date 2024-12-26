package io.github.dougllasfps.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemsPedidosDTO {
    private Integer produto;
    private Integer quantidade;
}
