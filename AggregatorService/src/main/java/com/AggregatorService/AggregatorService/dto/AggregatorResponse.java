package com.AggregatorService.AggregatorService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregatorResponse {

    private UserDTO userDTO;
    private List<OrderDTO> orders;
}
