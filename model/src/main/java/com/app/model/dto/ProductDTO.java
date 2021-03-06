package com.app.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {

    private String productName;
    private BigDecimal price;
    private String categoryName;
    private String producerName;
    private String countryName;

}
