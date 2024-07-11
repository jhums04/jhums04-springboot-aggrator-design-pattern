package com.AggregatorService.AggregatorService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private String id;
    private String userId;
    private String product;

}